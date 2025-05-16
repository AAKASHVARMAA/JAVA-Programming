import order.Orders;
import product.Electronics;
import product.Clothing;


public class MainApp{
    public static void main(String[] args)
    {
        Electronics device= new Electronics("Laptop",35000,"Dell","12");
        Clothing clth= new Clothing("T-shirt",200,"M");

        Orders Orderprc=new Orders();
        Orderprc.Orderproc(device);
        Orderprc.Orderproc(clth);
    }
}