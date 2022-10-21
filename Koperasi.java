import java.text.DecimalFormat;
import java.io.*;
import java.util.Scanner;
public class Koperasi {
 // Ahmad Panjalu R5R (202043501452)
 
 private static Object tanyalagi;
 public static void main(String[] args) {
  
  BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
  Scanner in = new Scanner(System.in);
  DecimalFormat digit = new DecimalFormat("0.00");
  
  int lama;
  String nm = "";
  String tny;
  String tanyalagi;
  double utang;
  double bunga;
  double bunga1;
  double angsur;
  double sisa;
  double total = 0;
  double bayar;
  double totbunga = 0;
  
  System.out.println("PROGRAM HITUNG ANGSURAN KOPERASI SIMPAN PINJAM");
  System.out.println("=================================================");
  System.out.print("Silahkan isi nama anda = ");
  try {
   nm = input.readLine();
  } catch (IOException e){
   System.out.println("Error!");
  }
  System.out.print("Besar Pinjaman   = ");
  utang = in.nextInt();
  System.out.print("Lama Angsuran (bulan)  = ");
  lama = in.nextInt();
  System.out.println("=================================================");
  
  for(int a=1;a<=lama;a++) {
   angsur=utang/lama;
   sisa=utang-angsur*a;
   bunga=utang/(sisa+angsur);
   bunga1=(bunga*utang)/100;
   bayar=bunga1+angsur;
   total+=bayar;
   totbunga+=bunga1;
   
   System.out.println();
   System.out.println("Bulan ke-" + a);
   System.out.println("--------------------------------------------");
   System.out.println("Suku bunga  = " + digit.format(bunga) + "%");
   System.out.println("Besaran bunga  = Rp " + digit.format(bunga1));
   System.out.println("Bayar   = Rp " + digit.format(bayar));
   System.out.println("Sisa Pinjaman  = Rp " + digit.format(sisa));
   System.out.println("--------------------------------------------");
   
  }
  
   System.out.println();
   System.out.println("=================================================");
   System.out.println("Nama peminjam    =  " +nm);
   System.out.println("Pinjaman awal   = Rp " +utang);
   System.out.println("Total bunga   = Rp " +digit.format(totbunga));
   System.out.println("Total (termasuk bunga)  = Rp " +digit.format(total));
   System.out.println("=================================================");
   System.out.println();
  
  //Looping
   System.out.print("Apakah data yang masuk sudah benar (y/n) : ");
   tny = in.next();
   
   if (tny.equalsIgnoreCase("y")){
    Terimakasih();
    }
   else {
    ulang();
   }
   
 }
 private static void Terimakasih(){  
   System.out.println();
   System.out.println("=================================================");
   System.out.println("                  TERIMA KASIH");
   System.out.println("=================================================");
  }
 private static void ulang(){
  Scanner in = new Scanner(System.in);
  System.out.print("Apakah anda ingin di ulang? (y/) : ");
  Koperasi.tanyalagi = in.next();
  
  if (((String) tanyalagi).equalsIgnoreCase("y")){
   main(null);
  }
  else { 
   Terimakasih();
  }}}