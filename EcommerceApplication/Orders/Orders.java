package order;
import product.Product;
 public class Orders{
    public void Orderproc(Product product)
    {
        System.out.println("Processing order for :" + product.name);
        product.order();
        System.out.println("Order Placed Successfully");
    }


}