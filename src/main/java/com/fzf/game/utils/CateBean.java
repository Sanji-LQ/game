package com.vip.bdshop.utils;


import com.vip.bdshop.domain.entity.Banner;
import com.vip.bdshop.domain.entity.Navigation;
import com.vip.bdshop.domain.vo.CateGoryVo;
import lombok.Data;

import java.io.Serializable;
import java.util.List;


@Data
public class CateBean implements Serializable {
    List<Banner> banners;
    List<Navigation> navigations;
    List<CateGoryVo> cateGoryVos;
}
