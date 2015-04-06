package wtm;

import javax.xml.parsers.*;

import org.w3c.dom.Document;

import javafx.scene.control.TextField;

public class FileParser {
	
	String fileString;
	
	public FileParser(String fileToParse) {
		fileString = fileToParse;
	}

	public TextField create() {
		TextField tf = new TextField();
		try {
			DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document doc = builder.parse(fileString);
			
			//Node node = doc.getElementsByTagName("FullList");
			
			
		} catch(Exception e) {
			//no catch
		}
		return tf;
	}
	
	

}
