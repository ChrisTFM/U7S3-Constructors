package com.codedifferently.labs.partA;


import partA.Player;

import static partA.PlayerTest.setFields;

public class PlayerTest {
    public static void main(String[] args){
        Player newPlayer = setFields("john", 1.2, 2);

        System.out.println(newPlayer.name);
        System.out.println(newPlayer.height);
        System.out.println(newPlayer.yearsInLeague);
    }

}
