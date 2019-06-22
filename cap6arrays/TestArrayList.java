package cap6arrays;

import java.util.ArrayList;

public class TestArrayList {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("certification");
        names.add("java");

        System.out.println(names.contains("java"));  //true
        System.out.println(names.contains("c#")); //false

        boolean removed = names.remove("java");

        System.out.println(names.size());

        Object[] namesArray = names.toArray();
        String[] strings = names.toArray(new String[0]);
        String[] namesString = names.toArray(new String[names.size()]);

        names.set(0, "java-curso");
        System.out.println(names.get(0));
    }
}
