package com.tsi.common;

/**
 * Created by osboxes on 28.11.16.
 */
import java.util.ArrayList;
import java.util.List;

import com.tsi.gprslkwinfo.dao.impl.JdbcGprsLkwInfoDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.tsi.gprslkwinfo.dao.GprsLkwInfoDAO;
import com.tsi.gprslkwinfo.model.GprsLkwInfo;

public class JdbcGprsLkwInfoTemplateApp {
    public static void main( String[] args )
    {
        //if you have time,
        //it's better to create an unit test rather than testing like this :)

        ApplicationContext context =
                new ClassPathXmlApplicationContext("Application-Context.xml");

        GprsLkwInfoDAO gprsLkwInfoDAO = (GprsLkwInfoDAO) context.getBean("jdbcGprsLkwInfoDao");
        GprsLkwInfo gprsLkwInfo1 = new GprsLkwInfo(1,"M BR 2405");

//        gprsLkwInfoDAO.insert(gprsLkwInfo1);

        GprsLkwInfo gprsLkwInfo= gprsLkwInfoDAO.findByGprsLkwInfoLkwId(581631);
        System.out.println("gprsLkwInfo A : " + gprsLkwInfo);

    }
}
