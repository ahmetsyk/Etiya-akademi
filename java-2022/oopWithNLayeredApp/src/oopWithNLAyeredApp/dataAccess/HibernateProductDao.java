package oopWithNLAyeredApp.dataAccess;

import oopWithNLAyeredApp.entities.Product;

public class HibernateProductDao implements ProductDao{
    //sadece ve sadece db erişim kodları buraya yazılır...SQL
    public void add(Product product){
        System.out.println("Hibernate ile veritabanına eklendi");
    }
}
