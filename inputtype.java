import java.util.*;
public class inputtype {
    public static void main(String[] args) {
        try (//INPUT
        Scanner sc = new Scanner(System.in)) {
            //STORING INPUT
            String name = sc.nextLine();
            int age = sc.nextInt();
            float marks = sc.nextFloat();
            System.out.println(name);
            System.out.println(age);
            System.out.println(marks);
        }

    }
}
