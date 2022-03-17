package com.designpattern.creational_pattern.factory_method.after;

import com.designpattern.creational_pattern.factory_method.after.Ship;

public class Client {

    public static void main(String[] args) {
        /*  기존
        Ship whiteship = ShipFactory.orderShip("Whiteship", "keesun@mail.com");
        System.out.println(whiteship);
        */

        // 변경후  확장에 열려있고 변경에 닫혀있는 코드
        Ship whiteShip = new WhiteShipFactory().orderShip("whiteship", "aaaa@gmail.com");
        System.out.println(whiteShip);

        Ship blackShip = new BlackShipFactory().orderShip("blackship", "bbbb@gmail.com");
        System.out.println(blackShip);
    }

}
