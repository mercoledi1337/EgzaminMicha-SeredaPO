package Z2;
import java.util.ArrayList;

public class Z2 {

    public static <E extends Iterable<E>, T> void print(Iterable<T> a)
    {
        for (T i : a)
            System.out.print(i + ",");
    }

    public static void main(String[] args) {
        ArrayList<String> asap = new ArrayList<>();
        ArrayList<Integer> asap1 = new ArrayList<>();
        asap.add("adi");
        asap.add("nowak");
        asap.add("sbm");
        asap1.add(2);
        asap1.add(1);
        asap1.add(1);
        asap1.add(5);
        print(asap);
        System.out.println();
        print(asap1);
    }
}
