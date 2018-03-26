package cn.hualuomoli.mp.nideshop.config.mvc.support;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LogInterceptor extends HandlerInterceptorAdapter {

  private static final Logger logger = LoggerFactory.getLogger(LogInterceptor.class);

  private static final String TAB = "  ";

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
    if (logger.isDebugEnabled()) {
      this.showRequestInformation(request);
    }
    return true;
  }

  /** 输出请求信息 */
  private void showRequestInformation(HttpServletRequest req) {
    // show request
    logger.debug("request message");
    logger.debug(TAB + "characterEncoding {}", req.getCharacterEncoding());
    logger.debug(TAB + "contextPath {}", req.getContextPath());
    logger.debug(TAB + "servletPath {}", req.getServletPath());
    logger.debug(TAB + "requestedSessionId {}", req.getRequestedSessionId());
    logger.debug(TAB + "url {}", req.getRequestURL());
    logger.debug(TAB + "uri {}", req.getRequestURI());
    logger.debug(TAB + "method {}", req.getMethod());
    logger.debug(TAB + "headers");
    Enumeration<String> headerNames = req.getHeaderNames();
    while (headerNames.hasMoreElements()) {
      String name = headerNames.nextElement();
      logger.debug(TAB + TAB + "{} = {}", name, req.getHeader(name));
    }
    logger.debug(TAB + "parameters");
    Enumeration<String> parameterNames = req.getParameterNames();
    while (parameterNames.hasMoreElements()) {
      String name = parameterNames.nextElement();
      String[] values = req.getParameterValues(name);
      logger.debug(TAB + TAB + "{} = {}", name, values);
    }
  }

}
