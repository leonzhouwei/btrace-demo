package com.example.btrace.demo;

public class AdminController {

	public String sayHello(String name, int age) {
		try {
			long rand = System.currentTimeMillis() % 100;
			Thread.sleep(100 + rand);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "hello everyone";
	}

}
