class Factorial{
    public static void Fact(int n,int fact )
    {
        if (n==0)
        {
            System.out.println(fact);
            return;
        }
        fact*=n;
        Fact(n-1,fact);

    }
    public static void main(String[] args)
    {
        Fact(5,1);
    }
}