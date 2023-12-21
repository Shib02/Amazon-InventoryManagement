package Controller;

import DTO.ProductDTO;
import Entity.Product;
import Service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventory")
public class ProductController {

    @Autowired
   private ProductServiceImpl productServiceImpl;


    @PostMapping("/addProduct")
    public String  addProduct(@RequestBody ProductDTO productDto){
        return productServiceImpl.addProduct(productDto);

    }
    @DeleteMapping("/deleteProduct/{id}")
    public void deleteProduct(@PathVariable String id,@RequestBody ProductDTO productDTO){
        productServiceImpl.deleteProduct(id);
    }

    @PutMapping("/updateProduct/{id}")
    public String updateProduct(@PathVariable String id,@RequestBody ProductDTO productDTO){
        return productServiceImpl.updateProduct(id,productDTO);
    }



}
