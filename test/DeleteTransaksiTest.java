import com.inventoriaja.core.DeleteTransaksi;
import org.junit.Test;
import static org.junit.Assert.*;

public class DeleteTransaksiTest {

    @Test
    public void testDeleteData_tanggalTidakAda() {
        // Menguji dengan tanggal yang kemungkinan tidak ada
        try {
            DeleteTransaksi.deleteData("2025-12-31 00:00:00");
            assertTrue(true);
        } catch (Exception e) {
            fail("Eksepsi tak terduga: " + e.getMessage());
        }
    }
}