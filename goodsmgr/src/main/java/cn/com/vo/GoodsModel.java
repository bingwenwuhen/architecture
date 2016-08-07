package cn.com.vo;

import cn.com.common.model.BaseModel;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class GoodsModel extends BaseModel {
	private String name;
	private String imgPath;
	private String description;
	

}
