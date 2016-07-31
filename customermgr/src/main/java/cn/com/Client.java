package cn.com;

import cn.com.mapper.CustomerMapper;
import cn.com.vo.CustomerModel;
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

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Client client = (Client) context.getBean("client");
        CustomerModel model = new CustomerModel();
        model.setCustomerId("c1");
        model.setPwd("1233");
        model.setRegisterTime(String.valueOf((new Date()).getTime()));
        model.setShowName("c1");
        model.setTrueName("ÕÅÈý");
        client.customerMapper.create(model);
    }
}
