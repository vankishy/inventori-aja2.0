import com.inventoriaja.core.DeleteUser;
import org.junit.Test;
import static org.junit.Assert.*;

public class DeleteUserTest {

    @Test
    public void testDeleteUser_penggunaTidakAda() {
        // Menguji dengan pengguna yang kemungkinan tidak ada
        try {
            DeleteUser.deleteUser("PENGGUNA_TIDAK_ADA_999");
            assertTrue(true);
        } catch (Exception e) {
            fail("Eksepsi tak terduga: " + e.getMessage());
        }
    }
}