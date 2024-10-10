package com.dailycodework.dreamshops.repository;

import com.dailycodework.dreamshops.model.Cart;
import com.dailycodework.dreamshops.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Cart, Long> {
    Category findByName(String name);

    boolean existsByName(String name);
}
