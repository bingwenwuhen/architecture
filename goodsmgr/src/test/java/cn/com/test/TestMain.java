package cn.com.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.SpringVersion;

/**
 * Created by xiaxuan on 16/8/16.
 */
public class TestMain {

    @Test
    public void testSpringVersion() {
        System.out.println(SpringVersion.getVersion());
    }

    public void testBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext();
        context.getBean("");
    }
}
