package com.example.btrace.demo;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 1000; ++i) {
			Thread.sleep(3000);
			Integer obj = Integer.valueOf(i);
			System.out.println(obj.toString());
		}
	}

}
