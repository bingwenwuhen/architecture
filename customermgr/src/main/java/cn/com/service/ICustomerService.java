package cn.com.service;

import cn.com.common.service.IBaseService;
import cn.com.vo.CustomerModel;
import cn.com.vo.CustomerQueryModel;

/**
 * Created by Administrator on 2016/7/31.
 */
public interface ICustomerService extends IBaseService<CustomerModel, CustomerQueryModel> {

     CustomerModel getByCustomerId(String customerId);
}
