
package ws.demo;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ProductWS", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ProductWS {


    /**
     * 
     * @return
     *     returns java.util.List<ws.demo.Product>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAll", targetNamespace = "http://ws/", className = "ws.demo.FindAll")
    @ResponseWrapper(localName = "findAllResponse", targetNamespace = "http://ws/", className = "ws.demo.FindAllResponse")
    @Action(input = "http://ws/ProductWS/findAllRequest", output = "http://ws/ProductWS/findAllResponse")
    public List<Product> findAll();

    /**
     * 
     * @return
     *     returns ws.demo.Product
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "find", targetNamespace = "http://ws/", className = "ws.demo.Find")
    @ResponseWrapper(localName = "findResponse", targetNamespace = "http://ws/", className = "ws.demo.FindResponse")
    @Action(input = "http://ws/ProductWS/findRequest", output = "http://ws/ProductWS/findResponse")
    public Product find();

}