package cn.com.controllers;

import cn.com.common.pageutil.Page;
import cn.com.service.ICartService;
import cn.com.service.IGoodsService;
import cn.com.vo.CartModel;
import cn.com.vo.CartQueryModel;
import cn.com.vo.GoodsModel;
import cn.com.vo.GoodsQueryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2016/8/7.
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    private IGoodsService goodsService;

    @Autowired
    private ICartService cartService;

    @RequestMapping(value = "/toIndex", method = RequestMethod.GET)
    public String toIndex(Model model) {
        GoodsQueryModel gpm = new GoodsQueryModel();
        gpm.getPage().setPageShow(100);
        Page<GoodsModel> page = goodsService.getByConditionPage(gpm);
        model.addAttribute("page", page);
        return "index";
    }

    @RequestMapping(value="/toGoodsDesc/{goodsUuid}",method=RequestMethod.GET)
    public String toGoodsDesc(Model model,@PathVariable("goodsUuid")Long goodsUuid){
        GoodsModel gm = goodsService.getByUuId(goodsUuid);
        model.addAttribute("m",gm);
        return "goods/desc";
    }

    @RequestMapping(value="/addToCart/{goodsUuid}",method=RequestMethod.GET)
    public String addToCart(Model model,@PathVariable("goodsUuid")int goodsUuid,@CookieValue("MyLogin")String myLogin){
        int customerUuid = Integer.parseInt( myLogin.split(",")[0]);
        CartModel cm = new CartModel();
        cm.setBuyNum(1);
        cm.setCustomerUuid(customerUuid);
        cm.setGoodsUuid(goodsUuid);

        cartService.create(cm);
        ///////////////////////////
        CartQueryModel cqm = new CartQueryModel();
        cqm.getPage().setPageShow(1000);
        cqm.setCustomerUuid(customerUuid);


        Page<CartModel>  page = cartService.getByConditionPage(cqm);

        model.addAttribute("page",page);

        return "cart/myCart";
    }

    @RequestMapping(value="/toCart",method=RequestMethod.GET)
    public String toCart(Model model,@CookieValue("MyLogin")String myLogin){
        int customerUuid = Integer.parseInt( myLogin.split(",")[0]);

        CartQueryModel cqm = new CartQueryModel();
        cqm.getPage().setPageShow(1000);
        cqm.setCustomerUuid(customerUuid);

        Page<CartModel>  page = cartService.getByConditionPage(cqm);

        model.addAttribute("page",page);

        return "cart/myCart";
    }
}
