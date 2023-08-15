package ss18.th.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;
import ss18.th.model.Customer;
import ss18.th.service.CustomerService;


import javax.servlet.http.HttpServletRequest;
import java.util.List;
@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping(value = {"/","/customers"})
    public ModelAndView showList() {
        ModelAndView modelAndView = new ModelAndView("customers/list");
        List<Customer> customerList = customerService.getAll();
        modelAndView.addObject("customers", customerList);
        return modelAndView;
    }
    @GetMapping("/detail/{id}")
    public String detail(@PathVariable Long id, HttpServletRequest request) {
        System.out.println("detail");
        System.out.println("id" + id);
        Long _id = id-1;
        Customer customer = customerService.findById(_id);
        request.setAttribute("customer", customer);
        return "/customers/info";
    }
}
