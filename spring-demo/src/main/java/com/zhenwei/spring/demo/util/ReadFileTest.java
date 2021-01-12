package com.zhenwei.spring.demo.util;

import org.springframework.core.io.ClassPathResource;

import java.io.*;

public class ReadFileTest {

	public static void main(String[] args) throws IOException {

		ClassPathResource resource = new ClassPathResource("test");
		File file = resource.getFile();
		String absolutePath = file.getAbsolutePath();
		System.out.println("--> the file path:" + absolutePath);
		InputStream inputStream = resource.getInputStream();
		InputStreamReader reader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(reader);
		String text = bufferedReader.readLine();
		System.out.println("--> " + text);

	}


}
