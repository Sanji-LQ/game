package com.fzf.game.service;


import com.fzf.game.domain.entity.Shop;

import java.util.List;

public interface SearchServcie {
    List<Shop> search(String keyword);

}
