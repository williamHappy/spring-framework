package cn.will.test1;

import lombok.Data;

/**
 *  <p>
 *     A
 * </p>
 *
 * @author ctwang
 * @date 2021/12/5
 * @email ctwang1994@163.com
 * @since
 */
@Data
public class XmlA {

	private XmlB b;

	@Override
	public String toString() {
		return "A{b@b}";
	}

}
