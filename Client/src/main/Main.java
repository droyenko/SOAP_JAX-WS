package main;

import ws.demo.*;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {
            DemoImplService demoImplService = new DemoImplService();
            Demo demo = demoImplService.getDemoImplPort();
            System.out.println(demo.helloWorld());
            System.out.println(demo.hi("ABC"));

            ProductWSImplService productWSImplService = new ProductWSImplService();
            ProductWS productWS = productWSImplService.getProductWSImplPort();
            Product product = productWS.find();
            System.out.println("Id: " + product.getId());
            System.out.println("Name: " + product.getName());
            System.out.println("Price: " + product.getPrice());
            List<Product> products = productWS.findAll();
            for (int i = 0; i < products.size(); i++) {
                Product prod =  products.get(i);
                System.out.println("Id: " + prod.getId());
                System.out.println("Name: " + prod.getName());
                System.out.println("Price: " + prod.getPrice());
                System.out.println("============================");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
