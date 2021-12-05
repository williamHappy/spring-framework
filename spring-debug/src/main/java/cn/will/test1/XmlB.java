package cn.will.test1;

import lombok.Data;

/**
 *  <p>
 *     B
 * </p>
 *
 * @author ctwang
 * @date 2021/12/5
 * @email ctwang1994@163.com
 * @since
 */
@Data
public class XmlB {

	private XmlA a;

	@Override
	public String toString() {
		return "B{a@a}";
	}
}
