package lab_9_tasks;/*Create a multilevel inheritance hierarchy with a parent interface vehicle containing methods accelerate
and decelerate, private properties: color, weight, model, with their setter and getters. Then the
sub interfaces Bus, Truck, Car further extending classes SchoolBus, HondaCar, VigoTruck, with their
implementation respectively.*/

interface Vehicle{}
interface Car {
    public void accelerate(float speed);
    public void decelerate(float speed);
}
interface Truck{
    public void accelerate(float speed);
    public void decelerate(float speed);
}
interface Bus {
    public void accelerate(float speed);
    public void decelerate(float speed);
}
class Corolla implements Car{
    private String color;
    private String regNo;
    private String engineNo;
    private float speed;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getEngineNo() {
        return engineNo;
    }

    public void setEngineNo(String engineNo) {
        this.engineNo = engineNo;
    }

    public float getSpeed() {
        return speed;
    }

    public float setSpeed(float speed) {
        this.speed = speed;
        return speed;
    }
    @Override
    public void accelerate(float speed) {
        speed=this.speed;
        System.out.println("Car is accelerating with speed of "+speed);
    }

    @Override
    public void decelerate(float speed) {
        speed=this.speed;
        System.out.println("Car is decelerating with speed of "+speed);
    }
}
class SchoolBus implements Bus{
    private String color;
    private String regNo;
    private String engineNo;
    private float speed;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getEngineNo() {
        return engineNo;
    }

    public void setEngineNo(String engineNo) {
        this.engineNo = engineNo;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }
    @Override
    public void accelerate(float speed) {
        speed=this.speed;
        System.out.println("Bus is accelerating with speed of "+speed);
    }

    @Override
    public void decelerate(float speed) {
        speed=this.speed;
        System.out.println("Bus is decelerating with speed of "+speed);
    }
}
class Rangeen implements Truck{
    private String color;
    private String regNo;
    private String engineNo;
    private float speed;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getEngineNo() {
        return engineNo;
    }

    public void setEngineNo(String engineNo) {
        this.engineNo = engineNo;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    @Override
    public void accelerate(float speed) {
        speed=this.speed;
        System.out.println("Truck is accelerating with speed of "+speed);
    }

    @Override
    public void decelerate(float speed) {
        speed=this.speed;
        System.out.println("Truck is decelerating with speed of "+speed);
    }
}
public class Main {
    public static void main(String[] args) {
        Corolla corolla=new Corolla();
        corolla.accelerate(corolla.setSpeed(123.4f));
    }
}