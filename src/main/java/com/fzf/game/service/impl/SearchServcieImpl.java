package com.fzf.game.service.impl;

import com.fzf.game.domain.entity.Shop;
import com.fzf.game.mapper.ShopMapper;
import com.vip.bdshop.service.SearchServcie;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SearchServcieImpl implements SearchServcie {

    @Resource
    ShopMapper shopMapper;
    /**
     * 搜索功能
     *
     */
    @Override
    public List<Shop> search(String keyword) {
        return shopMapper.findByKeyWord(keyword);
    }



}
