package dao;
import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.Product;
import util.HibernateUtil;

public class ProductDAO {

    public void saveProduct(Product product) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        session.save(product);

        tx.commit();
        session.close();
    }
}
