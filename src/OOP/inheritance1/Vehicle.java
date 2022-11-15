package OOP.inheritance1;

public class Vehicle {
 protected String model;
 int year;
 public String brand;

 public Vehicle(String model, int year, String brand) {
  this.model = model;
  this.year = year;
  this.brand = brand;
 }

  void drive(){
  System.out.println("Vechicle is moving");
 }

 public static Boolean stop(boolean b1){
  System.out.println("Vehicle stops");
  return true;
 }

 protected  boolean start(){
  System.out.println("vecile is starting");
  return true;
 }

 Object accelerate() {
  System.out.println("From Vehicle Class");
  return  new Vehicle("corolla", 2022,"Toyota");
 }


}
