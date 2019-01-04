package cn.sm1234.controller;

import cn.sm1234.domain.Customer;
import cn.sm1234.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 张强
 * created on 2019/1/2  21:35:27
 * description
 */

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    /***
     * 跳转到输入页面
     * */
    @RequestMapping("/input")
    public String input(){
        return "input";
    }


   /**
    * 保存
    * */
   @RequestMapping("/save")
   public String save(Customer customer){
       customerService.save(customer);
       return "succ";
   }
}
