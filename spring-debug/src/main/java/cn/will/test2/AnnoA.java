package cn.will.test2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *  <p>
 * </p>
 *
 * @author ctwang
 * @date 2021/12/5
 * @email ctwang1994@163.com
 * @since
 */
@Service
public class AnnoA {

	@Autowired
	private AnnoB b;

	@Override
	public String toString() {
		return "AnnoA{a}";
	}
}
