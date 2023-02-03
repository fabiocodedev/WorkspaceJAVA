package controller;

import java.util.ArrayList;

public interface ICRUD<T> {

	public void create(T object);
	public ArrayList<T> read(); // SELECT * FROM user; 
	public boolean update(T object, int id);
	public void delete( T object);
	public T findById(int id); // SELECT id,nom,prenom,email,pwd FROM user WHERE id = 5;
	
}
