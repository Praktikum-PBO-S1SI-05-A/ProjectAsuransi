/**
 *
 * @author YASYKUR MF
 */

package praktikum.pbo.projectasuransi;

public class Sales extends Pegawai {
    
    private int gajiPokok, jumlahPelanggan;
    
    public Sales(String nama, String nip, String alamat, int tahunMasukKerja, int gajiPokok, int jumlahPelanggan) {
        
        super(nama, nip, alamat, tahunMasukKerja);
        this.gajiPokok = gajiPokok;
        this.jumlahPelanggan = jumlahPelanggan;
    }
    
    @Override
    public int hitungGajiAkhir() {
        
        int komisi = 50000 * jumlahPelanggan;
        
        return gajiPokok + komisi;
    }
    
    public void cetakSales() {
        
        System.out.println(">SALES");
        super.cetakPegawai();
        System.out.println("Gaji Pokok       : Rp " + gajiPokok);
        System.out.println("Jumlah Pelanggan : " + jumlahPelanggan);
        System.out.println("Gaji Akhir       : Rp " + hitungGajiAkhir());
        System.out.println();
    }
}
