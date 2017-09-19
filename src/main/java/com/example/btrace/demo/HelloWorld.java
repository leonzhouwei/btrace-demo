package com.example.btrace.demo;

import static com.sun.btrace.BTraceUtils.println;

import com.sun.btrace.annotations.BTrace;
import com.sun.btrace.annotations.OnMethod;

@BTrace
public class HelloWorld {

	@OnMethod(clazz = "java.lang.Integer", method = "toString")
	public static void onThreadStart() {
		println("before java.lang.Integer.toString()!");
	}

}
