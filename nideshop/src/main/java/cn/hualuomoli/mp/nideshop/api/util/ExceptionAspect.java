package cn.hualuomoli.mp.nideshop.api.util;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

// 异常
@Aspect
@Component(value = "cn.hualuomoli.mp.nideshop.api.util.ExceptionAspect")
@Order(value = 1)
public class ExceptionAspect {

  private static final Logger logger = LoggerFactory.getLogger(ExceptionAspect.class);

  @Pointcut(value = "execution(* cn.hualuomoli.mp.nideshop.api..*.controller..*.*(..))")
  public void pointcut() {
  }

  @Around(value = "pointcut()")
  public Object arount(ProceedingJoinPoint joinPoint) throws Throwable {

    logger.debug("进入异常切面");

    try {
      return joinPoint.proceed(joinPoint.getArgs());
    } catch (Throwable t) {
      if (RuntimeException.class.isAssignableFrom(t.getClass())) {
        return ApiUtils.error(t);
      }
      throw t;
    } finally {
    }
    // end
  }

}
