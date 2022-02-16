package com.example.messagingstompwebsocket;

public class Meeting {

  private static String[] tictactoeGrid = new String[9];

  private String content;

  public Meeting() {
  }

  public Meeting(String content) {
    System.out.println(grid() + content);
    System.out.print(content + content.length());
    System.out.print(grid().toString());
    
    this.content = content;
  }

  public String getContent() {
    return content;
  }

  public static String[] grid(){
    for(int i = 0; i < tictactoeGrid.length; i++){
      tictactoeGrid[i] = i + "";
    }
    return tictactoeGrid;
  }
}