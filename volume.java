import java.util.Scanner;
public class volume
{
    Scanner sc = new Scanner(System.in);
    double a;
    double r = 30.9;
    double h = 10.8;
    int x;
    
    void Input()
    {
        System.out.println("Enter a number");
        x = sc.nextInt();
        System.out.println("The Entered value is "+ x);
    }
    double show()  
     {
     a = (1.0/3.0)*Math.PI*r*r*h;
     return a;
     }
     void display()
      {
    System.out.println("the volume is" + show());
 }
public static void main(String[] args)
{
    volume A = new volume();
        A.display();
}
}