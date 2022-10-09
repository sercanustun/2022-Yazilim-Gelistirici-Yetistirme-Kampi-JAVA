package src.haftalikdersler.d3.business;

import src.haftalikdersler.d2.oop1.Product;
import src.haftalikdersler.d3.core.logging.Logger;
import src.haftalikdersler.d3.dataAccess.ProductDao;

public class ProductManager {
    private ProductDao productDao;
    private Logger[] loggers;

    public ProductManager(ProductDao productDao, Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception {
        //iş kuralları
        if (product.getUnitPrice() < 10) {
            throw new Exception("Ürün fiyatı 10 dan küçük olamaz");
        }
        productDao.add(product);

        for (Logger logger : loggers) { //[db,mail]
            logger.log(product.getName());
        }
    }
}