package product;
 public class Clothing extends Product{
    private String size;
    public Clothing(String name, double price,String size)
    {
        super(name, price);
        this.size=size;
    }
    public void order()
    {
        System.out.println("Ordering clothing item:" + name + "(Size:" + size + ")");
    }

 }