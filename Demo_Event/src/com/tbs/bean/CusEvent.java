/**
 * 
 */
package com.tbs.bean;

import java.util.EventObject;

/**
 * @ClassName: CusEvent.java
 * @Description: 该类的功能描述
 *
 * @version: v1.0.0
 * @author: changhf
 * @date: 2019年9月9日 下午1:58:07 
 *
 */
public class CusEvent extends EventObject{

	private Object source;
	/**
	 * @param arg0
	 */
	public CusEvent(Object source) {
		super(source);
		this.source=source;
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the source
	 */
	public Object getSource() {
		return source;
	}
	/**
	 * @param source the source to set
	 */
	public void setSource(Object source) {
		this.source = source;
	}
	
	
}
