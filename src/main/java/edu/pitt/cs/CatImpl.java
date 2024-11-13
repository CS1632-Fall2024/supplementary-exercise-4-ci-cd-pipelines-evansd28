package edu.pitt.cs;

public class CatImpl implements Cat {

	// TODO: Fill in with member variables
	private int idnum;
	private String catname;
	private boolean isRented;

	public CatImpl(int id, String name) {
		idnum = id;
		catname = name;
	}

	public void rentCat() {
		// TODO: Fill in
		isRented = true;
	}

	public void returnCat() {
		// TODO: Fill in
		isRented = false;
	}

	public void renameCat(String name) {
		// TODO: Fill in
		catname = name;
	}

	public String getName() {
		// TODO: Fill in
		return catname;
	}

	public int getId() {
		// TODO: Fill in
		return idnum;
	}

	public boolean getRented() {
		// TODO: Fill in
		return isRented;
	}

	public String toString() {
		// TODO: Fill in
		return "ID "+idnum+". "+catname;
	}

}