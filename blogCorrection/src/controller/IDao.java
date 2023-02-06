package controller;

import java.util.ArrayList;

public interface IDao<T> {
	public boolean create(T objet);
	public ArrayList<T> read();
}