package cn.com.controllers;

import cn.com.common.pageutil.Page;
import cn.com.common.util.format.DateFormatHelper;
import cn.com.common.util.json.JsonHelper;
import cn.com.form.CustomerWebForm;
import cn.com.service.ICustomerService;
import cn.com.vo.CustomerModel;
import cn.com.vo.CustomerQueryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * Created by Administrator on 2016/7/31.
 */
@Controller
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    private ICustomerService customerService;

    @RequestMapping(value = "/toAdd", method = RequestMethod.GET)
    public String toAdd() {
        return "customer/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String add(CustomerModel model) {
        model.setRegisterTime(DateFormatHelper.long2str((new Date()).getTime()));
        customerService.create(model);
        return "customer/success";
    }

    @RequestMapping(value = "toUpdate/{customerUuid}", method = RequestMethod.GET)
    public String toUpdate(@PathVariable("customerUuid") Long customerUuid, Model model) {
        CustomerModel cm = customerService.getByUuId(customerUuid);
        model.addAttribute("cm", cm);
        return "customer/add";
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public String update(@ModelAttribute("cm") CustomerModel cm) {
        customerService.update(cm);
        return "customer/success";
    }

    @RequestMapping(value = "toDelete/{customerUuid}", method = RequestMethod.GET)
    public String toDelete(@PathVariable("customerUuid") Long customerUuid, Model model) {
        CustomerModel cm = customerService.getByUuId(customerUuid);
        model.addAttribute("cm", cm);
        return "customer/delete";
    }

    @RequestMapping(value = "delete", method = RequestMethod.POST)
    public String update(@RequestParam("uuid") Long customerUuid) {
        customerService.delete(customerUuid);
        return "customer/success";
    }

    @RequestMapping(value = "toList", method = RequestMethod.GET)
    public String toList(Model model, @ModelAttribute("wm")CustomerWebForm wm) {
        CustomerQueryModel cqm = null;
        if (wm.getQueryJsonStr() == null || wm.getQueryJsonStr().trim().length() == 0) {
            cqm = new CustomerQueryModel();
        }else {
            cqm = (CustomerQueryModel) JsonHelper.str2Object(wm.getQueryJsonStr(), CustomerQueryModel.class);
        }
        cqm.getPage().setNowPage(wm.getNowPage());
        if (wm.getPageShow() > 0) {
            cqm.getPage().setPageShow(wm.getPageShow());
        }
        Page dbPage = customerService.getByConditionPage(cqm);
        model.addAttribute("wm", wm);
        model.addAttribute("page", dbPage);
        return "customer/list";
    }
}
