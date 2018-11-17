package pl.finsys.javaconfigExample.impl;

import pl.finsys.javaconfigExample.HelloWorld;

public class HelloWorldImpl implements HelloWorld {

	@Override
	public void printHello(String msg) {

		System.out.println("Hello : " + msg);
	}

}