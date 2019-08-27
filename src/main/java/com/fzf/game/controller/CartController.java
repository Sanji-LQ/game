package com.fzf.game.controller;


import com.fzf.game.domain.entity.Cart;
import com.fzf.game.service.CartService;
import com.fzf.game.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/carts")
@Slf4j
public class CartController {
    @Resource
    CartService cartService;

    /*
    * 查询用户购物车列表
    * */
    @GetMapping(value = "/list",params = "uid")
    public Result list(int uid){
        try{
            Cart cart=new Cart();
            cart.setUid(uid);
            return Result.success(cartService.cartList(cart));
        }catch (Exception e){
            e.printStackTrace();
        }
        return Result.error();
    }

    /*
     * 购物车 加减数量
     * */
    @GetMapping(value = "/update",params = {"cartId","op"})
    public Result updateNumber(int cartId, int op){
        try{
            Cart cart=new Cart();
            cart.setCartId(cartId);
            return Result.success(cartService.updateNumber(cart,op));
        }catch (Exception e){
            return Result.error();
        }
    }

    /*
     * 删除购物车
     * */
    @GetMapping(value = "/delete",params = "cartId")
    public Result delete(int cartId) {
        try{
            Cart cart=new Cart();
            cart.setCartId(cartId);
            return Result.success(cartService.deleteCart(cart));
        }catch (Exception e){
            return Result.error();
        }
    }

    /*
     * 商品加入购物车
     * */
    @GetMapping(value = "/add",params = {"uid","shopId","number"})
    public Result add( int uid,int shopId, int number) {
        Cart cart=new Cart();
        cart.setUid(uid);
        cart.setShopId(shopId);
        cart.setNum(number);
        if(cartService.add(cart)==1){
            return Result.success(cartService.add(cart));
        }else{
            return Result.error();
        }
    }



}
