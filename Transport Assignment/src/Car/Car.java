package Car;

import Vehicle.Vehicle;

public class Car extends Vehicle{
    private String Airconditioning;
    private String HandBrake;
    private String sound;
    private String engine;
    
  
    public Car(String model, String make, int numberOfWheels, int topSpeed, String airconditioning,
    String handBrake, String sound, String engine) {
        super(model, make, numberOfWheels, topSpeed);
        this.Airconditioning = airconditioning;
        this.HandBrake = handBrake;
        this.sound = sound;
        this.engine = engine;
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
    
    public void accelerate(){
        this.setSound("Vroom vroom vroom vroom");
        System.out.println(this.getSound());
        System.out.println( this.getModel() +" "+ this.getMake() + " is accelerating");
        
    }
    public void Brake(){
        this.setSound("SCREEEEEECH!");
        System.out.println(this.getSound());
        System.out.println(this.getModel() +" "+ this.getMake() +" is braking.");
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
