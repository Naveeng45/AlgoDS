package problems.singleton;

// Java program implementing Singleton class
// with getInstance() method
class Singleton
{
    // static variable single_instance of type Singleton
    private static Singleton single_instance = null;

    // variable of type String
    public String s;

    // private constructor restricted to this class itself
    private Singleton()
    {
        s = "Hello I am a string part of Singleton class";
    }

    // static method to create instance of Singleton class
    public static Singleton getInstance()
    {
        if (single_instance == null)
            single_instance = new Singleton();

        return single_instance;
    }

    public String getName(){
        return "Vinay";
    }
}

// Driver Class
class Main
{
    public static void main(String args[])
    {
        // instantiating Singleton class with variable x
        String x = Singleton.getInstance().getName();

        // instantiating Singleton class with variable y
        Singleton y = Singleton.getInstance();

        // instantiating Singleton class with variable z
        Singleton z = Singleton.getInstance();

        // changing variable of instance x
       // x.s = (x.s).toUpperCase();

        System.out.println("String from x is " + x);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
        System.out.println("\n");

        // changing variable of instance z
        z.s = (z.getName()).toLowerCase();

        System.out.println("String from x is " + x);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
    }
}

