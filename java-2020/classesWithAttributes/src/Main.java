public class Main {
    public static void main(String[] args) {
        //Product product = new Product("Laptop",1,"Asus Laptop",5000,3,"Gri");
        Product product = new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);
        product.setRenk("Gri");

        System.out.println(product.getName());

        ProductManager productManager = new ProductManager();
        productManager.add(product);
    }
}