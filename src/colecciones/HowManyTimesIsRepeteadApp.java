package colecciones;


import java.util.Map;
import java.util.Set;

public class HowManyTimesIsRepeteadApp {
    public static void main(String[] args) {

        String [] animals={"cat","dog","cat","cow","cow","cow","cow"};
        System.out.println(HowManyTimeIsRepeated.countRepetition(animals));

        Integer [] numbers={1,4,4,5,6,6,6,6,9,9,9,9,9,9};
        System.out.println(HowManyTimeIsRepeated.countRepetition(numbers));
    }
}

