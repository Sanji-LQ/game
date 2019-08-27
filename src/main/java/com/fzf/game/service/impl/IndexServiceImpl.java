package com.fzf.game.service.impl;



import com.fzf.game.domain.entity.Shop;
import com.fzf.game.domain.vo.ShopVo;
import com.fzf.game.mapper.BigTypeMapper;
import com.fzf.game.mapper.ShopMapper;
import com.fzf.game.service.IndexService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zhangwei
 */
@Service("indexService")
public class IndexServiceImpl implements IndexService {
    @Resource
    BigTypeMapper bigTypeMapper;
    @Resource
    ShopMapper shopMapper;
    //    @Resource
//    BannerMapper bannerMapper;
//    @Resource
//    NavigationMapper navigationMapper;
//    @Override
//    public CateBean getHeader() {
//        CateBean bean = new CateBean();
//        List<Banner> banners = bannerMapper.findAll("order");
//        List<Navigation> navigations = navigationMapper.findNavigations();
//        List<CateGoryVo> cateGoryVos = bigTypeMapper.findAll();
//        bean.setBanners(banners);
//        bean.setCateGoryVos(cateGoryVos);
//        bean.setNavigations(navigations);
//        return bean;
//    }

    @Override
    public List<Shop> getContentData(int cateId, int page, int size) {
        if(page == 0){
            page=1;
        }
        if(size == 0){
            size=10;
        }
        List<Shop> shops = bigTypeMapper.findByBigTypeId(cateId,page-1,size);
        return shops;
    }

    @Override
    public List<Shop> findShop(int id, int i,int page,int size) {
        List<Shop> list=new ArrayList<>();
        if(page == 0){
            page=1;
        }
        if(size == 0){
            size=10;
        }
        if(id !=0&&i!=0){
            if(i == 1){
                list=bigTypeMapper.findByBigTypeId(id,page-1,size);
            }else if(i == 2) {
                list = bigTypeMapper.findBySmallTypeId(id, page - 1, size);
            }
        }else {
            list=shopMapper.findAll(page-1,size);
        }
        return list;
    }

    @Override
    public ShopVo shopDetails(int shopId) {
        ShopVo shopVo = new ShopVo();
        shopVo = shopMapper.findShop(shopId);
        return shopVo;
    }
}
