package Search;

import Entity.Product;
import Repository.ProductRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@RequiredArgsConstructor
public class NameBased {
    private final ProductRepository productRepository;

    public List<Product> search(String name) {
        return productRepository.searchByProductName(name);
    }
}
