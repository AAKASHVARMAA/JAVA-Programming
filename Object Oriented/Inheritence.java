class Dog{
    void sound()
    {
        System.out.println("Dog barks");
    }
}
class Inheritence extends Dog{
    void animal()
    {
        System.out.println("Dogs are also animals ");
    }
    public static void main(String[] args)
    {
        Pet anm= new Pet();
        anm.sound();
        anm.animal();
        
    }
}