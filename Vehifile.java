package Vehiclepack;
abstract class VehicleClassifier
{
    abstract void start();
    abstract void stop();
}
class Car extends VehicleClassifier
{
    void start()
    {
        System.out.println("BMW Started");
    }
    void stop()
    {
        System.out.println("BMW Stoped");
    }
}
class Motorcycle extends VehicleClassifier
{
    void start()
    {
        System.out.println("eng  Started");
    }
    void stop()
    {
        System.out.println("bike Stoped");
    }
}
public class Vehifile {
    public static void main(String[] args) 
    {
    	Car car=new Car();
        car.start();
        car.stop();
        Motorcycle motorcycle=new Motorcycle();
        motorcycle.start();
        motorcycle.stop();
    }}

