package cn.com.form;

import lombok.Data;
import lombok.ToString;

/**
 * Created by Administrator on 2016/8/1.
 */
@Data
@ToString
public class CustomerWebForm {

    private String queryJsonStr = "";

    private int nowPage = 1;

    private int pageShow = 0;

}
