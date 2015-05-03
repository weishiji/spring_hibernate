/**
 * Created by lxg on 4/28/15.
 */
package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/home")
public class HomeController {
    @RequestMapping(method = RequestMethod.GET)
    public String printHome(ModelMap model) {
        model.addAttribute("message", "刘小光123");
        return "home";
    }
}