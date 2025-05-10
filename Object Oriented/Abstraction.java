abstract class Vehicle{
    void type()
    {
        System.out.println("Roadways");
    }
    abstract void name();
}
class Abstraction extends Vehicle{
    void name()
    {
        System.out.println("Swift Dezire");
    }
    public static void main(String[] args)
    {
        Abstraction obj=new Abstraction();
        obj.name();
    }
}