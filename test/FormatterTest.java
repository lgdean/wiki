import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class FormatterTest {

    private Formatter formatter = new Formatter();

    @Test
    public void shouldTurnStarredTextBold() {
        assertEquals("This is a <b>test</b>.", formatter.format("This is a *test*."));
        assertEquals("<b>This</b> way <b>also</b> works.", formatter.format("*This* way *also* works."));
    }
}
