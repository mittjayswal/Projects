package com.mitt.creational.abstractfactory;

public interface AbstractFactory<T> {
	T create(String type);
}
