package com.example.messagingstompwebsocket;

import java.util.*;

public class Player {

  private String name;
  private Symbol symbol;
  private int num;
  private Scanner scan = new Scanner(System.in);
  private String[] players = new String[2];

  public Player(int num) {
    this.name = name;
    this.symbol = symbol;
  }
  public String getPlayerName(int num){
    System.out.print("Player " + num + " enter your name: ");
    return scan.next();
  }
}