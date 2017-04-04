package before;
import static org.junit.Assert.assertEquals;
import junit.framework.JUnit4TestAdapter;
import org.junit.*;
import com.hyuki.refbook.StandardOutputTest;

public class MainTest extends StandardOutputTest {
    @Test public void testMain() {
        Main.main(new String[0]);
        String expected = getExpectedOutput(
            "book = [ 0, ���E�̗��j, 4800 ]",
            "dvd  = [ 1, �j���[���[�N�̖��E���ʔ�, 3000 ]",
            "soft = [ 2, �`���[�����O�}�V���G�~�����[�^, 3200 ]");
        String actual = getActualOutput();
        assertEquals(expected, actual);
    }

    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(MainTest.class);
    }
}
