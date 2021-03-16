//Sourcecode pada file Kasir.java
import java.util.Scanner;   
public class project_uas_ALGORITMA { 
    public static void main(String[]args){
        login();}
        static void login(){
String data[]={"iwan","202013033"};//pendeklarasian tipe data string dalam array
        String nama,sandi;//pendeklarasian variabel untuk menampung sebuah inputan
        System.out.println();
        System.out.println("\t\t\t\t=================================================================");//perintah untul sebuah yang kita inginkan untuk ditampilkan
        System.out.println("\t\t\t\t============================Iwan Mart============================");
        System.out.println("\t\t\t\t=================================================================");
        Scanner dia=new Scanner(System.in);//perintah untuk memasukan sebuah inputan
        System.out.print("\t\t\t\tNama Pengguna : ");//perintah untuk menandakan bahwa kita masukan nama pengguna
        nama=dia.nextLine();//perintah untuk memasukan sebuah inputan untuk nama pengguna
        System.out.print("\t\t\t\tSandi Pengguna : ");//perintah untuk menandakan bahwa kita masukan kata sandi
        sandi=dia.nextLine();//perintah untuk memasukan sebuah inpputan untuk kata sandi
        /**
         * Percabangan untuk mengecek keberadaan 
         * data
         */
        System.out.print("\n\n\n");
        if(nama.equals(data[0])&&sandi.equals(data[1])){//penyeleksian sebuah kondisi
        System.out.println("\t\t\t\t=================================================================");
        System.out.println("\t\t\t\t===================SILAHKAN TENTUKAN PILIHAN ANDA================");
        System.out.println("\t\t\t\t=================================================================");
            menu();//langsung pergi ke menu
        }else{//apabila kondisi tidak terpenuhi
            System.out.println("\t\t\t\tMaaf Nama Pengguna Atau Sandi Tidak Tersedia");//yang akan tampil apabila kondisi tidak terpenuhi
            System.out.println("\t\t\t\tilahkan masukkan ulang kata sandi");
        login();}//menutup perintah else
    }//menutup sebuah perintah
    static void menu(){
        int menu1;
        Scanner menu=new Scanner(System.in);
        System.out.println("\t\t\t\t|*******************************************************|");
        System.out.println("\t\t\t\t|                  silahkan pilih menu                  |");
        System.out.println("\t\t\t\t|                  1.kasir                              |");
        System.out.println("\t\t\t\t|                  2.buble_sort                         |");
        System.out.println("\t\t\t\t|                  3.biodata programers                 |");
        System.out.println("\t\t\t\t|                  4.keluar                             |");
        System.out.println("\t\t\t\t|*******************************************************|");
        System.out.println();
        System.out.print("\t\t\t\tsilahkan masukan pilihan anda\t:");
        menu1=menu.nextInt();
        System.out.println();
        if(menu1==1){
            kasir();
        }
        else if(menu1==2){
            buble_sort();
        }
        else if (menu1==3){
            Biodata_Programers();
        }
else{
    System.exit(0);
}
}
        static void kasir(){
        System.out.println("\t\t\t\t=================================================================");
        System.out.println("\t\t\t\t=======================SELAMAT BERBELANJA========================");
        System.out.println("\t\t\t\t=================================================================");
 System.out.print("\t\t\t\tMasukkan Jumlah Barang yang akan di inputkan :");//perintah yang akan tampil di output
        Scanner brg=new Scanner(System.in);//perintah untuk memasukkan nilai inputan
        Scanner hrg=new Scanner(System.in);
        Scanner bayar=new Scanner(System.in);
        int n=hrg.nextInt();//pendeklarasian sekaligus memasukan nilai
        String barang[]=new String[n];//pendeklarasian variabel dalam bentuk array
        int harga[]=new int[n];
        int jumlah[]=new int[n];
        int total=0;//pendeklarasian variabel
        for (int i=1;i<=n;i++){//stuktur perulangan 
            System.out.print("\t\t\t\tMasukkan Nama barang ke "+i+": ");//perintah yang akan tampil di output
            barang[i-1]=brg.nextLine();//perintah untuk memasukan nama barang
            System.out.print("\t\t\t\tMasukkan harga barang ke "+i+ ": ");
            harga[i-1]=hrg.nextInt();//perintah untuk memasukan nilai barang
            System.out.print("\t\t\t\tMasukkan Jumlah barang ke "+i+": ");
            jumlah[i-1]=hrg.nextInt();////perintah untuk memasukan jumlah barang
            System.out.println("\t\t\t\tPenginputan barang ke "+i+" telah selesai");
            System.out.println("\t\t\t\t================================");
            System.out.println();
        }
        System.out.println();
        System.out.println("\t\t\t\tBarang yang diinputkan adalah sebagai berikut:");
        for (int j=1; j<=n; j++){//perulangan kedua untuk perhitungan
            System.out.println("\t\t\t\tNama Barang yang di beli : ||"+barang[j-1]+"\t||Harga Barang : "+harga[j-1]+"\t||Jumlah Barang: "+jumlah[j-1]);
            total =total+(harga[j-1]*jumlah[j-1]);//rumus total harga keseluruhan
        }
        System.out.println("\t\t\t\t-----------------------------------------------------------");
        System.out.println("\t\t\t\ttotal belanja anda: "+total); 
        System.out.print("\t\t\t\tmasukkan pembayaran     :");
        int bayar1;
        bayar1=bayar.nextInt();
        System.out.println("\t\t\t\tkembalian anda  :"+(bayar1-total));
        System.out.println();
        System.out.println("\t\t\t\t<---------------------------------------->");
        System.out.println("\t\t\t\t<+++++terimah kasih sudah berkunjung+++++>");
        System.out.println("\t\t\t\t<---------------------------------------->");
        //menu();
    }
static void buble_sort() {
  int jumlah,i,j,baskom;
  Scanner scan = new Scanner(System.in);
 
  System.out.print("\t\t\t\tMasukkan Jumlah Bilangan Yang Mau DiInputkan :");
  jumlah = scan.nextInt();
 
  int array[] = new int[jumlah];
  
  System.out.println("\n\t\t\t\tMasukkan " + jumlah+" Buah Bilangan Integer");
  System.out.println("\t\t\t\t===========================================");
  for(i=0; i<jumlah;i++)
  {
   System.out.print("\t\t\t\tBilangan Ke- " + (i+1)+" =");
   array[i]=scan.nextInt();
  }

  System.out.println("\n\t\t\t\tBilangan Belum Terurutnya");
    System.out.print("\t\t\t\t");
  for(int a=0;a<jumlah;a++)
  {
   System.out.print(array[a] +" ");
  }

  for(i=0; i<(jumlah-1);i++)
  {
   for(j=0;j<jumlah-i-1;j++)
   {
    if (array[j] > array[j+1])
    {
     baskom = array[j];
     array[j] = array[j+1];
     array[j+1]=baskom;
    }
   }
  }

  System.out.println("\n\n\t\t\t\tBilangan Terurutnya adalah :");
   System.out.print("\t\t\t\t");
  for(i=0;i<jumlah; i++)
   System.out.print(array[i] +"  ");

    System.out.println("\n\n\t\t\t\t1.ya\t|2. tidak\t|selain itu dia akan kembali ke menu utama");
    System.out.println("\t\t\t\tapakan anda ingin keluar?");
    System.out.print("\t\t\t\tmasukan pilihan\t:");
    Scanner ku=new Scanner(System.in);
    int aku;
    aku=ku.nextInt();
    System.out.println("\n\n");
    if (aku==1){
        System.exit(0);
    }
    else if(aku==2){
       buble_sort();
    }else{
        System.out.println("\n\n");
        menu();
    }
 }
 static void Biodata_Programers(){
    System.out.println("\t\t\t\t<---------------------------------------->");
    System.out.println("\t\t\t\t<           Biodata Programers           >");
    System.out.println("\t\t\t\t<---------------------------------------->");
    System.out.println("\n\t\t\t\tNama\t\t\t:Iwan");
    System.out.println("\t\t\t\ttempat tanggal lahir\t:Tebangan,10 agustus 2002");
    System.out.println("\t\t\t\tAlamat\t\t\t:Labuhan Batu Sumatra Utara");
    System.out.println("\t\t\t\tStatus\t\t\t:Mahasiswa\n\n");
    System.out.println("\n\n\t\t\t\t1.ya\t|2. tidak\t|selain itu dia akan kembali ke menu utama");
    System.out.println("\t\t\t\tapakan anda ingin keluar?");
    System.out.print("\t\t\t\tmasukan pilihan\t:");
    Scanner ku=new Scanner(System.in);
    int aku;
    aku=ku.nextInt();
    System.out.println("\n\n");
    if (aku==1){
        System.exit(0);
    }
    else if(aku==2){
        Biodata_Programers();
    }else{
        System.out.println("\n\n");
        menu();
    }
 }}