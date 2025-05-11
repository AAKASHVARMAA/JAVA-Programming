class Sum_of_numbers{
    public static void sumnumb(int i, int n, int sum)
    {
        if(i==n)
        {
            sum+=i;
            System.out.println(sum);
            return ;
        }
        sum+=i;
       return sumnumb(i+1, n, sum);
    }
    public static void main(String[] args)
    {
        sumnumb(1,5,0);
    }
}