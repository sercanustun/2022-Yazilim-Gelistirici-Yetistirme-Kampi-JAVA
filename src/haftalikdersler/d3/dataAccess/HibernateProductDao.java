package src.haftalikdersler.d3.dataAccess;

import src.haftalikdersler.d2.oop1.Product;

public class HibernateProductDao implements ProductDao {
    @Override
    public void add(Product product) {
        System.out.println("Hibernate ile veritabanına eklendi");

    }
}