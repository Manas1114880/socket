
package com.example.messagingstompwebsocket;

public class Greeting {

  private String content;

  public Greeting() {
  }

  public Greeting(String content) {
    System.out.println("I AM GREETING!!!!");
    this.content = content;
  }

  public String getContent() {
    return content;
  }

}