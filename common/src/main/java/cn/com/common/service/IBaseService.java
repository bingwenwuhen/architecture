package cn.com.common.service;

import cn.com.common.mapper.BaseMapper;
import cn.com.common.model.BaseModel;
import cn.com.common.pageutil.Page;

import java.util.List;

/**
 * Created by Administrator on 2016/7/31.
 */
public interface IBaseService<M, QM extends BaseModel> {

    void create(M model);

    void update(M model);

    void delete(Long id);

    M getById(Long id);

    Page<M> getByConditionPage(QM model);
}
