public class Main {
    public static void main(String[] args) {

        Product product = new Product();
        product.name="Laptop";
        product.id = 1;
        product.description = "Asus laptop";
        product.Price = 5999;
        product.stockAmount = 3 ;
        ProductManager productManager = new ProductManager();
        productManager.Add(product);
    }
}