/**
 * 
 */
package com.tbs.test;

import com.tbs.bean.CusEvent;
import com.tbs.listener.CusEventListener;
import com.tbs.source.EventSourceObject;

/**
 * @ClassName: Test.java
 * @Description: 该类的功能描述
 *
 * @version: v1.0.0
 * @author: changhf
 * @date: 2019年9月9日 下午2:26:37 
 *
 */
public class Test {

	/**
	 * @Function: Test.java
	 * @Description: 该函数的功能描述
	 *
	 * @param:描述1描述
	 * @return：返回结果描述
	 * @throws：异常描述
	 *
	 * @version: v1.0.0
	 * @author: changhf
	 * @date: 2019年9月9日 下午2:26:37 
	 */
	public static void main(String[] args) {
		EventSourceObject object = new EventSourceObject();
		object.addEventListener(new CusEventListener() {
			public void fireCusEvent(CusEvent e) {
				super.fireCusEvent(e);
			}
		});
		object.setName("AiLu");
	}

}
