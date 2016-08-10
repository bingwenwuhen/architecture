package cn.com.mapper;

import cn.com.common.mapper.BaseMapper;
import cn.com.vo.GoodsModel;
import cn.com.vo.GoodsQueryModel;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodsMapper extends BaseMapper<GoodsModel,GoodsQueryModel> {
}
