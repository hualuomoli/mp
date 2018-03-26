package cn.hualuomoli.mp.nideshop.push.controller;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.lf5.util.StreamUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.hualuomoli.mp.nideshop.push.config.PushConfig;

@RequestMapping(value = "/push")
@Controller(value = "cn.hualuomoli.mp.push.PushController")
public class PushController {

  private static final Logger logger = LoggerFactory.getLogger(PushController.class);

  // 验证服务器地址有效性
  @RequestMapping(value = "/valid")
  public void valid(InvalidRequest req, HttpServletRequest request, HttpServletResponse response) throws IOException {
    logger.info("微信认证服务器信息req={}", req);
    String origin = new StringBuilder().append(req.getNonce()).append(req.getTimestamp()).append(PushConfig.TOKEN).toString();
    String signature = DigestUtils.sha1Hex(origin.getBytes());
    logger.debug("计算的签名signature={}", signature);

    boolean success = StringUtils.equals(signature, req.getSignature());
    logger.info("认证成功吗{}", success);
    //    if (success) {
    response.getWriter().write(req.getEchostr());
    //    } else {
    //      response.getWriter().write("invalid");
    //    }
  }

  // 微信通知信息
  @RequestMapping(value = "/message")
  public void message(HttpServletRequest request, HttpServletResponse response) throws IOException {
    Enumeration<String> names = request.getParameterNames();
    while (names.hasMoreElements()) {
      String name = (String) names.nextElement();
      logger.debug("微信通知信息{}={}", name, request.getParameter(name));
    }

    ServletInputStream is = request.getInputStream();
    if (is != null) {
      logger.debug("微信通知信息={}", new String(StreamUtils.getBytes(is), "UTF-8"));
    }
    // end
  }

}
