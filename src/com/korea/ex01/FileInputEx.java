package com.korea.ex01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileInputEx {

	public static void main(String[] args) {
		File file = new File("text.txt");
		try {
			InputStream in = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
