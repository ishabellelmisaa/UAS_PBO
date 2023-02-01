package UAS_IshabellElmisaa.model;

import java.util.List;

/**
 *
 * @author isabel
 */
public class Pelanggan {
    private String kode;
    private String namapelanggan;
    private String jenispelanggan;

    public Pelanggan() {

    }

    public Pelanggan(String kode, String namapelanggan, String jenispelanggan) {
        this.kode = kode;
        this.namapelanggan = namapelanggan;
        this.jenispelanggan = jenispelanggan;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNamapelanggan() {
        return namapelanggan;
    }

    public void setNamapelanggan(String namapelanggan) {
        this.namapelanggan = namapelanggan;
    }

    public String getJenispelanggan() {
        return jenispelanggan;
    }

    public void setJenispelanggan(String jenispelanggan) {
        this.jenispelanggan = jenispelanggan;
    }


}
