package cn.hualuomoli.mp.nideshop.api.util;

import java.lang.reflect.Method;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

// 权限
@Aspect
@Component(value = "cn.hualuomoli.mp.nideshop.api.util.AuthAspect")
@Order(value = Integer.MIN_VALUE)
public class AuthAspect {

  private static final Logger logger = LoggerFactory.getLogger(AuthAspect.class);

  @Pointcut(value = "execution(* cn.hualuomoli.mp.nideshop.api..*.controller..*.*(..))")
  public void pointcut() {
  }

  @Around(value = "pointcut()")
  public Object arount(ProceedingJoinPoint joinPoint) throws Throwable {

    logger.debug("进入权限认证切面");

    // 参数
    Object[] args = joinPoint.getArgs();
    // 目标类
    Object target = joinPoint.getTarget();
    // 目标方法
    MethodSignature signature = (MethodSignature) joinPoint.getSignature();
    Method method = signature.getMethod();

    // 获取是否需要权限认证
    Auth auth = target.getClass().getAnnotation(Auth.class);
    if (auth == null) {
      auth = method.getAnnotation(Auth.class);
    }

    // 需要权限认证
    if (auth != null) {
      Integer currentUserId = ApiUtils.getCurrentUserId();
      if (currentUserId == null) {
        return ApiUtils.noAuth();
      }
    }

    return joinPoint.proceed(args);
  }

}
