import  java.util.*;
class Primenum{
    public static void main (String[] args)
    {
        
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("Enter the number");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.println("The number you enterd is  a prime number");
        }
        else{
            System.out.println("The number you enterd is a not a prime number");
        }

    }

}