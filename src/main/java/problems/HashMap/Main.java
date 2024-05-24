package problems.HashMap;

public class Main {
    public static void main(String[] args) {
        CustomHashMap<Integer,String> map = new CustomHashMap<>();
        map.put(1,"Hello");
        System.out.println(map.get(1));
    }

}
