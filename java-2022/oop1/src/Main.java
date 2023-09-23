public class Main {
    public static void main(String[] args) {
        //set values
        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makinesi");
        product1.setUnitPrice(7500);
        product1.setDiscount(7);
        product1.setUnitInStock(3);
        product1.setImageUrl("bilmemne.jpg");

        //get value
        //System.out.println(product.name);

        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setUnitPrice(6500);
        product2.setDiscount(8);
        product2.setUnitInStock(2);
        product2.setImageUrl("bilmemne2.jpg");

        Product product3 = new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setUnitPrice(4500);
        product3.setDiscount(9);
        product3.setUnitInStock(4);
        product3.setImageUrl("bilmemne3.jpg");

        Product[] products = {product1, product2, product3};

        for (Product product : products) {
            System.out.println(product.getName());
        }

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("05124124124");
        individualCustomer.setFirstName("Engin");
        individualCustomer.setLastName("Demiroğ");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setPhone("05123121412");
        corporateCustomer.setTaxNumber("11111111111");
        corporateCustomer.setCustomerNumber("4234123");

        Customer[] customers = {individualCustomer,corporateCustomer};

        for (Customer customer:customers){
            System.out.println("CustomerId :" + customer.getId());
        }
    }
}