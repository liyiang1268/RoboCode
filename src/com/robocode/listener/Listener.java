package com.robocode.listener;

import java.util.EventListener;
/**
 * 简介：监听器基类，其他事件监听类不应该直接继承自EventListener.
 * 在具体监听类和EventListener中加入一层控制，用于增加拓展性
 */
public interface Listener extends EventListener {

}
