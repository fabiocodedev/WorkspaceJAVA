package controller;

import java.util.ArrayList;

public interface IDAO<T>{
	
	public Boolean create(T objet);
	public ArrayList<T> read();
	
	
}
