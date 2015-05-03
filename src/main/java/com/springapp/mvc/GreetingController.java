/**
 * Created by lxg on 4/30/15.
 */
package com.springapp.mvc;
import java.util.List;

import com.google.gson.Gson;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.tutorial.util.HibernateUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GreetingController {
    @RequestMapping(value = "/greeting",method = RequestMethod.GET)
    @ResponseBody
    public String  greeting(){
        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();
        String sql = "FROM com.springapp.model.UserEntity WHERE id=161";
        Query query = session.createQuery(sql);
        List results = query.list();
        System.out.print("----------------------");
        Gson gson = new Gson();
        String jsonStr = gson.toJson(results);

        return  jsonStr;
    }
}
