package cn.hualuomoli.mp.nideshop.api.util;

import java.lang.reflect.Method;
import java.util.Map;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.google.common.collect.Maps;

@Aspect
@Component(value = "cn.hualuomoli.mp.nideshop.api.util.CacheAspect")
@Order(value = Integer.MAX_VALUE)
public class CacheAspect {

  private static final Logger logger = LoggerFactory.getLogger(CacheAspect.class);

  private static final Map<String, Object> CONTENT_MAP = Maps.newHashMap();

  @Pointcut(value = "execution(* cn.hualuomoli.mp.nideshop.api..*.controller..*.*(..))")
  public void pointcut() {
  }

  @Around(value = "pointcut()")
  public Object arount(ProceedingJoinPoint joinPoint) throws Throwable {
    logger.debug("进入缓存切面");

    // 参数
    Object[] args = joinPoint.getArgs();
    MethodSignature signature = (MethodSignature) joinPoint.getSignature();
    Method method = signature.getMethod();
    Cache cache = method.getAnnotation(Cache.class);
    if (cache == null) {
      return joinPoint.proceed(args);
    }

    //获取目标对象对应的类名  
    String className = joinPoint.getTarget().getClass().getName();
    //获取目标对象上正在执行的方法名  
    String methodName = method.getName();
    // key
    String key = className + "." + methodName;

    Object content = CONTENT_MAP.get(key);
    if (content != null) {
      logger.info("方法 {} 使用缓存", method);
      return content;
    }

    content = joinPoint.proceed(args);
    CONTENT_MAP.put(key, content);
    return content;
  }

}
