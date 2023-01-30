import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayListImplementation list = new ArrayListImplementation(10);

        ArrayList<Integer> arrayList = new ArrayList<>(10);

        for (int i = 0; i < 123; i++) {
            list.add(i);
        }

        System.out.println(Arrays.toString(list.array));


    }
}
