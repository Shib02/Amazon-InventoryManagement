package Service;

import Entity.Product;
import Entity.SearchCriteria;
import Search.BrandBased;
import Search.CategoryBased;
import Search.NameBased;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class SearchService {

    private final NameBased nameBased;
    private final CategoryBased categoryBased;
    private final BrandBased brandBased;

    public List<Product> search(String filter, SearchCriteria searchCriteria) {
        if
            (searchCriteria.equals(SearchCriteria.NAME))
            return nameBased.search(filter);
        if(searchCriteria.equals(SearchCriteria.CATEGORY)) return categoryBased.search(filter);
        if(searchCriteria.equals(SearchCriteria.BRAND)) return brandBased.search(filter);
        return null;
    }

}
