package com.adel;

public abstract class Transport {
    private String model;
    private float speed;
    private int weight;
    private String color;
    private byte[] coordinate;

    public Transport(){}

    public Transport(String model,float speed,int weight,String color,byte[] coordinate) {
        System.out.println("Object created");
        setValues(model,speed, weight, color, coordinate);
//        System.out.println(getValues());


    }
    public Transport(String model,int weight,byte[] coordinate){
        this.model=model;
        this.weight=weight;
        this.coordinate=coordinate;
//        System.out.println(getValues());

    }

    public abstract void moveObject(float speed);

    protected void setValues(String model,float speed,int weight,String color,byte[] coordinate){
        this.model=model;
        this.speed=speed;
        this.weight=weight;
        this.color=color;
        this.coordinate=coordinate;
    }
    protected String getValues(){
        String info= "Object model : " + model + ".  Object speed : " + speed  + ".  Object weight : " + weight + ".  Object color : " +color + ".\n";
        String infoCoordinates="Coordinates:\n";
        for(int i=0;i<coordinate.length;i++)
            infoCoordinates += coordinate[i] + "\n";

        return info + infoCoordinates;


    }

}
