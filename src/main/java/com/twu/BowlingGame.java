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
        int score = 0;
        int frameIndex = 0;
        for (int frame = 0; frame < 10; frame++){
            //判断是否为全部中
            if (isStrike(frameIndex)){
                   score += 10 + rolls[frameIndex + 1] + rolls[frameIndex + 2];
                   frameIndex++;
            }
            else
            {
                score += rolls[frameIndex] + rolls[frameIndex+1];
                frameIndex += 2;
            }
        }
         return score;
    }

    private boolean isStrike(int frameIndex) {
        return rolls[frameIndex] == 10;
    }
}
