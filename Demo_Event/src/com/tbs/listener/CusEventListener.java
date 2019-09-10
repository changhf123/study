/**
 * 
 */
package com.tbs.listener;

import java.util.EventListener;

import com.tbs.bean.CusEvent;
import com.tbs.source.EventSourceObject;

/**
 * @ClassName: CusEventListener.java
 * @Description: 该类的功能描述
 *
 * @version: v1.0.0
 * @author: changhf
 * @date: 2019年9月9日 下午2:06:38 
 *
 */
public class CusEventListener implements EventListener {
	
	public void fireCusEvent(CusEvent e) {
		EventSourceObject eso=(EventSourceObject)e.getSource();
		System.out.println("My name has been changed!");
		System.out.println("I got a new name,named \""+eso.getName()+"\"");
	}

}
