package cn.com.service;


import cn.com.common.pageutil.Page;
import cn.com.vo.CartModel;
import cn.com.vo.CartQueryModel;

public interface ICartService {

    void create(CartModel model);

    void update(CartModel model);

    void delete(Long id);

    CartModel getByUuId(Long id);

    Page<CartModel> getByConditionPage(CartQueryModel model);
	
}

