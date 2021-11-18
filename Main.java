public class Main {

    public static void main(String[] args) {
	// write your code here
        //contoh objek karyawan tetap
        Karyawan karyawan1 = new Tetap("Mercia", 5000000, 9500000);
        Karyawan karyawan2 = new Tetap("Caye", 4500000, 7900000);
        //contoh ojek karyawan kontrak
        Karyawan karyawan3 = new Kontrak("Ari", 25, 8000000);
        //contoh objek departemen
        Departemen departemen = new Departemen("Joyer");

        //menghubungankan karyawan dengan kelas departemen
        departemen.addKaryawan(karyawan1);
        departemen.addKaryawan(karyawan2);
        departemen.addKaryawan(karyawan3);

        //cetak data karyawan
        System.out.println("\n Data Semua Kayawan \uD83D\uDC47\n");
        departemen.displayAll();

        System.out.println("\n Data Karyawan Tetap \uD83D\uDC47\n");
        departemen.displayTetap();

        System.out.println("\n Data Karyawan Kontrak \uD83D\uDC47\n");
        departemen.displayKontrak();
    }
}
