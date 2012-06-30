import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class WikiTest {
    @Test
    public void shouldMakeSomeOutput() throws Exception {
        Wiki.main(new String[0]);

        String result = readFile("output/StandAlone.html");

        assertThat(result, equalsIgnoreSpace("<html><body>This is a stand-alone page about one thing.</body></html>"));
    }

    private static Matcher<String> equalsIgnoreSpace(final String s) {
        return new BaseMatcher<String>() {
            public boolean matches(Object o) {
                return s.trim().equals(((String)o).trim());
            }

            public void describeTo(Description description) {
                description.appendText("a string equal (ignoring whitespace) to \"" + s + "\"");
            }
        };
    }

    private String readFile(String fileName) throws IOException {
       ByteArrayOutputStream result = new ByteArrayOutputStream();
       PrintStream resultStream = new PrintStream(result);
       BufferedReader reader = new BufferedReader(new FileReader(fileName));
       while (reader.ready()) {
          resultStream.println(reader.readLine());
       }
       reader.close();
       return result.toString();
    }
}
