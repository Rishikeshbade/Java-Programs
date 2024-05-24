package junit;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ SqaureTest.class, TestCountA.class })
public class AllTests {

}
