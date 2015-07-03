package com.robocode.event;
import java.util.EventObject;
/**
 * 简介：事件基类，其他事件类不应该直接继承自EventObject.
 * 在具体事件类和EventObject中加入一层控制，用于增加拓展性
 */
public class Event extends EventObject{

	private static final long serialVersionUID = 1L;
	public Event(Object arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

}
