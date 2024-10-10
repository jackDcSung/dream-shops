package com.dailycodework.dreamshops.repository;

import com.dailycodework.dreamshops.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository  extends CrudRepository<Cart, Long> {
}
