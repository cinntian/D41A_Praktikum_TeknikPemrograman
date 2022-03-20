package assosiation;

import java.util.List;

/**
 * @author Cintia
 * @since 19/03/2022
 */
public class Prodi {
    private String Prodi;
    List<mataPelajaran> mapel;

    public String getProdi() {
        return Prodi;
    }

    public void setProdi(String Prodi) {
        this.Prodi = Prodi;
    }
    
    public List<mataPelajaran> getMapel() {
        return mapel;
    }

    public void setMapel(List<mataPelajaran> mapel) {
        this.mapel = mapel;
    }

    public void setProdi(List<mataPelajaran> mapel){
        this.mapel = mapel;
    }
}
