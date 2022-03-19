package com.tsdnl.market.persistence.crud;

import com.tsdnl.market.persistence.entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductCrudRepository extends CrudRepository<Product, Integer> {

    List<Product> findByIdCategoryOrderByNameAsc(int idCategory);

    Optional<List<Product>> findByStockQuantityLessThanAndState(int stockQuantity, boolean state);
}
