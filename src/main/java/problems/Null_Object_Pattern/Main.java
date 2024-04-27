package problems.Null_Object_Pattern;
/*
* To avoid null checks we create a Null Object class which does nothing or does default behaviour
* */
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new NullObject();
        vehicle.startEngine();
        vehicle.getMillage();
    }
}
