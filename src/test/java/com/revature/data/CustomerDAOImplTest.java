package com.revature.data;

import com.revature.annotations.SpringAnnotationConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class CustomerDAOImplTest {
    @Test
    public void getCustomerById() {
        AbstractApplicationContext context =
                new AnnotationConfigApplicationContext(SpringAnnotationConfig.class);

        DataFacade facade = context.getBean("facade", DataFacade.class);
        System.out.println(facade.getCustomerById(1));
        context.registerShutdownHook();
    }
}
