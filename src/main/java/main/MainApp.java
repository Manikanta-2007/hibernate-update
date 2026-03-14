package main;
import dao.ProductDAO;
import entity.Product;

public class MainApp {

    public static void main(String[] args) {

        ProductDAO dao = new ProductDAO();

        Product p = new Product("Laptop","Gaming Laptop",80000,5);

        dao.saveProduct(p);

        System.out.println("Product inserted successfully");

    }

}
