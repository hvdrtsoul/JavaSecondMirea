package com.paradiseco.prac10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProgrammerTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        String arg1 = "junior";
        String arg2 = "middle";
        String arg3 = "senior";

        context.getBean(arg1, Programmer.class).doCoding();
        context.getBean(arg2, Programmer.class).doCoding();
        context.getBean(arg3, Programmer.class).doCoding();
    }
}
