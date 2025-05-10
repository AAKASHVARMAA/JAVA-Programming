interface Vehicle
{
    void name();
}
interface Way
{
   void  way();
}
class Interface implements Vehicle,Way 
{
    public void name()
    {
        System.out.println("Swift Dezire");
    }
  public void  way(){
        System.out.println("Road ways");
    }
    public static void main(String[] args)
    {
        Interface intr=new Interface();
        intr.way();
        intr.name();
    }
}