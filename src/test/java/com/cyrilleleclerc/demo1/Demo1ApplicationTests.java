package com.cyrilleleclerc.demo1;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.FileWriter;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo1ApplicationTests {

	@Test
	public void contextLoads() throws Exception {
		System.out.println("Hello world");
	}

	@Test
	public void testAttachments() throws Exception {
		Assert.assertTrue(true);
		File myattachment = new File("myattachment");

		myattachment.createNewFile();
		FileWriter fileWriter = new FileWriter(myattachment);
		try {
			fileWriter.append("This is a JUnit-attachment sample");
			System.out.println("[[ATTACHMENT|" + myattachment.getAbsolutePath() + "]]");
		} finally {
			fileWriter.close();
		}
	}

}
