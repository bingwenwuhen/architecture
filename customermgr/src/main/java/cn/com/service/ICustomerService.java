package cn.com.service;

import cn.com.common.pageutil.Page;
import cn.com.common.service.IBaseService;
import cn.com.vo.CustomerModel;
import cn.com.vo.CustomerQueryModel;

/**
 * Created by Administrator on 2016/7/31.
 */
public interface ICustomerService {

     void create(CustomerModel model);

     void update(CustomerModel model);

     void delete(Long id);

     CustomerModel getByUuId(Long id);

     Page<CustomerModel> getByConditionPage(CustomerQueryModel model);

     CustomerModel getByCustomerId(String customerId);
}
