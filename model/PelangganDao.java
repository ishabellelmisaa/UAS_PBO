package UAS_IshabellElmisaa.model;
import java.util.List;
/**
 *
 * @author isabel
 */
public interface PelangganDao {
    Pelanggan save(Pelanggan pelanggan);
    Pelanggan update(int index, Pelanggan pelanggan);
    Pelanggan delete(int index);
    Pelanggan getPelanggan(int index);
    List<Pelanggan> getAll();
}
