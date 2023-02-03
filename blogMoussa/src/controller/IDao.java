package controller;

import java.util.ArrayList;

public interface IDao<T> {
	public Boolean create(T object);
	public ArrayList<T> read();
}
