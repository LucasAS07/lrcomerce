package io.lrsystem.lrcomerce.repository;

import io.lrsystem.lrcomerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
