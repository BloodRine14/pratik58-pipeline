package com.pratik58;

import com.pratik58.model.LotteryType;
import com.pratik58.model.TicketType;

import java.util.ArrayList;
import java.util.List;

public class LotteryService {
    public List availableLottery(LotteryType type, TicketType ticket){
        List lottery = new ArrayList<>();
        if(type.equals(LotteryType.Fire) && ticket.equals(TicketType.One)){
            lottery.add("You have a chance to win Mercedez.");
            lottery.add("Number of tickets bought: 1");
        } else if(type.equals(LotteryType.Fire) && ticket.equals(TicketType.Two)){
            lottery.add("You have a chance to win Subaru.");
            lottery.add("Number of tickets bought: 2");
        } else if(type.equals(LotteryType.Fire) && ticket.equals(TicketType.Three)){
            lottery.add("You have a chance to win Toyota.");
            lottery.add("Number of tickets bought: 3");
        } else if(type.equals(LotteryType.Water) && ticket.equals(TicketType.One)){
            lottery.add("You have a chance to win Ford.");
            lottery.add("Number of tickets bought: 1");
        } else if(type.equals(LotteryType.Water) && ticket.equals(TicketType.Two)){
            lottery.add("You have a chance to win Tesla.");
            lottery.add("Number of tickets bought: 2");
        } else if(type.equals(LotteryType.Water) && ticket.equals(TicketType.Three)){
            lottery.add("You have a chance to win Hyundai.");
            lottery.add("Number of tickets bought: 3");
        } else if(type.equals(LotteryType.Thunder) && ticket.equals(TicketType.One)){
            lottery.add("You have a chance to win Dodge.");
            lottery.add("Number of tickets bought: 1");
        } else if(type.equals(LotteryType.Thunder) && ticket.equals(TicketType.Two)){
            lottery.add("You have a chance to win Aston Martin.");
            lottery.add("Number of tickets bought: 2");
        } else if(type.equals(LotteryType.Thunder) && ticket.equals(TicketType.Three)){
            lottery.add("You have a chance to win Nissan.");
            lottery.add("Number of tickets bought: 3");
        } else {
            lottery.add("No Lottery!");
        }
        return lottery;
    }
}
