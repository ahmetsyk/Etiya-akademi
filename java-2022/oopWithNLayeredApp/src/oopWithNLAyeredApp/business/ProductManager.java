package oopWithNLAyeredApp.business;

import oopWithNLAyeredApp.core.logging.Logger;
import oopWithNLAyeredApp.dataAccess.ProductDao;
import oopWithNLAyeredApp.entities.Product;

import java.util.List;

public class ProductManager {
    private ProductDao productDao;
    private Logger[] loggers;

    public ProductManager(ProductDao productDao, Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    //iş kuralları yazılır
    public void add(Product product) throws Exception {
        if (product.getUnitPrice() < 10) {
            throw new Exception("Ürün fiyatı 10'dan küçük olamaz");
        } else {
            productDao.add(product);

            for (Logger logger: loggers){       //[db,mail]
                logger.log(product.getName());
            }
        }
    }
}
