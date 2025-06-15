import com.inventoriaja.core.EditUser;
import com.inventoriaja.model.User;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class EditUserTest {

    @Ignore("Tes ini memerlukan koneksi database yang valid")
    @Test
    public void testGetUserbyID_idTidakValid() {
        User hasil = EditUser.getUserbyID(999999);
        assertNull(hasil);
    }

    @Ignore("Tes ini memerlukan koneksi database yang valid")
    @Test
    public void testGetUserbyName_namaTidakValid() {
        User hasil = EditUser.getUserbyName("PENGGUNA_INVALID_999");
        assertNull(hasil);
    }

    @Ignore("Tes ini memerlukan koneksi database yang valid")
    @Test
    public void testUpdateUser_inputValid() {
        try {
            boolean sukses = EditUser.updateUser(999999, "Pengguna Uji", "uji@example.com", "katasandi", "admin");
            // Mengharapkan false untuk ID yang tidak ada, tetapi tidak crash
            assertFalse(sukses);
        } catch (Exception e) {
            fail("Eksepsi tak terduga: " + e.getMessage());
        }
    }
}