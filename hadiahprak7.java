import java.util.Scanner;


class hadiahprak7{
	
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		String name;
		String Alamat;
		
		System.out.println("masukkan nama anda : ");
		name=input.nextLine();
		System.out.println("masukkan alamat rumah anda : ");
		Alamat=input.nextLine();
		
		
		
		Proses2 p = new Proses2(name,Alamat);
		Pln2 l = new Proses2(name,Alamat);
		
		p.pilihan();
		p.Pembayaran();
		
		System.out.println("");
		System.out.println("=====Cetak Hasil Pembayaran=====");
		System.out.println("Tanggal : "+p.getTanggal()+"  "+" Waktu sekarang : "+p.getWaktu());
		System.out.println("Nama pelanggan           : "+ l.getNama());
		System.out.println("Alamat pelanggan         : "+ l.getAlamat());
		System.out.println("Harga yang harus dibayar : "+"Rp."+ p.getHarga());
		System.out.println("Jumlah uang yg diberikan : "+"Rp."+ p.getBayar());
		System.out.println("Kembaliaan               : "+"Rp."+ (p.getBayar()-p.getHarga()));
		System.out.println("=====Cetak Hasil Pembayaran=====");
		
		
		
	}
}