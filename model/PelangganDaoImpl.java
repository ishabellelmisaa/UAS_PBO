package UAS_IshabellElmisaa.model;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author isabel
 */
public class PelangganDaoImpl implements PelangganDao{
    List<Pelanggan> data = new ArrayList<>();

    public PelangganDaoImpl() { 
        data.add(new Pelanggan("2008", "ishabel", "1"));
        data.add(new Pelanggan("2045", "alki", "2"));
        data.add(new Pelanggan("2098", "sam", "Other"));

    }

    public Pelanggan save(Pelanggan pelanggan){
        data.add(pelanggan);
        return pelanggan;
    }

    public Pelanggan update(int index, Pelanggan pelanggan){
        data.set(index, pelanggan);
        return pelanggan;
    }

    public Pelanggan delete(int index){
        return data.remove(index);
    }

    public Pelanggan getPelanggan (int index){
        return data.get(index);
    }

    public List<Pelanggan> getAll(){
        return data;
    }

}
