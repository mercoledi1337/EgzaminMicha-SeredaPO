package Z3;
import java.io.File;
import java.util.List;

public class Z3 {

    public static void wypisywanko(File katalog) {
       for (File i : katalog.listFiles()) {
           System.out.print(i + " ");
       }

    }

    public static void main(String[] args) {
    wypisywanko(new File("D:"));
    }
}
