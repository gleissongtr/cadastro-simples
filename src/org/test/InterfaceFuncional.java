package org.test;

@FunctionalInterface
public interface InterfaceFuncional {
	void soma(Integer key1, Integer key2);
	
	default void start(String msg) {
		System.out.println(msg);
	}
	
	default void finish(String msg) {
		System.out.println(msg);
	}
	
}