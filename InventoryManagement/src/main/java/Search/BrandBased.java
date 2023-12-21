package Search;

import Entity.Product;
import Repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@RequiredArgsConstructor
public class BrandBased {

    private final ProductRepository productRepository;
    public List<Product> search(String brand) {
        return productRepository.searchByBrand(brand);

    }
}
