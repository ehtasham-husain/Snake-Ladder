package com.snakeladder;

public class PlaySnakeLadder {
    int player1_Position = 0;

    public void RollsDice(){
        double diceNum = Math.floor(Math.random() *10)%7;
        System.out.println(diceNum);
    }
    public static void main(String[] args) {
        PlaySnakeLadder playSnakeLadder = new PlaySnakeLadder();
        playSnakeLadder.RollsDice();

    }
}
