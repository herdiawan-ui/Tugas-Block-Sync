/**
 * Kelas Utama merupakan kelas awal eksekusi
 * Pemrogaman Berorientasi Objek 01 - Kelompok 10 
 * @version 2, Juni 2021
 */

public class utama{
    private float balance;
	public static void main(String[] args){
	    int j = 15;
	    int i;
	    SavingsAccount akun = new SavingsAccount();
	    Thread pengurangan = new Thread(new Runnable()//Thread pengurangan untuk menjalankan method withdraw dengan menggunakan metode runnable
	    {
            public void run() {
                int i = 0;
                while (j > i) {
                    akun.withdraw(200);
                    System.out.println("Nilai balance setelah pengambilan : " + akun.toString());
                    i++;
                }
            }
        });
        Thread penambahan = new Thread(new Runnable()//Thread penambahan untuk menjalankan method deposit dengan menggunakan metode runnable
        {
            public void run() {
                int i = 0;
                while (j > i) {
                    akun.deposit(500);
                    System.out.println("Nilai balance setelah penabungan : " + akun.toString());
                    i++;
                }
            }
        });
        penambahan.start();
        pengurangan.start();
	}
}