package oopWithNLAyeredApp;

import oopWithNLAyeredApp.business.ProductManager;
import oopWithNLAyeredApp.core.logging.DatabaseLogger;
import oopWithNLAyeredApp.core.logging.EmailLogger;
import oopWithNLAyeredApp.core.logging.FileLogger;
import oopWithNLAyeredApp.core.logging.Logger;
import oopWithNLAyeredApp.dataAccess.HibernateProductDao;
import oopWithNLAyeredApp.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1, "Iphone Xr", 10000);

        Logger[] loggers = {new DatabaseLogger(),new EmailLogger()};

        ProductManager productManager = new ProductManager(new HibernateProductDao(),loggers);
        productManager.add(product1);


    }
}