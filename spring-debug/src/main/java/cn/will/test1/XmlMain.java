package cn.will.test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *  <p>
 * </p>
 *
 * @author ctwang
 * @date 2021/12/5
 * @email ctwang1994@163.com
 * @since
 */
public class XmlMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("test1/spring-xml.xml");
		XmlA bean = context.getBean(XmlA.class);
		System.out.println(bean);
	}

}
