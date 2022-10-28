package aka.sample.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestUtil {

	public static String readFile(String filePath) {
		try {
			return String.join(System.lineSeparator(), Files.readAllLines(Paths.get(filePath)));
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}

	}

}
