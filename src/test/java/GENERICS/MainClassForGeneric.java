package GENERICS;

import GENERICS.Generics;
import org.testng.annotations.Test;

public class MainClassForGeneric {
    public static void main(String[] args) {
        Generics<Integer> generics = new Generics<>();

        generics.addToString(2);
        generics.addToString(1);
        generics.addToString(3);

        System.out.println(generics.getString());
    }

   public static void mainCar(String[] args) {
        Generics<Car> generics = new Generics<>();

        Car car = new Car("Toyota", 2000);
        Car car2 = new Car("Volvo", 3000);
        Car car3 = new Car("Nissan", 4000);

        generics.addToString(car);
        generics.addToString(car2);
        generics.addToString(car3);

        System.out.println(generics.getString());
    }
}