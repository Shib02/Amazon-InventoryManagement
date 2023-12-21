package DTO;

import Entity.CategorySearch;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductDTO {

    private String name;
    private CategorySearch category;
    private String brand;
    private String price;

}
