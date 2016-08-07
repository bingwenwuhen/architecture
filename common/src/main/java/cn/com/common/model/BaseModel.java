package cn.com.common.model;

import cn.com.common.pageutil.Page;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/7/31.
 */
@Data
public class BaseModel implements Serializable{

    private Long uuid;

    private Page page = new Page();

}
