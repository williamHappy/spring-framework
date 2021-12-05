package cn.will.test2;

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
public class AnnoMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("test2/spring-anno.xml");
		final AnnoA bean = context.getBean(AnnoA.class);
		System.out.println(bean);
	}

}
