package org.ruben.java.mysql;

import java.sql.SQLException;
import java.util.List;

public class App  {

public static void main(String[] args) throws ClassNotFoundException, SQLException  {
        DBUtil.iniciarBD();
        ProductDao.insert(new Product("Uvas",1.76));
        mostraProductos();
        int manzanasInt = ProductDao.insert(new Product("Manzanas",0.94));
        mostraProductos();
        ProductDao.update(new Product(manzanasInt,"MANZANAS",0.27));
        mostraProductos();
        ProductDao.delete(2);
        mostraProductos();
    }

public static void mostraProductos()  {
        List<Product> lista = ProductDao.getList();
        System.out.print("Ver datos");
        for (Product product : lista) {
            System.out.print(" [Id-" + product.getProductId()+ "  Name-" + product.getProductName() + "  Price-" + product.getPrice()+"]");
        }
        System.out.println("");
    }



}











