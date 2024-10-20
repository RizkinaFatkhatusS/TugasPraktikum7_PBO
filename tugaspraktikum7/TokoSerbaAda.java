/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugaspraktikum7;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class TokoSerbaAda {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Masukan Jumlah Item Barang :");
       int JumlahItem = scanner.nextInt();
       
       String[] KodeBarang = new String[JumlahItem];
       String[] NamaBarang = {"Pulpen","Buku","Pensil","Spidol","Penghapus"};
       int[] HargaBarang = {5000,4000,3000,6000,2000};
       int[] JumlahBeli = new int[JumlahItem];
       int[] JumlahBayar = new int[JumlahItem];
       int TotalBayar = 0;
       
           for (int i = 0; i < JumlahItem; i++){
               System.out.println("Data Ke- " + (i + 1));
               System.out.println("Masukan Kode Barang:");
               KodeBarang[i] = scanner.next();
               System.out.println("Masukan Jumlah Yang Dibeli : ");
               JumlahBeli[i] = scanner.nextInt();
               
               int index = Integer.parseInt(KodeBarang[i])-1;
               
               JumlahBayar[i] = HargaBarang[index] * JumlahBeli[i];
               TotalBayar += JumlahBayar[i];
           }
           
           for (int i = 0; i < JumlahItem; i++){
               for ( int j = i + 1; j < JumlahItem; j++){
                   if (HargaBarang[i] > HargaBarang[i]){
                       
                       int TempHarga = HargaBarang[i];
                       HargaBarang[i] = HargaBarang[i];
                       HargaBarang[j] = TempHarga;
                       
                       String TempNama = NamaBarang[i];
                       NamaBarang[i] = NamaBarang[j];
                       NamaBarang[j] = TempNama;
                       
                       String TempKode = KodeBarang[i];
                       KodeBarang[i] = KodeBarang[j];
                       KodeBarang[j] = TempKode;
                       
                       int TempJumlahBeli = JumlahBeli[i];
                       JumlahBeli[i] = JumlahBeli[j];
                       JumlahBeli[j] = TempJumlahBeli;
                       
                       int TempJumlahBayar = JumlahBayar[i];
                       JumlahBayar[i] = JumlahBayar[j];
                       JumlahBayar[j] = TempJumlahBayar;
                   }
               }
           }
        System.out.println("\nTOKO SERBA ADA");
        System.out.println("************************");
        System.out.println("No\tKode BArang\tNama Barang\tHarga\tJumlah Beli\tJumlah Bayar");
        System.out.println("========================================================================================");
        for ( int i = 0; i < JumlahItem; i++){
            int index = Integer.parseInt(KodeBarang[i])- 1;
            System.out.println(( i + 1) + "\t" + KodeBarang[i] + "\t\t" + NamaBarang[index] + "\t\t" + HargaBarang[index] + "\t" + JumlahBeli[i] + "\t\t" + JumlahBayar[i]);
        }
        System.out.println("========================================================================================");
        System.out.println("Total Bayar : " + TotalBayar);
        scanner.close();
    }
    
}
