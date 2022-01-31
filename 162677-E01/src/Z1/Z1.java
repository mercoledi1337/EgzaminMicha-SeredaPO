package Z1;
import java.time.LocalTime;

public class Z1 {
        public static void main(String[] args) {
            Integer[] a = {1,3,2};
            LocalTime[] b = {LocalTime.of(10,15,30),LocalTime.of(10,14,30)};
            String[] c = {"dd","bb"};
            System.out.println(ArrayUtil.isSorted(c));
        }
}
