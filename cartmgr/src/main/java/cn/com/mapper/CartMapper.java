package cn.com.mapper;

import cn.com.vo.CartModel;
import cn.com.vo.CartQueryModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartMapper{

    void create(CartModel model);

    void update(CartModel model);

    void delete(Long id);

    CartModel getByUuId(Long id);

    List<CartModel> getByConditionPage(CartQueryModel model);
	
}
