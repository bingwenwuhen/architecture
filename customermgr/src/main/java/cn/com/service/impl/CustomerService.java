package cn.com.service.impl;

import cn.com.common.service.impl.BaseService;
import cn.com.mapper.CustomerMapper;
import cn.com.service.ICustomerService;
import cn.com.vo.CustomerModel;
import cn.com.vo.CustomerQueryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/7/31.
 */
@Service
public class CustomerService extends BaseService<CustomerModel, CustomerQueryModel> implements ICustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    public CustomerModel getByCustomerId(String customerId) {
        return customerMapper.getByCustomerId(customerId);
    }
}
