package impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by wy on 2017/4/13.
 */
public class Provider {
        public static void main(String[] args) throws IOException {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider2.xml");
            System.out.println(context.getDisplayName() + ": here");
            context.start();
            System.out.println("2服务已经启动...");
            System.in.read();
        }
    }

