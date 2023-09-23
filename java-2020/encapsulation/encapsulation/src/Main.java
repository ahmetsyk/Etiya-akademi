public class Main {
    public static void main(String[] args) {
        Product product = new Product(1, "Asus Laptop", "dizüstü bilgisayar", 12999
                , 3, "metalik renk");

        //parametresiz public Product methodu için comment line

        //       Product product = new Product();
//        product.setName("Asus laptop");
//        product.setId(1);
//        product.setDescription("dizüstü bilgisayar");
//        product.setPrice(12999);
//        product.setStockAmount(3);
//        product.setRenk("metalik renk");
        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println("ürün ismi= " + product.getName());
        System.out.println("ürün açıklaması= " + product.getDescription());
        System.out.println("ürün fiyatı= " + product.getPrice() + " " + (char) 0x000020BA);
        System.out.println("ürün adedi= " + product.getStockAmount() + " adet");
        System.out.println("ürün rengi= " + product.getRenk());
        System.out.println("ürün ID'si= " + product.getId());
        System.out.println("ürün kodu= " + product.getKod());
    }
}