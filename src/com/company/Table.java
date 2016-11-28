package com.company;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by student1 on 28.11.16.
 */
public class Table {
    Dealer dealer;
    List<Player> players;
    public Table(){
        players = new LinkedList<>();
        players.add(new Computer("comp1",new LimitIntellect(14)));
        players.add(new Computer("comp2",new LimitIntellect(20)));
        players.add(new Human("Human"));
        Dealer dealer = new Dealer();
        players.add(dealer);

    };

    public void dealCards() {
        for (Player player : players) {
            dealer.deal(player);
            dealer.deal(player);
            System.out.println(player.hand);
        }
    }


    public void game() {
        for (Player player : players) {
            while (true) {
                System.out.println(player.name + " " + player.hand.getScore()
                        + ": " +
                        player.hand);
                Command command = player.decision();
                if (command == Command.STAND)
                    break;
                if (command == Command.HIT)
                    dealer.deal(player);
            }
        }
    }
}
