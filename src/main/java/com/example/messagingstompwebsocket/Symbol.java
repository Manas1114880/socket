package com.example.messagingstompwebsocket;

import java.util.*;

public class Symbol {
  private String x;
  private String o;
  private String sybl;

  public Symbol() {
    //Asks player to enter symbol
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a symbol: ");
    this.sybl = scan.next();
  }

  public Symbol(String x, String o) {
    this.x = "X";
    this.o = "O";
  }

  public String getO() {
    return o;
  }

  public String getX() {
    return x;
  }

  @Override
  public String toString() {
    return sybl;
  }
}