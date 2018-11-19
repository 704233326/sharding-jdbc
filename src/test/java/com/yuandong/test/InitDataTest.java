package com.yuandong.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.yuandong.SpringBootWebApplication;
import com.yuandong.repository.OrderRepository;

@RunWith(SpringJUnit4ClassRunner.class)
//指定我们SpringBoot工程的Application启动类
@SpringApplicationConfiguration(classes = SpringBootWebApplication.class)
//由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration
@WebAppConfiguration
public class InitDataTest {
    @Autowired
    OrderRepository orderRepository;
    

    @Before
    public void initData(){
       
        try {
        	 System.out.println(orderRepository);
		} catch (Exception e) {
			e.printStackTrace();
		}
        
    }
    
    @Test
    public void testSave(){
    	System.out.println("*********");
    }
    
   
    
}
