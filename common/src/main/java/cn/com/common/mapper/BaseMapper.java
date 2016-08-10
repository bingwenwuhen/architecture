package cn.com.common.mapper;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2016/7/31.
 */
@Repository
public interface BaseMapper<M, QM> {

    void create(M model);

    void update(M model);

    void delete(Long id);

    M getByUuId(Long id);

    List<M> getByConditionPage(QM model);
}
