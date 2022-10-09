package src.haftalikdersler.d3.dataAccess;

import src.haftalikdersler.d2.oop1.Product;

public class JdbcProductDao implements ProductDao {
    public void add(Product product) {
        //sadece ve sadece db erişim kodları buraya yazılır... SQL
        System.out.println("JDBC ile veritabanına eklendi.");
    }

}