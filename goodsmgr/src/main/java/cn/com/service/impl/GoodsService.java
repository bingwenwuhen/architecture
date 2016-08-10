package cn.com.service.impl;


import cn.com.common.pageutil.Page;
import cn.com.mapper.GoodsMapper;
import cn.com.service.IGoodsService;
import cn.com.vo.GoodsModel;
import cn.com.vo.GoodsQueryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsService implements IGoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    public void create(GoodsModel model) {
        goodsMapper.create(model);
    }

    public void update(GoodsModel model) {
        goodsMapper.update(model);
    }

    public void delete(Long id) {
        goodsMapper.delete(id);
    }

    public GoodsModel getByUuId(Long id) {
        return goodsMapper.getByUuId(id);
    }

    public Page<GoodsModel> getByConditionPage(GoodsQueryModel model) {
        model.getPage().setResult(goodsMapper.getByConditionPage(model));
        return model.getPage();
    }
}