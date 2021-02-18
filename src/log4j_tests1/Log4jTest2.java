package log4j_tests1;

import org.apache.logging.log4j.*;

public class Log4jTest2 {

	// 
	private static Logger log = LogManager.getLogger(Log4jTest2.class.getName());
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create  a debug log
		log.trace("This is a trace log in Test 2");
		
		// Create  a debug log
		log.debug("This is a debug log in Test 2");
		
		// Create an information log
		log.info("This is an info log in Test 2");
		
		// Create  a debug log
		log.warn("This is a warn log in Test 2");
		
		// Create an error log
		log.error("This is an error log in Test 2");
		
		// Create a fatal error log
		log.fatal("This is a fatal log in Test 2");
	}
}
