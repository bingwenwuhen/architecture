package cn.com.common.mapper;

import java.util.List;

/**
 * Created by Administrator on 2016/7/31.
 */
public interface BaseMapper<M, QM> {

    void create(M model);

    void update(M model);

    void delete(Long id);

    M getByUuId(Long id);

    M getByCustomerId(String customerId);

    List<M> getByConditionPage(QM model);
}
