# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi tentang Kasir Toko Print TAKA menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa Jumlah Print Warna dan Jumlah Print Hitama Putih, dan memberikan output berupa informasi detail dari Jumlah Harga Yang di bayarkan dan Berapa jumlah Uang Kembalian.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `TokoPrint`, `TokoPrintPremium`, dan `TokoPrintBeraksi` adalah contoh dari class.

```bash
public class TokoPrint {
    ...
}

public class TokoPrintPremium extends TokoPrint {
    ...
}

public class TokoPrintBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `TokoPrint[] transaksi = new TokoPrint[jumlahTransaksi];` adalah contoh pembuatan object.

```bash
TokoPrint[] transaksi = new TokoPrint[jumlahTransaksi];
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `printwarna` , `printhitamputih` dan `jumlahTransaksi` adalah contoh atribut.

```bash
double printwarna;
double printhitamputih;
int jumlahTransaksi;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `TokoPrint` dan `TokoPrintPremium`.

```bash
public TokoPrint(double printwarna, double printhitamputih, int jumlahTransaksi){
        this.printwarna = printwarna;
        this.printhitamputih = printhitamputih;
        this.jumlahTransaksi = jumlahTransaksi;
    }

public TokoPrintPremium(int printwarna, int printhitamputih, int jumlahTransaksi) {
        super(printwarna, printhitamputih, jumlahTransaksi);
        this.diskon = 5000;
    }
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setPrintwarna` , `setPrinthitamputih` dan `setJumlahTransaksi` adalah contoh method mutator.

```bash
    public void setPrintwarna(double printwarna) {
        this.printwarna = printwarna;
    }

    public void setPrinthitamputih(double printhitamputih) {
        this.printhitamputih = printhitamputih;
    }

    public void setJumlahTransaksi(int jumlahTransaksi) {
        this.jumlahTransaksi = jumlahTransaksi;
    }
```
  
6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getPrintwarna` , `getPrinthitamputih` dan `getJumlahTransaksi` adalah contoh method accessor.

```bash
    public int getJumlahTransaksi() {
        return jumlahTransaksi;
    }
        
    public double getPrintwarna() {
        return printwarna;
    }

    public double getPrinthitamputih() {
        return printhitamputih;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `printwarna` , `printhitamputih` dan `npm` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private double printwarna;
private double printhitamputih;
private int jumlahTransaksi;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `TokoPrintPremium` mewarisi `TokoPrint` dengan sintaks `extends`.

```bash
public class TokoPrintPremium extends TokoPrint {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `totalHarga()` di `TokoPrint` merupakan override dari method `totalHarga` di `TokoPrint`.

```bash
public double totalHarga(){
    return hargaPrintwarna() + hargaPrinthitamputih();       
}

@Override
    public double totalHarga() {
        double hargaAwal = super.totalHarga();
        if(hargaAwal > 50000){
        return hargaAwal * diskon;
        }
        else {
            return super.totalHarga();
        }
    }
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `totalHarga`.
`
```bash
public double totalHarga() {
        double hargaAwal = super.totalHarga();
        if(hargaAwal > 50000){
        return hargaAwal - diskon;
        }
        else {
            return super.totalHarga();
        }
    }
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < jumlahTransaksi; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
System.out.print("Masukkan Jumlah Halaman Warna : ");
int printwarna = scanner.nextInt();

System.out.print("Masukkan Jumlah Halaman Hitam Putih : ");
int printhitamputih = scanner.nextInt();

System.out.print("Apakah pelanggan member? (1 ya, 0 tidak) : ");
int isPremium = scanner.nextInt();

System.out.print("Masukan jumlah uang yang diberikan : ");
int uangDiberikan = scanner.nextInt();
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `MahasiswaDetail[] mahasiswas = new MahasiswaDetail[2];` adalah contoh penggunaan array.

```bash
TokoPrint[] transaksi = new TokoPrint[jumlahTransaksi];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
}catch (Exception e){
    System.out.println("Error : "+ e.getMessage());
}  
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Mustafa Kamal
NPM: 19630226

## Ucapan Terima Kasih

Terima Kasih Kepada Bapak Edya yang sudah mengajarkan saya tentang Pemprograman Berbasic Object
