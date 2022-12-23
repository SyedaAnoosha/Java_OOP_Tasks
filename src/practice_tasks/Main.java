package practice_tasks;

class Car{

    //attributes
    private String model;
    private long price;
    private String color;
    private String carType;
    private byte capacity;

    //setters
    public void setModel(String m1){
        model=m1;
    }
    public void setColor(String c1){
        color=c1;
    }
    public void setPrice(long p1){
        price=p1;
    }
    public void setCarType(String ct){
        carType=ct;
    }
    public void setCapacity(byte c){
        capacity=c;
    }

    //getters
    public long getPrice(){
        return price;
    }
    public String getColor() {
       return color;
    }
    public String getModel() {
        return model;
    }
    public String getCarType(){
        return carType;
    }
    public byte getCapacity(){
        return capacity;
    }


    //display
    public void display(){
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Model: " + model);
        System.out.println("Car Type: "+ carType);
        System.out.println("Capacity: "+ capacity);
    }
}
public class Main {
    public static void main(String[] args) {
       Car C1= new Car();
       C1.setColor("Black");
       C1.setPrice(1000000);
       C1.setModel("Civic");
       C1.setCarType("Sedan");
      // C1.setCapacity(5);
       System.out.println("Color: " + C1.getColor());
       System.out.println("Price: " + C1.getPrice());
       System.out.println("Model: " + C1.getModel());
       System.out.println("Car Type: "+ C1.getCarType());
       System.out.println("Capacity: "+ C1.getCapacity());
       C1.display();
    }
}