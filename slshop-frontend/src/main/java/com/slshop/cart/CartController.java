package com.slshop.cart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.slshop.common.entity.CartItem;

@Controller
@RequestMapping("cart")
public class CartController {

    private final CartService cartService;

    @Autowired
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping
    public String viewCart(Model model) {
//        List<CartItem> cartItems = cartService.getCartItem();
//        model.addAttribute("cartItems", cartItems);
        return "/cart";
    }

//    @GetMapping("/detail/{productId}")
//    public String viewProductDetail(@PathVariable("productId") Long productId, Model model) {
//        Product product = productService.getProduct(productId);
//        model.addAttribute("id", productId);
//        model.addAttribute("product", product);
//        return "products/product_detail";
//    }
}
