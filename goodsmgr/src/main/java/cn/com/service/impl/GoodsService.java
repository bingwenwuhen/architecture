package cn.com.service.impl;


import cn.com.common.service.impl.BaseService;
import cn.com.service.IGoodsService;
import cn.com.vo.GoodsModel;
import cn.com.vo.GoodsQueryModel;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class GoodsService extends BaseService<GoodsModel,GoodsQueryModel> implements IGoodsService {

//	@Override
//	public Page<GoodsModel> getByConditionPage(GoodsQueryModel qm){
//		return dao.getByConditionPage(qm);
//	}
}