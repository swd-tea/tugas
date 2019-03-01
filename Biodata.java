
import java.util.Scanner;
class Biodata{
    public static void main (String [] args) {
    
        Scanner scan=new Scanner(System.in);
       
        String nDepan, nBelakang, Almt, Kota, Lahir, Tgl;
       
        System.out.println();
        System.out.println("--------------------------------------");
        System.out.println("Program Tampilan biodata");
        System.out.println("--------------------------------------");
        System.out.println();
        System.out.println("Entry kan  data anda dengan benar!");
        System.out.println();
        System.out.print("Nama Depan     : ");
        nDepan=scan.nextLine();
        System.out.print("Nama Belakanng : ");
        nBelakang=scan.nextLine();
        System.out.print("Alamat         : ");
        Almt=scan.nextLine();
        System.out.print("Kota           : ");
        Kota=scan.nextLine();
        System.out.print("Tempat Lahir   : ");
        Lahir=scan.nextLine();
        System.out.print("Tanggal Lahir  : ");
        Tgl=scan.nextLine();
        System.out.println();
        System.out.println("======================================");
        System.out.println("          Biodata           ");
        System.out.println("======================================");
        System.out.println("Nama Lengkap   : "+nDepan+" "+nBelakang);
        System.out.println("Alamat         :"+Almt+", "+Kota);
        System.out.println("Tmpat/Tgl      :"+Lahir+", "+Tgl);
        System.out.println("======================================");
             
       
    }
}