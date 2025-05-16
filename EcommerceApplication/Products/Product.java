package product ;

 public class Product{
    public String name;
    protected double price;
    
    public Product(String name, double price)
    {
        this.name=name;
        this.price=price;
    }
    public void displayInfo()
    {
        System.out.println("product: " +name + ", price:$ " + price);
    }
    public void order()
    {
        System.out.println(name+ " has been ordered");
    }

 }