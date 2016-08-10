package cn.com.mapper;

import cn.com.common.mapper.BaseMapper;
import cn.com.vo.CustomerModel;
import cn.com.vo.CustomerQueryModel;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2016/7/31.
 */
@Repository
public interface CustomerMapper extends BaseMapper<CustomerModel, CustomerQueryModel> {

    CustomerModel getByCustomerId(String customerId);
}
