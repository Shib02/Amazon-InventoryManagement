package Search;

import Entity.Product;
import Repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class CategoryBased {


    private final ProductRepository productRepository;
    public List<Product> search(String category) {
        return productRepository.searchByCategory(category);
    }
}
