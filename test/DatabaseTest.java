import com.inventoriaja.core.Database;
import org.junit.Test;
import static org.junit.Assert.*;

public class DatabaseTest {

    @Test
    public void testGetInstance() {
        try {
            Database db = Database.getInstance();
            assertNotNull(db);
        } catch (Exception e) {
            fail("Eksepsi tak terduga: " + e.getMessage());
        }
    }
}