package Controller;

import Entity.Product;
import Entity.SearchCriteria;
import Service.SearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/search")
@RequiredArgsConstructor
public class SearchController {

    @Autowired
    private final SearchService searchService;

    @GetMapping("/productName/{productName}")
    public List<Product> searchByName(@PathVariable String productName) {
        return searchService.search(productName, SearchCriteria.NAME);
    }

    @GetMapping("/category/{category}")
    public List<Product> searchByCategory(@PathVariable String category) {
        return searchService.search(category, SearchCriteria.CATEGORY);
    }

    @GetMapping("/brand/{brand}")
    public List<Product> searchByBrand(@PathVariable String brand) {
        return searchService.search(brand, SearchCriteria.BRAND);
    }


}
