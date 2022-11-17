/**
 *
 * @author YASYKUR MF
 */

package praktikum.pbo.projectasuransi;

public class ProjectAsuransi {

    public static void main(String[] args) {
        
        Satpam S = new Satpam("Rendra", "0042", "Jl. Itik 15", 2000, 300000, 5);
        Sales T = new Sales("Wibisana", "0185", "Jl. Ayam 78", 2006, 500000, 10);
        Manajer M = new Manajer("Adi", "005", "Jl. Angsa 56", 1999, 1500000, "Keuangan");
        
        System.out.println("\n\n==DISPLAY DATA PEGAWAI==\n");
        S.cetakSatpam();
        T.cetakSales();
        M.cetakManajer();
    }
}
