package com.slshop.cart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slshop.common.entity.CartItem;

@Service
public class CartService {

    private final CartMapper cartMapper;

    @Autowired
    public CartService(CartMapper cartMapper) {
        this.cartMapper = cartMapper;
    }

    public List<CartItem> getCartItem() {
        return cartMapper.findAll();
    }

    public CartItem getCartItem(Long id) {
        CartItem cartItem = cartMapper.findById(id);
        return cartItem;
    }
}
