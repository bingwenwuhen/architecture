package cn.com.service;


import cn.com.common.pageutil.Page;
import cn.com.mapper.CartMapper;
import cn.com.vo.CartModel;
import cn.com.vo.CartQueryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CartService implements ICartService {

	@Autowired
	private CartMapper cartMapper;

	public void create(CartModel model) {
		cartMapper.create(model);
	}

	public void update(CartModel model) {
		cartMapper.update(model);
	}

	public void delete(Long id) {
		cartMapper.delete(id);
	}

	public CartModel getByUuId(Long id) {
		return cartMapper.getByUuId(id);
	}

//	public Page<CartModel> getByConditionPage(CartQueryModel model) {
//		model.getPage().setResult(cartMapper.getByConditionPage(model));
//		return model.getPage();
//	}
}