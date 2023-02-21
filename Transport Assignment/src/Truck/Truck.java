package Truck;

import Vehicle.Vehicle;

public class Truck extends Vehicle{
    private String Airconditioning;
    private String HandBrake;
    private String sound;
    private String engine;
    private String container;

    public Truck(String model, String make, int numberOfWheels, int topSpeed, String airconditioning,
    String handBrake, String sound, String engine, String container) {
        super(model, make, numberOfWheels, topSpeed);
        Airconditioning = airconditioning;
        HandBrake = handBrake;
        this.sound = sound;
        this.engine = engine;
        this.container = container;
    }
    public Truck(){
    }
    public String getAirconditioning() {
        return Airconditioning;
    }
    public void setAirconditioning(String airconditioning) {
        Airconditioning = airconditioning;
    }
    public String getHandBrake() {
        return HandBrake;
    }
    public void setHandBrake(String handBrake) {
        HandBrake = handBrake;
    }
    public String getSound() {
        return sound;
    }
    public void setSound(String sound) {
        this.sound = sound;
    }
    public String getEngine() {
        return engine;
    }
    public void setEngine(String engine) {
        this.engine = engine;
    }
    public String getContainer() {
        return container;
    }
    public void setContainer(String container) {
        this.container = container;
    }

    public void openContainer(){
        this.setContainer("open");
        System.out.println("The container is open.");
    }

    public void accelerate(){
        this.setSound("Vroom");
        System.out.println(this.getSound());
        System.out.println( this.getModel() +" "+ this.getMake() + " is accelerating");
        
    }
    public void handBrake(){
        if(this.getHandBrake() == "off"){
            this.setHandBrake("on");
            System.out.println("The handbrake is on.");
        }
        else{
            this.setHandBrake("off");
            System.out.println("The handbrake is off.");
        }


    }


}
