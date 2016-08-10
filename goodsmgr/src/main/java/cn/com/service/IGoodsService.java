package cn.com.service;


import cn.com.common.pageutil.Page;
import cn.com.common.service.IBaseService;
import cn.com.vo.GoodsModel;
import cn.com.vo.GoodsQueryModel;

public interface IGoodsService {

    void create(GoodsModel model);

    void update(GoodsModel model);

    void delete(Long id);

    GoodsModel getByUuId(Long id);

    Page<GoodsModel> getByConditionPage(GoodsQueryModel model);

	
}

