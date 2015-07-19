package custom.xpath;

import com.google.common.base.CaseFormat;

public class CustomXpath {
	
	/**
	 * Returns lower camel case of the given String input.  
	 *
	 * @param  elementName local name of the xml element.
	 * @return        	   Converted String as lower camel case.
	 * @see                CaseFormat
	 */
	public static String toLowerCamelCase(String elementName) {

		return CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_CAMEL, elementName);

	}
}
