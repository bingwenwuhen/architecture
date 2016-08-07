package cn.com;

import cn.com.common.pageutil.Page;
import cn.com.mapper.CustomerMapper;
import cn.com.service.ICustomerService;
import cn.com.vo.CustomerModel;
import cn.com.vo.CustomerQueryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by Administrator on 2016/7/31.
 */
@Service
public class Client {

    @Autowired
    private CustomerMapper customerMapper;

    @Autowired
    private ICustomerService customerService;

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Client client = (Client) context.getBean("client");
        CustomerModel model = new CustomerModel();
        model.setCustomerId("c1");
        model.setPwd("1233");
        model.setRegisterTime(String.valueOf((new Date()).getTime()));
        model.setShowName("c1");
        model.setTrueName("zhangsan222");
        //client.customerMapper.create(model);
        client.customerService.create(model);
        CustomerQueryModel model1 = new CustomerQueryModel();
        model1.getPage().setNowPage(1);
        model1.getPage().setPageShow(1);
        Page<CustomerModel> p = client.customerService.getByConditionPage(model1);
        System.out.println(p);

        System.out.println("========================");
        Page<CustomerModel> p1 = client.customerService.getByConditionPage(model1);
        System.out.println(p1);
    }
}
