import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        // TODO complete this psvm main method to replicate the timing experiment from adts.py.
        //      Note: this will be client code of the various other classes needing to be written.

    }

    public static void profileMultiSet(MultiSet my_input, int n) {
        Random rand = new Random();
        ArrayList<Integer> items_added = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            int x = rand.nextInt(101);
            my_input.add(x);
            items_added.add(x);
        }

        // assert my_input.size() == n; uncomment once implemented

        double start = System.currentTimeMillis() * 1000;

        for (int i = n-1; i >= 0; i--) {
            // my_input.remove(my_input[i]); uncomment once implemented
        }

        double end = System.currentTimeMillis() * 1000;

        // assert my_input.is_empty(); uncomment once implemented

        System.out.println(n + " " + "my_input.__class__" + " " + (end - start));
    }
}
