package product ;

 public class Electronics extends Product{
    private String brand;
    private String warranty;


    public Electronics(String name, double price, String brand,String warranty)
    {
        super(name,price);
        this.brand=brand;
        this.warranty=warranty;
    }
    public void order()
    {
        System.out.println("Orderig electronic item: "+ name + " by " + brand);
         System.out.println("Ordering electronics with " + warranty + " months warranty.");
    }
}