/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10115109.latihan39.nilaiterbesardanterkecil;
import java.util.Scanner;

/**
 *
 * @author nama : indri yuliyanti
 *          nim : 10115109
 *          kls : pbo ulang
 *          tugas pert 3 : menghitung Nilai terbesar dan terkecil
 */
public class Pboulang10115109Latihan39Nilaiterbesardanterkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("    Program Nilai terbesar dan terkecil nilai mahasiswa    ");
       
        System.out.println("");

        // 2. Variabel
        int jml_data;
        
        Scanner input = new Scanner(System.in);

        // 3. Output dan Input dari User
        
        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        
        jml_data = input.nextInt();
        int data[] = new int[jml_data];
         
        // 4. Proses Perhitungan dan Hasil Output
        System.out.println("");
        for (int i = 0; i < jml_data; i++) {
            System.out.printf("Masukkan data ke-%d: ", (i + 1));
            data[i] = input.nextInt();
        }

        for (int x = 0; x < jml_data - 1; x++) {
            for (int i = 0; i < jml_data - 1; i++) {
                if (data[i] < data[i + 1]) {
                    int j = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = j;
                }
            }
        }
        System.out.println("");
        System.out.println("Hasil pengurutan bilangan: ");
        for (int a = 0; a < jml_data; a++) {
            System.out.print(data[a] + ", ");
        }
        System.out.println("");

        // 5. Footer
        System.out.println("");
        System.out.println("  develop BY: indri yuliyanti  ");
        
    
        
        
    }
    
}
