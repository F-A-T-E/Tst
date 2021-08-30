package com.java.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.lang.model.element.VariableElement;
/**
 * 环境jdk11
 * @author lpf18
 *
 */
public class TextIo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * PrintWriter out = new PrintWriter(new OutputStreamWriter(new
		 * PrintStream("C:\\io\\input.txt"),StandardCharsets.UTF_8));
		 * 
		 * out.print("asbjdjwbfj");
		 */
		
		
		//var out = new PrintWriter("D:\\io\\input.txt", StandardCharsets.UTF_8);
		//var out = new PrintWriter(new PrintStream("D:\\io\\input.txt", StandardCharsets.UTF_8));
		
		
		String name = "Harry Hacker111";
		double salary = 75000;
		/*
		 * out.print(name); out.print(' '); out.print(salary); out.close(); Path path =
		 * Paths.get("D:\\io\\input.txt"); var content = Files.readString(path,
		 * StandardCharsets.UTF_8);
		 */
		
		//System.out.println(content);
		
		
		
	}

}
