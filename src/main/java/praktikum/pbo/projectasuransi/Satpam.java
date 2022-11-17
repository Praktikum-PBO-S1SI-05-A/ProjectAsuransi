/**
 *
 * @author YASYKUR MF
 */

package praktikum.pbo.projectasuransi;

public class Satpam extends Pegawai {
    
    private int gajiPokok, jamLembur;
    
    public Satpam(String nama, String nip, String alamat, int tahunMasukKerja, int gajiPokok, int jamLembur) {
        
        super(nama, nip, alamat, tahunMasukKerja);
        this.gajiPokok = gajiPokok;
        this.jamLembur = jamLembur;
    }
    
    @Override
    public int hitungGajiAkhir() {
        
        int bonus = 10000 * jamLembur;
        
        return gajiPokok + bonus;
    }
    
    public void cetakSatpam() {
        
        System.out.println(">SATPAM");
        super.cetakPegawai();
        System.out.println("Gaji Pokok       : Rp " + gajiPokok);
        System.out.println("Jam Lembur       : " + jamLembur);
        System.out.println("Gaji Akhir       : Rp " + hitungGajiAkhir());
        System.out.println();
    }
}
