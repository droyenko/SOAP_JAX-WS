package main;

import ws.DemoImpl;
import ws.ProductWSImpl;

import javax.xml.ws.Endpoint;

public class Main {
    public static void main(String[] args) {
        try {
            Endpoint.publish("http://localhost:4790/ws/demo", new DemoImpl());
            Endpoint.publish("http://localhost:4790/ws/product", new ProductWSImpl());
            System.out.println("Done");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
