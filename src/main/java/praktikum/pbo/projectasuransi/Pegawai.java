/**
 *
 * @author YASYKUR MF
 */

package praktikum.pbo.projectasuransi;

public class Pegawai {
    
    protected int tahunMasukKerja;
    protected String nama, nip, alamat;
    
    public Pegawai(String nama, String nip, String alamat, int tahunMasukKerja) {
        
        this.nama = nama;
        this.nip = nip;        
        this.alamat = alamat;
        this.tahunMasukKerja = tahunMasukKerja;
    }
    
    public int hitungGajiAkhir() {
        
        return 0;   //tidak digunakan maka dibuat return 0
    }
    
    public void cetakPegawai() {
        System.out.println("NIP              : " + nip);
        System.out.println("Nama             : " + nama);
        System.out.println("Alamat           : " + alamat);
        System.out.println("Tahun Masuk      : " + tahunMasukKerja);
    }
    
}
