package cn.com.vo;

import cn.com.common.model.BaseModel;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CartModel extends BaseModel {

	private Integer customerUuid;

	private Integer goodsUuid;

	private Integer buyNum;

}
