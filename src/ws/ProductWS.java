package ws;

import entities.Product;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public interface ProductWS {

    @WebMethod
    Product find();

    @WebMethod
    List<Product> findAll();


}
