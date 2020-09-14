package com.twu;

/**
 * @Author: xqc
 * @Date: 2020/9/14 - 09 - 14 - 12:10
 * @Description: com.twu
 * @version: 1.0
 */
public class BowlingGame {
    private int[] rolls = new int[21];
    private int index = 0;
    public void roll(int pins){
        rolls[index++]=pins;
    }

    public int score() {

        return  0;
    }
}
