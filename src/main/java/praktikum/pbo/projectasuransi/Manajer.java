/**
 *
 * @author YASYKUR MF
 */

package praktikum.pbo.projectasuransi;

public class Manajer extends Pegawai {
    
    private int gajiPokok, tunjanganJabatan;
    private String divisi;
    
    public Manajer(String nama, String nip, String alamat, int tahunMasukKerja, int gajiPokok, String divisi) {
        
        super(nama, nip, alamat, tahunMasukKerja);
        this.gajiPokok = gajiPokok;
        this.divisi = divisi;
    }
    
    @Override
    public int hitungGajiAkhir() {
        
        int lamaKerja = (2015 - tahunMasukKerja);
        if(lamaKerja <= 3){
            tunjanganJabatan = (gajiPokok * 5/100);
        }
        else{
            tunjanganJabatan = (gajiPokok * 10/100);
        }
        
        return gajiPokok + tunjanganJabatan;
    }
    
    public void cetakManajer() {
        
        System.out.println(">MANAJER");
        super.cetakPegawai();
        System.out.println("Gaji Pokok       : Rp " + gajiPokok);
        System.out.println("Divisi           : " + divisi);
        hitungGajiAkhir();
        System.out.println("Tunjangan        : Rp " + tunjanganJabatan);
        System.out.println("Total Gaji       : Rp " + hitungGajiAkhir());
        System.out.println("\n");
    }
}
