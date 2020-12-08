package com.zhenwei.spring.learing.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.springframework.core.io.ClassPathResource;

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
