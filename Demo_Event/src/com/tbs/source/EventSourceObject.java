/**
 * 
 */
package com.tbs.source;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.tbs.bean.CusEvent;
import com.tbs.listener.CusEventListener;

/**
 * @ClassName: EventSourceObject.java
 * @Description: 该类的功能描述
 *
 * @version: v1.0.0
 * @author: changhf
 * @date: 2019年9月9日 下午2:04:56 
 *
 */
public class EventSourceObject {
	
	private String name;
	
	private Set<CusEventListener> listener;

	/**
	 * 
	 */
	public EventSourceObject() {
		this.listener=new HashSet<CusEventListener>();
		this.name="defalutName";
	}
	/**
	 * 给事件源添加监听器
	 * @Function: EventSourceObject.java
	 * @Description: 该函数的功能描述
	 *
	 * @param:描述1描述
	 * @return：返回结果描述
	 * @throws：异常描述
	 *
	 * @version: v1.0.0
	 * @author: changhf
	 * @date: 2019年9月9日 下午2:10:56
	 */
	public void addEventListener(CusEventListener  cel) {
		this.listener.add(cel);
	}
	
	protected void notfies() {
		CusEventListener cel = null;
		Iterator<CusEventListener> itertor=this.listener.iterator();
		while(itertor.hasNext()) {
			cel=itertor.next();
			cel.fireCusEvent(new CusEvent(this));
		}
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		if(!this.name.equals(name)) {
			this.name=name;
			this.notfies();
		}
	}
	
	
}
