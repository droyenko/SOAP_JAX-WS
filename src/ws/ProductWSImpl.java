package ws;

import dao.ProductDAO;
import entities.Product;

import javax.jws.WebService;
import java.util.List;

@WebService(endpointInterface = "ws.ProductWS")
public class ProductWSImpl implements ProductWS {

    private ProductDAO productDAO = new ProductDAO();

    @Override
    public Product find() {
        return this.productDAO.find();
    }

    @Override
    public List<Product> findAll() {
        return this.productDAO.findAll();

    }
}
