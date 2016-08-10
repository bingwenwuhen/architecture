package cn.com.controllers;

import cn.com.common.pageutil.Page;
import cn.com.service.IGoodsService;
import cn.com.vo.GoodsModel;
import cn.com.vo.GoodsQueryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2016/8/7.
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    IGoodsService goodsService;

    @RequestMapping(value = "/toIndex", method = RequestMethod.GET)
    public String toIndex(Model model) {
        GoodsQueryModel gpm = new GoodsQueryModel();
        gpm.getPage().setPageShow(100);
        Page<GoodsModel> page = goodsService.getByConditionPage(gpm);
        model.addAttribute("page", page);
        return "index";

    }

}
