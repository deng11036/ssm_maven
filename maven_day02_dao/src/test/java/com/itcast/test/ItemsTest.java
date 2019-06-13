package com.itcast.test;

import com.itcast.dao.ItemsDao;
import com.itcast.domain.Items;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsTest {
    @Test
    public void test(){
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext-dao.xml");
        ItemsDao dao = app.getBean(ItemsDao.class);
        Items items = dao.findById(1);
        System.out.println(items.getCreatetime());
    }
}
