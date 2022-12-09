package cn.mgl;

import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

/**
 * @author MongieLee
 * @version 1.0
 * @date 2022/12/9 13:35
 */
public class SmokeTest {
    @Test
    public void testAdd() {
        String a = System.getProperty("os.name");
        System.out.println(System.getProperty("os.version"));
        System.out.println(System.getenv("JAVA_HOME"));
        System.out.println(a);
        Assert.assertNotNull(a);
    }
}
