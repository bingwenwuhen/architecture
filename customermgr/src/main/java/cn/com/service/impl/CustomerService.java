package cn.com.service.impl;

import cn.com.common.pageutil.Page;
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
public class CustomerService implements ICustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    public void create(CustomerModel model) {
        customerMapper.create(model);
    }

    public void update(CustomerModel model) {
        customerMapper.update(model);
    }

    public void delete(Long id) {
        customerMapper.delete(id);
    }

    public CustomerModel getByUuId(Long id) {
        return customerMapper.getByUuId(id);
    }

    public Page<CustomerModel> getByConditionPage(CustomerQueryModel model) {
        model.getPage().setResult(customerMapper.getByConditionPage(model));
        return model.getPage();
    }

    public CustomerModel getByCustomerId(String customerId) {
        return customerMapper.getByCustomerId(customerId);
    }
}
