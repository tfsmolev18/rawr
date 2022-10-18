public class Main
{
    int i;
    private Main()
    {
        i=5;
        System.out.println( "Constructor is called");
    }
    public static void main(String[] args)
    {
        Main obj=new Main();
        System.out.println("Value of i:"+obj.i);
    }
}

public class MainThree
{
    int a; boolean b;
    public static void main(String[] args)
    {
        MainThree main = new MainThree();
        System.out.println("Default constructor");
        System.out.println("a = "+ main.a);
        System.out.println("b = "+ main.b);
    }
}


public class MainTwo
{
    String languages;
    MainTwo(String lang)
    {
        languages = lang;
        System.out.print(languages + " Programming Language ");
    }
    public static void main(String args[])
    {
        MainTwo main1 = new MainTwo("Java");
        MainTwo main2 = new MainTwo("Python");
        MainTwo main3 = new MainTwo("C");
    }
}
public class MainTwo
{
    String languages;
    MainTwo(String lang)
    {
        languages = lang;
        System.out.print(languages + " Programming Language ");
    }
    public static void main(String args[]){
        MainTwo main1 = new MainTwo("Java");
        MainTwo main2 = new MainTwo("Python");
        MainTwo main3 = new MainTwo("C");
    }
}


public class MainFour
{
    private String name;
    MainFour(){
        System.out.println("Constructor Called:");
        name = "Programiz";
    }

    public static void main(String[] args)
    {
        MainFour main = new MainFour();
        System.out.println("The name is: "+ main.name);
    }
}
public class MainFour
{
    private String name;
    MainFour(){
        System.out.println("Constructor Called:");
        name = "Programiz";
    }

    public static void main(String[] args)
    {
        MainFour main = new MainFour();
        System.out.println("The name is: "+ main.name);
    }
}


public class
{
        String name;
public Company()
        {
        name = "Programiz";
        }
public static void main(String[] args)
        {
        Company comp = new Company();
        System.out.println("Company name = "+comp.name);
        }
        }
public class Company
{
    String name;
    public Company()
    {
        name = "Programiz";
    }
    public static void main(String[] args){
        Company comp = new Company();
        System.out.println("Company name = "+comp.name);
    }
}

class Area
{
    public void computeArea(int a)
    {
        int area = a *a;
        System.out.println("Area of square: " + area);
    }
    public void computeArea(int a, int b)
    {
        int area = a*b;
        System.out.println("Area of rectangle: " + area);
    }
}
public class Main
{
    public static void main(String[] args){
        Area ar = new Area();
        ar.computeArea(5);
        ar.computeArea(4, 2);
    }

}