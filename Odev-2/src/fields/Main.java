package fields;

public class Main {
    public static void main(String[] args){
        Product product=new Product();
        product.setId(1);
        product.setName("Laptop");
        product.setDescription("Asus laptop");
        product.setPrice(15000);
        product.setStockAmount(3);

        Product product1=new Product(2,"Apple","Iphone 6",10000,5,"2");
        ProductManager productManager=new ProductManager();
        productManager.Add(product);
    }
}
