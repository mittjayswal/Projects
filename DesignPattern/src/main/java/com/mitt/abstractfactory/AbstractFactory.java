package com.mitt.abstractfactory;

public interface AbstractFactory<T> {
	T create(String type);
}
