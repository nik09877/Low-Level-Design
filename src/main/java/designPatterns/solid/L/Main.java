package designPatterns.solid.L;

import designPatterns.solid.L.correct.Bicycle;
import designPatterns.solid.L.correct.Car;
import designPatterns.solid.L.correct.Vehicle;

import java.util.ArrayList;
import java.util.List;

/*
* Liskov Substitution
* If class B is subtype of class A,
* then we should be able to replace
* object of A with B without
* breaking the behaviour of the program
*
* Subclass should extend the capability of
* parent class not narrow it down
*
* If there are multiple children
* swapping one child with another should not break the code
* */
public class Main {

    public static void main(String[] args) {
        List<Vehicle>vehicles = new ArrayList<>();
        vehicles.add(new Car());
        vehicles.add(new Bicycle());
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getNumberOfWheels().toString());
        }
    }
}
