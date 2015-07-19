package custom.xpath;

import java.io.File;
import java.io.FileNotFoundException;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import junit.framework.TestCase;

import org.junit.Test;

public class CustomXpathTest extends TestCase {
	public CustomXpathTest() {
	}

	@Test
	public void testToLowerCase() throws FileNotFoundException,
			TransformerException {

		System.setProperty("javax.xml.transform.TransformerFactory",
				"org.apache.xalan.processor.TransformerFactoryImpl");

		simpleTransform("src/test/resources/input.xml",
				"src/test/resources/customXpath.xslt",
				"src/test/resources/out.xml");
	}

	public static void simpleTransform(String sourcePath, String xsltPath,
			String resultDir) {
		TransformerFactory tFactory = TransformerFactory.newInstance();
		try {

			Transformer transformer = tFactory.newTransformer(new StreamSource(
					new File(xsltPath)));
			transformer.transform(new StreamSource(new File(sourcePath)),
					new StreamResult(new File(resultDir)));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
