package com.fzf.game.service;



import com.fzf.game.domain.entity.Shop;
import com.fzf.game.domain.vo.ShopVo;
import com.vip.bdshop.utils.CateBean;

import java.util.List;


public interface IndexService {

//     CateBean getHeader();

     List<Shop> findShop(int id,int i,int page,int size);
     List<Shop> getContentData(int cateId, int page, int size);

     ShopVo shopDetails(int shopId);
}
