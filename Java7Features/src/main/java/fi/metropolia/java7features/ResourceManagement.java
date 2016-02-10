package fi.metropolia.java7features;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

// Oh god how did this get here I'm not good with computer make it stop
public class ResourceManagement {

	private Scanner scanner;

	public Scanner getScanner() {
		return scanner;
	}

	public String read() throws IOException {
		try (InputStream is = new ByteArrayInputStream("string".getBytes());
				Scanner scanner = new Scanner(is);) {
			this.scanner = scanner;
			scanner.useDelimiter("\\A");
			return scanner.hasNext() ? scanner.next() : "";
		}
	}

}
