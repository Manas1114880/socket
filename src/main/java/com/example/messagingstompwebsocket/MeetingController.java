
package com.example.messagingstompwebsocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class MeetingController {

  @MessageMapping("/jello")
  @SendTo("/topic/meetings")
  public Meeting greeting(HelloMessage message) throws Exception {
    System.out.println("?????????");
    Thread.sleep(10); // simulated delay
    return new Meeting("Jellowwwww, " + HtmlUtils.htmlEscape(message.getName()) + "!");
    if(Integer.parseInt(HtmlUtils.htmlEscape(message.getName()))) {
      if (Integer.parseInt(HtmlUtils.htmlEscape(message.getName())) >= 0
          && Integer.parseInt(HtmlUtils.htmlEscape(message.getName())) <= 9) {

      }
    }
  }
}