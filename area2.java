public class area2
{
    float a;
    float l = 20.99f;
    float b = 40.87f;
    float show()
    {
        a = l*b;
        return a;
    }
    void display()
    {
        System.out.println("area is " + show());
    }
    public static void main(String[] args)
    {
        area2 A = new area2();
        A.display();
    }
    }
