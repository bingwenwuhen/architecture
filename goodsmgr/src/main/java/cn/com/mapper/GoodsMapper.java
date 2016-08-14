package cn.com.mapper;

import cn.com.vo.GoodsModel;
import cn.com.vo.GoodsQueryModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodsMapper {

    void create(GoodsModel model);

    void update(GoodsModel model);

    void delete(Long id);

    GoodsModel getByUuId(Long id);

    List<GoodsModel> getByConditionPage(GoodsQueryModel model);

}
