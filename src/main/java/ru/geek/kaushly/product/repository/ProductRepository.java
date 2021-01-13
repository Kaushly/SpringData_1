package ru.geek.kaushly.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.geek.kaushly.product.model.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByPriceGreaterThanEqual(int price);
    List<Product> findAllByPriceLessThanEqual(int price);
    List<Product> findAllByPriceBetween(int min, int max);


}
