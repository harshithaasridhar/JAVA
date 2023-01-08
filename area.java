class area
{
    double a;
    double r = 40;
    
    void calculate()
    {
        a = (22/7)*r*r;
        System.out.print("Area is\n" + a);
    }
    public static void main(String args[])
    {
        area A = new area();
        A.calculate();
    }
}