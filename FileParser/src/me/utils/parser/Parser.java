package me.utils.parser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

import javax.xml.bind.JAXBException;

import ru.hostco.sumz.save.SaveAutoR;
import ru.hostco.sumz.save.service.SaveService;
import ru.hostco.sumz.save.service.SaveType;
import ru.hostco.utils.xml.UniversalUnmarshaller;

public class Parser {

	public static boolean checkWithRegExp(String userNameString, String pattern) {
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(userNameString);
		return m.matches();
	}

	public static void parseFileWithStream(String fileName) {

		// read file into stream, try-with-resources
		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

			StringBuilder ss = new StringBuilder();
			ss.append("<SaveAuto_R xmlns=");
			ss.append("\"http://www.hostco.ru/sumz");
			ss.append("/save\"");
			ss.append("(.|\\n)*");
			ss.append("</SaveAuto_R>");

			System.out.println(ss.toString());

			Pattern pattern = Pattern.compile(ss.toString());
			stream.map(pattern::matcher).filter(Matcher::find).map(Matcher::group).forEach(System.out::println);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	
	public static void parseFile(String fileName) throws JAXBException {
		
		try {

			File fin = new File(fileName);
			FileInputStream fis = new FileInputStream(fin);

			// Construct BufferedReader from InputStreamReader
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));

			String line = null;
			boolean b = false;

			StringBuilder sb = new StringBuilder();

			int n = 0;
			
			while ((line = br.readLine()) != null) {

				if (line.contains("<SaveAuto_R")) {
					b = true;
				}

				if (line.contains("</SaveAuto_R")) {

					n++;
					b = false;
					sb.append(line);
					System.out.println("processed: " + n);
					System.out.println(sb.toString());

					SaveAutoR request = UniversalUnmarshaller.unmarshall(sb.toString(), SaveAutoR.class);

					Thread t = new Thread(() -> {

						try {
							URL ulr = new URL("http://t-osub-sumz-nd1:8080/sumz-soap-save/SavePort?wsdl");
							SaveService service = new SaveService(ulr);
							SaveType port = service.getSavePort();
							port.saveAuto(request);

						} catch (Exception e) {
							e.printStackTrace();
						}

					});

					t.start();
					
					try {
						Thread.sleep(250);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					sb = new StringBuilder();
					

				}

				if (b) {
					sb.append(line);
				}
			}

			br.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	public static void main(String args[]) throws JAXBException {

		String fileName = "D://pud-logging0.txt";
		String testFileName = "D://test_regex.txt";		
		
		parseFile(fileName);		
		
		System.out.println("finished bleat");		


	}

}
