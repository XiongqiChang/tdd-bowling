package com.twu;

/**
 * @Author: xqc
 * @Date: 2020/9/14 - 09 - 14 - 12:10
 * @Description: com.twu
 * @version: 1.0
 */
public class BowlingGame {
    private int[] lineThrows = new int[21];
    private int round = 0;
    public void throwBowling(int bowDown){
        lineThrows[round++]=bowDown;
    }

    public int score() {
        int score = 0;
        int roundIndex = 0;
        for (int frame = 0; frame < 10; frame++){

            if (isStrike(roundIndex)){
                   score += 10 + getStrikeScore(roundIndex);
                   roundIndex++;
            } else if(isSpare(roundIndex)){
                   score += 10 +getSpareScore(roundIndex);
                   roundIndex += 2;
            }else {
                   score += getMissScore(roundIndex);
                   roundIndex += 2;
            }
        }
         return score;
    }

    private boolean isSpare(int frameIndex) {
        return lineThrows[frameIndex] + lineThrows[frameIndex +1] == 10;
    }

    private boolean isStrike(int frameIndex) {
        return lineThrows[frameIndex] == 10;
    }

    private int getStrikeScore(int frameIndex){
        return  lineThrows[frameIndex + 1] + lineThrows[frameIndex + 2];
    }

    private int getSpareScore(int frameIndex){
        return   lineThrows[frameIndex + 2];
    }

    private int getMissScore(int frameIndex){
        return lineThrows[frameIndex] + lineThrows[frameIndex+1];
    }
}
