package com.levelup;

import com.levelup.service.TestComponent;
import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

/**
 * Created by denis_zavadsky on 6/27/15.
 */
public class Standalone {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        TestComponent component = context.getBean(TestComponent.class);
        component.start();
    }
}
