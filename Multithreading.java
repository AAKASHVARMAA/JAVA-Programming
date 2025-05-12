class Multithreading extends Thread
{
    public static void runs()
    {
        System.out.println("Thread is running");
    }
    public static void main(String[] args)
    {
        Multithreading mt=new Multithreading();
        mt.starts();
    }
}