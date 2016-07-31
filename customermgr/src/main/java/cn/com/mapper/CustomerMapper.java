package cn.com.mapper;

import cn.com.vo.CustomerModel;
import cn.com.vo.CustomerQueryModel;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2016/7/31.
 */
@Repository
public interface CustomerMapper {

    void create(CustomerModel model);

    void update(CustomerModel model);

    void delete(Long id);

    CustomerModel getById(Long id);

    List<CustomerModel> getByConditionPage(CustomerQueryModel model);

}
