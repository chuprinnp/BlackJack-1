package com.company;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Table t = new Table(Player);
        t.makeBets();
        t.dealCards();
        t.game();
        t.whoWins();
        t.dengiLebowski();
        t.resetCards();

        List<Player> players = new LinkedList<>();
        players.add(new Computer("comp1",new LimitIntellect(14)));
        players.add(new Computer("comp2",new LimitIntellect(20)));
        players.add(new Human("Human"));
        Dealer dealer = new Dealer();
        players.add(dealer);





        }
    }
}
