/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118038.latihan43.gajipegawai;
import java.util.Scanner;
/**
 *
 * @author Lingga
 * NAMA : Lingga Purnama Al Hamdi
 * KELAS : IF1
 * NIM : 10118038
 * Deskripsi Program : program ini berisi program yang akan menampilkan Gaji Pegawai
 */
public class IF110118038Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GajiPegawai gp = new GajiPegawai();
        System.out.println("### Data Gaji Karyawan PT. KAKATU ###");
        System.out.println("--------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nama Karyawan : ");
        gp.setNama(sc.nextLine());
        System.out.print("Alamat : ");
        gp.setAlamat(sc.nextLine());
        System.out.print("Uang Transport : Rp. ");
        gp.setUangTransport(sc.nextInt());
        System.out.print("Uang Tunjangan : Rp. ");
        gp.setUangTunjangan(sc.nextInt());
        System.out.print("Gaji Pokok : Rp. ");
        gp.setGajiPokok(sc.nextInt());
        gp.setTotalGaji(gp.totalGaji(gp.getUangTunjangan(), gp.getUangTransport(), gp.getGajiPokok()));
        System.out.println("TOTAL GAJI : Rp." + gp.getTotalGaji());
        
        
    }
    
}
