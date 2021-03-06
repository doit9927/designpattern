package com.sxz.dp.singleton;

public class Singleton1 {
	private static Singleton1 instance=new Singleton1();
	private Singleton1(){
		if(instance !=null){
			throw new RuntimeException();
		}
	}
	private static Singleton1 getInstance(){
		return instance;
	}
	public static void main(String []args){
		Singleton1 obj1=Singleton1.getInstance();
		Singleton1 obj2=Singleton1.getInstance();
		System.out.println(obj1==obj2);
	}
}
