package test.ywu;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wuya
 * @description
 * @Date 2019/6/20
 */
public class SpringMain {

    @Test
    public void testPackage() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.ywu.demo.spring");
    }

}
