package org.example.demo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String arg[])throws Exception
    {
        try
        {
            ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
            Coach c=context.getBean("cricket",Cricket.class);
            System.out.print(c.getPractiseInfo());
            System.out.print(c.getOffer());
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
    }
}
