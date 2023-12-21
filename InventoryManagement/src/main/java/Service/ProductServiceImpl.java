package Service;

import DTO.ProductDTO;
import Entity.Product;
import Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl {

    @Autowired
   private ProductRepository productrepo;


    public String addProduct(ProductDTO productDTO) {
        Product product=Product.builder()
                .name(productDTO.getName())
                .category(productDTO.getCategory())
                .brand(productDTO.getBrand())
                .price(productDTO.getPrice()). build();
        return productrepo.addProduct(product);
    }

    public void deleteProduct(String id) {
        productrepo.deleteProduct(id);
    }

    public String updateProduct(String id,ProductDTO productDTO) {
      Product product=productrepo.getProductId(id);
      if(product ==null){
          return "product not exist";
      }
      if(productDTO.getBrand()!=null){
           productDTO.setBrand(productDTO.getBrand());
      }
      if(productDTO.getName()!=null){
          productDTO.setName(productDTO.getName());
      }
      if(productDTO.getCategory()!=null){
          productDTO.setCategory(productDTO.getCategory());
      }
      if(productDTO.getPrice()!=null){
          productDTO.setPrice(productDTO.getPrice());
      }

      return productrepo.addProduct(product);
    }



}

