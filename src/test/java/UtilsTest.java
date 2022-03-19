import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {
    private Utils utils;
    @BeforeEach
    void setUp() {
        utils = new Utils();
        System.out.println("Before CalculatorTest.class");

    }

    @AfterEach
    void tearDown() {
        utils = null;
        System.out.println("After CalculatorTest.class");
    }

    @Test
    void testCreateWorkDir() {
        Assertions.assertEquals(true, utils.createWorkDir());
    }

    @Test
    void tesMakeDir() {
        Assertions.assertNull(utils.makeDir("srcd"));
    }

    @Test
    void writeLog() {
        String logFile = "games" + File.separator + "temp" + File.separator + "temp.txt";
        File file = new File(logFile);
        Assertions.assertEquals(true, file.exists());
    }
}