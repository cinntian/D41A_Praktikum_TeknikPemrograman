package assosiation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Cintia
 * @since 19/03/2022
 */
public class Assosiation {
    public static void main(String[] args) {
        Prodi prodi = new Prodi();
        prodi.setProdi("Teknik Informatika");
        
        mataPelajaran mapel1 = new mataPelajaran();
        mapel1.setMataPelajaran("Teknik Pemrograman");
        mataPelajaran mapel2 = new mataPelajaran();
        mapel2.setMataPelajaran("Struktur Data Algoritma");
        mataPelajaran mapel3 = new mataPelajaran();
        mapel3.setMataPelajaran("Proyek 1");
        mataPelajaran mapel4 = new mataPelajaran();
        mapel4.setMataPelajaran("Dasar-Dasar Pemrograman");
        mataPelajaran mapel5 = new mataPelajaran();
        mapel5.setMataPelajaran("Matematika Diskrit");
        
        List<mataPelajaran> mpList = new ArrayList();
        mpList.add(mapel1);
        mpList.add(mapel2);
        mpList.add(mapel3);
        mpList.add(mapel4);
        mpList.add(mapel5);
        
        prodi.setProdi(mpList);
        
        System.out.println(prodi.getMapel() + " adalah mata pelajaran dalam prodi " + prodi.getProdi());    
    }
}
