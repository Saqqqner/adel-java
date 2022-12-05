package com.adel;

public class Truck extends Transport {
    private boolean isLoaded;

    public Truck (String model,int weight,byte[] coordinate) {
        super( model,weight, coordinate);

    }


    public Truck (String model,int weight,byte[] coordinate,boolean isLoaded){
        super(model,weight, coordinate);
        this.isLoaded=isLoaded;
    }

    @Override
    public void moveObject(float speed) {
        System.out.println("Our object is moving at a speed of : "+ speed);

    }


    public void setValues(String model,float speed,int weight,String color,byte[] coordinate,boolean isLoaded){
        super.setValues(model,speed,weight,color,coordinate);
        this.isLoaded=isLoaded;
    }

    @Override
    protected String getValues() {
        System.out.println(super.getValues());
        return getLoaded();
    }

    public void setLoaded(boolean loaded) {
        isLoaded = loaded;
    }
    public String getLoaded(){
        if(isLoaded)
            return"Truck loaded";
        else
            return "Truck not loaded";
    }

}
