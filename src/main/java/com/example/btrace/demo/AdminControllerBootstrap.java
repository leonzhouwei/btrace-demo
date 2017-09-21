package com.example.btrace.demo;

public class AdminControllerBootstrap {

	public static void main(String[] args) throws InterruptedException {
		AdminController target = new AdminController();

		for (int i = 0; i < Integer.MAX_VALUE; ++i) {
			Thread.sleep(3000);
			target.sayHello("" + i, i);
		}
	}

}
