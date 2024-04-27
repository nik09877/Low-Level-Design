package problems.Null_Object_Pattern;

public class NullObject implements Vehicle{
    @Override
    public void startEngine() {
        //do nothing
    }

    @Override
    public int getMillage() {
        //return default value
        return 0;
    }
}
