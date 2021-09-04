package com.pratik58;

import com.pratik58.model.LotteryType;

import java.util.ArrayList;
import java.util.List;

public class LotteryService {
    public List availableLottery(LotteryType type){
        List lottery = new ArrayList<>();
        if(type.equals(LotteryType.Fire)){
            lottery.add("You have a chance to win Mercedez.");
            lottery.add("Number of tickets bought: 1");
        }  else if(type.equals(LotteryType.Water)){
            lottery.add("You have a chance to win Ford.");
            lottery.add("Number of tickets bought: 2");
        } else if(type.equals(LotteryType.Thunder)){
            lottery.add("You have a chance to win Ford.");
            lottery.add("Number of tickets bought: 2");
        }
        else {
            lottery.add("No Lottery!");
        }
        return lottery;
    }
}
