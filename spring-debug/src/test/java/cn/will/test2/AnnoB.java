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
public class AnnoB {

	@Autowired
	private AnnoA a;

}
