package UAS_IshabellElmisaa.model;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author isabel
 */
public class WarnetDaoImpl implements WarnetDao{
    private List<Warnet> data = new ArrayList();

    public WarnetDaoImpl() {

    }

    public void save(Warnet warnet){
        data.add(warnet);
    }

    public void insert(Warnet warnet){
        data.add(warnet);
    }

    public void update(int index,Warnet warnet){
        data.set(index,warnet);
    }

    public void delete(int index){
        data.remove(index);
    }

    public Warnet getWarnet(int index){
         return data.get(index);
     }

    public List <Warnet> getAll(){
         return data;
     }
}
