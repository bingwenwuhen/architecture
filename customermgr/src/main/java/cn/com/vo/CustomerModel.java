package cn.com.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Created by Administrator on 2016/7/30.
 */
@Data
@EqualsAndHashCode
@ToString
public class CustomerModel {

    private Long uuid;

    private String customerId;

    private String showName;

    private String pwd;

    private String trueName;

    private String registerTime;

}
