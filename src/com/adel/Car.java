package com.adel;

public class Car extends Transport{
    public Car(String model,float speed,int weight,String color,byte[] coordinate) {
       super(model,speed, weight, color, coordinate);
    }

    @Override
    protected String getValues() {
        System.out.println(super.getValues());
        return super.getValues();


    }

    @Override
    public void moveObject(float speed) {
        System.out.println("Our object is moving at a speed of : "+ speed);

    }
}
