package com.example.springFramework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	/*
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	
        Product p1 = (Product)context.getBean("jeans");
    	Product p2 = (Product)context.getBean("tshirt");
    	//p1.id=12321;
    	//p1.name="asdsad";
    	//p1.manufacturer="sadasd";
       // System.out.println(p1.id+". "+p1.name+"\t"+p1.manufacturer);
    	System.out.println(p1);
    	System.out.println(p2);
    	Product boot = (Product) context.getBean("boots");
    	System.out.println(boot);
    	
    	Distributor dis = (Distributor) context.getBean("dist");
    	System.out.println(dis);
    	*/
    	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    	Distributor newdis= (Distributor) context.getBean("getDistributor");
    	System.out.println(newdis);
    	Product pd = (Product)context.getBean("product");
    	System.out.println(pd);
    	
    }
}
