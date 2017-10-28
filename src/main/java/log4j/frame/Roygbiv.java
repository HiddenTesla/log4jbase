package log4j.frame;

import org.testng.annotations.Test;

public class Roygbiv extends log4j.Log4jBase {
    @Test
    public void TestColor() throws Exception {
        log.debug("Debug");
        log.info("Info");
        log.warn("Warning");
        log.error("Error");
        log.fatal("Fatal");
    }
}
