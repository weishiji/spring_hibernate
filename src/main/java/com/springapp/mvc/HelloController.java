package com.springapp.mvc;

import com.google.gson.Gson;
import com.springapp.model.ActionLogEntity;
import com.springapp.model.UserEntity;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.tutorial.util.HibernateUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;


@Controller
@RequestMapping("/")
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) throws Exception {
        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();
        String sql = "FROM com.springapp.model.UserEntity";
        Query query = session.createQuery(sql);
        List results = query.list();

        Gson gson = new Gson();
        String jsonStr = gson.toJson(results);

        model.addAttribute("message", jsonStr);

       // this.testConnection(al);
        return "hello";
	}
    public void testConnection(ActionLogEntity _al) throws Exception {
        Session session = HibernateUtil.getSession();
        Transaction tx = session.beginTransaction();
        String sql = "FROM com.springapp.model.UserEntity";
        Query query = session.createQuery(sql);
        List results = query.list();

        Gson gson = new Gson();
        String jsonStr = gson.toJson(results);
        System.out.print(jsonStr);
        try {
            UserEntity ue = new UserEntity();

            ue.setId((int) Math.random());
            ue.setName("123");
            session.save(ue);
            tx.commit();
        } catch (Exception ex) {
            tx.rollback();
        } finally {
            session.close();
        }
    }

}