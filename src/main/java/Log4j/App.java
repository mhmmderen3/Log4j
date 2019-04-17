package Log4j;

import org.apache.log4j.Logger;
 import org.apache.log4j.PropertyConfigurator;

public class App
{  static  final Logger LOGGER = Logger.getLogger(App.class);
    public static void main( String[] args )
    {
        PropertyConfigurator.configure("C:\\Users\\Win10\\Desktop\\Log4jExample4\\src\\main\\resources\\log4j.properties");
        LOGGER.debug("debug message");
        LOGGER.info("info message");
        LOGGER.warn("warn message");
        LOGGER.error("error message");
        LOGGER.fatal("fatal message");
    }
}