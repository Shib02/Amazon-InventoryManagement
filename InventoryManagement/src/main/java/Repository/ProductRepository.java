package Repository;

import Entity.CategorySearch;
import Entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class ProductRepository{

    HashMap<String,Product> map=new HashMap<>();
    public String addProduct(Product product) {
        map.put(product.getId(), product);
        return product.getId();
    }
    public void deleteProduct(String id) {
         map.remove(id);
    }

    public Product getProductId(String id) {
        return map.get(id);
    }

    public List<Product> searchByProductName(String name) {

        List<Product> products = new ArrayList<>();
        for (HashMap.Entry<String, Product> entry : map.entrySet()) {
            Product product = entry.getValue();
            if(product.getName().equals(name)) {
                products.add(product);
            }
        }
        return products;
    }

    public List<Product> searchByCategory(String category) {
        List<Product> products = new ArrayList<>();
        for (HashMap.Entry<String, Product> entry : map.entrySet()) {
            Product product = entry.getValue();
            if(product.getCategory().equals(category)) {
                products.add(product);
            }
        }
        return products;
    }

    public List<Product> searchByBrand(String brand) {
        List<Product> products = new ArrayList<>();
        for (HashMap.Entry<String, Product> entry : map.entrySet()) {
            Product product = entry.getValue();
            if(product.getBrand().equals(brand)) {
                products.add(product);
            }
        }
        return products;

    }
}
