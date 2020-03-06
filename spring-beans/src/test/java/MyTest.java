import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @author wuya
 * @description
 * @Date 2019/9/10
 */
public class MyTest {

	@Test
	public void test1() {
		BeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource(""));
	}
}
