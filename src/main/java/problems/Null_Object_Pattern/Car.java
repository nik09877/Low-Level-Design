package problems.Null_Object_Pattern;

public class Car implements Vehicle{

    @Override
    public void startEngine() {
        System.out.println("Engine started");
    }

    @Override
    public int getMillage() {
        return 24;
    }
}
