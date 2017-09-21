package com.example.btrace.demo;

import static com.sun.btrace.BTraceUtils.println;

import com.sun.btrace.annotations.BTrace;
import com.sun.btrace.annotations.Duration;
import com.sun.btrace.annotations.Kind;
import com.sun.btrace.annotations.Location;
import com.sun.btrace.annotations.OnMethod;
import com.sun.btrace.annotations.Return;

@BTrace
public class AdminControllerBTrace {

	@OnMethod(clazz = "com.example.btrace.demo.AdminController", method = "sayHello", location = @Location(Kind.RETURN) )
	public static void sayHello(String name, int age, @Return String result, @Duration long duration) {
		println("============================================================");
		println("name: " + name);
		println("age: " + age);
		println("@return: " + result);
		println("@duration: " + duration / 1000000 + "ms");
	}

}
