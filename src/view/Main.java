package view;

import controller.Directory;

public class Main {

	public static void main(String[] args) {
		
		Directory d = new Directory();
		String path = "C:/temp";
		
		try {
			d.list(path);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
