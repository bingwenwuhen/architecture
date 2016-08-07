package cn.com.common.web;

import lombok.Data;

/**
 * Created by Administrator on 2016/8/2.
 */
@Data
public class BaseWebModel {
    private String queryJsonStr = "";

    private int nowPage = 1;

    private int pageShow = 0;

}
