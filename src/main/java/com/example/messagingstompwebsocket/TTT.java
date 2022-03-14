package com.example.messagingstompwebsocket;

public class TTT {
//Two proporties. One is the tictactoe grid and the other is a constant
  private static String[] tictactoeGrid = new String[9];
  private String content;

  public TTT() {//Tictactoe constructer
    System.out.println();
    System.out.println("MAAAAAAANNNNNNNAAAAAS! no string");
    System.out.println();
  }

  public TTT(String content) {//Constructer when string is specified
    System.out.println();
    System.out.println("STTTRING    MAAAAAAANNNNNNNAAAAASSSSS! " + content);
    System.out.println();
    System.out.println(grid() + content);
    System.out.print(content + content.length());
    System.out.print(grid().toString());
    
    this.content = content;
  }

  public String getContent() {
    return content;
  }

  public static String[] grid(){//Makes tictactoe grid
    for(int i = 0; i < tictactoeGrid.length; i++){
      tictactoeGrid[i] = i + "";
    }
    System.out.println();
    return tictactoeGrid;
  }

  public static void importMethod(){
    int num = 4;
    //Made num a constant //Integer. parseInt(HtmlUtils.htmlEscape(message.getName()));
    
    if(num*0 == 0){
      if(num <= 9){
        drawBoard(num);
        Player p1 = new Player(1);
        Player p2 = new Player(2);
      }
    }
  }
    public static void drawBoard(int num){
    String[][] board = new String[num][num];
    for(int i = 0; i < board.length; i++){
      System.out.println();
      for(int j = 0; j < board[i].length; j++){
        System.out.print("|------|");
      }
    }
  }
}