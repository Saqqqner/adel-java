package com.adel;


public class Main {

    public static void main(String[] args) {
//        Car car =new Car("Bmw-I8",250.5f,2500,"Blue", new byte[]{1, 2, 4});
        Car bmw = new Car("I8",250.5f,2000,"Black",new byte[]{2,5,8});
        Truck truck=new Truck("Volvo-S5343",5000,new byte[]{1,2,1});
        bmw.getValues();
        bmw.moveObject(250.5f);
        bmw.getValues();
        truck.setValues("Volvo-S5343",250.5f,5000,"Blue", new byte[]{1,2,1},true);
        System.out.println(truck.getValues());
        System.out.println("Help!!!");







}



    }


