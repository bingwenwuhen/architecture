package cn.com.common.service.impl;

import cn.com.common.mapper.BaseMapper;
import cn.com.common.model.BaseModel;
import cn.com.common.pageutil.Page;
import cn.com.common.service.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Administrator on 2016/7/31.
 */
public class BaseService<M, QM extends BaseModel> implements IBaseService<M, QM> {

    @Autowired
    private BaseMapper baseMapper;

    public void create(M model) {
        baseMapper.create(model);
    }

    public void update(M model) {
        baseMapper.update(model);
    }

    public void delete(Long id) {
        baseMapper.delete(id);
    }

    public M getByUuId(Long id) {
        return (M) baseMapper.getByUuId(id);
    }

    public M getByCustomerId(String customerId) {
        return (M) baseMapper.getByCustomerId(customerId);
    }

    public Page<M> getByConditionPage(QM model) {
        List<M> list = baseMapper.getByConditionPage(model);
        model.getPage().setResult(list);
        return model.getPage();
    }
}
