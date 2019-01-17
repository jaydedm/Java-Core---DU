import jdk.dynalink.StandardOperation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

import javax.management.openmbean.OpenMBeanOperationInfoSupport;

public class Main {

	public static void main(String[] args) throws IOException {

		List<String> lines1 = readLines("InputFile1.txt");
		List<String> lines2 = readLines("InputFile2.txt");
		appendLines("OutputFile.txt", lines1);
		appendLines("OutputFile.txt", lines2);
	}

	private static List<String> readLines(String inputFile) throws IOException {
		// TODO: use a BufferedReader to read data from the inputFile and then returns all the lines
		// HINT: did you implement a try-with-resources block to automatically close the reader?
		// HINT: did you implement a catch block?
		List<String> lines = new ArrayList<>();

		try {
			String line;
			BufferedReader reader = new BufferedReader(new FileReader(inputFile));
			while ((line = reader.readLine()) != null) {
				lines.add(line);
			}
			System.out.println(lines);
			return lines;

		} catch (Exception e) {
			System.err.format("Exception occured trying to read '%s'.", "InputFile1.txt");
			e.printStackTrace();
			return null;
		}
		// ...

	}

	private static void appendLines(String outputFile, List<String> lines) throws IOException {
		// TODO: Use a BufferedWriter to write out all the lines to the output file.
		//       If outputFile does not exist, create it
		//       If outputFile does exist, append it
		// HINT: did you implement a try-with-resources block to automatically close the writer?
		// HINT: did you implement a catch block?
		//try (BufferedWriter writer = Files.newBufferedWriter(Paths.get("OutputFile.txt"))){
		try (BufferedWriter out = new BufferedWriter(new FileWriter("OutputFile.txt", true))){
			for (String s:lines) {
				out.write(s);
				out.newLine();

			}

				System.out.println("We wrote out");
			}



		 catch (Exception e){
			System.out.println(e.getClass().getSimpleName());
		}
	}
}