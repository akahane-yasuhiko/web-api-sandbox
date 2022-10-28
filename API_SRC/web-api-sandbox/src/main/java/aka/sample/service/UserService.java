package aka.sample.service;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserService {

    public void test() {
    	String test = "aaa"
    			+ "bbb"
    			+ "ccc"
    			+ "";
    	
    	String jsonSample = "{\r\n"
    			+ "    \"glossary\": {\r\n"
    			+ "        \"title\": \"example glossary\",\r\n"
    			+ "		\"GlossDiv\": {\r\n"
    			+ "            \"title\": \"S\",\r\n"
    			+ "			\"GlossList\": {\r\n"
    			+ "                \"GlossEntry\": {\r\n"
    			+ "                    \"ID\": \"SGML\",\r\n"
    			+ "					\"SortAs\": \"SGML\",\r\n"
    			+ "					\"GlossTerm\": \"Standard Generalized Markup Language\",\r\n"
    			+ "					\"Acronym\": \"SGML\",\r\n"
    			+ "					\"Abbrev\": \"ISO 8879:1986\",\r\n"
    			+ "					\"GlossDef\": {\r\n"
    			+ "                        \"para\": \"A meta-markup language, used to create markup languages such as DocBook.\",\r\n"
    			+ "						\"GlossSeeAlso\": [\"GML\", \"XML\"]\r\n"
    			+ "                    },\r\n"
    			+ "					\"GlossSee\": \"markup\"\r\n"
    			+ "                }\r\n"
    			+ "            }\r\n"
    			+ "        }\r\n"
    			+ "    }\r\n"
    			+ "}";
    	
    	String jsonSample2 ="""
{
    "glossary": {
        "title": "example glossary",
		"GlossDiv": {
            "title": "S",
			"GlossList": {
                "GlossEntry": {
                    "ID": "SGML",
					"SortAs": "SGML",
					"GlossTerm": "Standard Generalized Markup Language",
					"Acronym": "SGML",
					"Abbrev": "ISO 8879:1986",
					"GlossDef": {
                        "para": "A meta-markup language, used to create markup languages such as DocBook.",
						"GlossSeeAlso": ["GML", "XML"]
                    },
					"GlossSee": "markup"
                }
            }
        }
    }
}""";

    	
    log.info("test {}{}",test,jsonSample);	
    		
    	}
    
    

}
