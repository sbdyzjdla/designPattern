package com.designpattern.creational_pattern.factory_method.after;

public interface ShipFactory {

    default Ship orderShip(String name, String email) {
        validate(name, email);
        prepareFor(name);
        Ship ship = createShip();
        sendEmailTo(email, ship);
        return ship;
    }
    //default 메소드나 private 메소드로 정의하지 않았기 때문에 반드시 하위클래스에서 정의해야함
    Ship createShip();

    //인터페이스 내에서만 사용가능한 메서드
    private void validate(String name, String email) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("연락처를 남겨주세요.");
        }
    }

    private static void prepareFor(String name)
    {
        System.out.println(name + " 만들 준비 중");
    }

    private static void sendEmailTo(String email, Ship ship)
    {
        System.out.println(ship.getName() + " 다 만들었습니다.");
    }

}
