package UAS_IshabellElmisaa.model;
import java.util.List;
/**
 *
 * @author isabel
 */
public interface WarnetDao {
    void save(Warnet warnet);
    void update(int index, Warnet warnet);
    void delete (int index);
    Warnet getWarnet(int index);
    List<Warnet> getAll();
}
