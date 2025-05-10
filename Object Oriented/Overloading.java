class Overloading{
    int add(int a, int b)
    {
        return a+b;
    }
    float add(float a, float b)
    {

        return a+b;
    }
    public static void main(String[] args)
    {
        Overloading lod=new Overloading();
       System.out.println (lod.add(10.5f,11.5f));
        System.out.println(lod.add(10,20));
    }
        
    
}