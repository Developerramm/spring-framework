package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.User;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ApplicationContext context = null;

        User user = null;

        context = new ClassPathXmlApplicationContext("config.xml");

        user = (User) context.getBean("user");
        user.showUser();

        System.out.println(user.hashCode());

        System.out.println(context);

        System.out.println(context.getClass().getName());

        ((AbstractApplicationContext) context).close();
    }
}