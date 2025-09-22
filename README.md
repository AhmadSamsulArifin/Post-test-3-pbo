# Post-test-3-pbo

## Encapsulation (Getter & Setter)

Encapsulation adalah konsep membungkus data sensitif berupa atribut dan method dalam sebuah class agar terlindungi dari akses class lain. Untuk mengakses class tersebut, harus menetapkan access modifier ‘private’ pada atribut, lalu data bisa diakses melalui method getter (penginisialisasian)/setter (pengaksesan) yang bersifat ‘public’.


<img width="1066" height="507" alt="image" src="https://github.com/user-attachments/assets/1801c642-ec0b-43f6-a300-e47773d5f609" />


<img width="1053" height="161" alt="image" src="https://github.com/user-attachments/assets/9ef8edb9-ebc7-4874-ad2c-f8ff830fd771" />

Ini ada contoh penerapan encapsulation pada class ruangan


## Inheritance 

Inheritance merupakan salah satu pilar utama dalam Pemrograman Berorientasi Objek yang memungkinkan suatu class (child/anak) mewarisi atribut dan method dari class lain (parent/induk). Artinya, subclass dapat menggunakan kembali atribut dan method dari superclass, serta dapat menambahkan fitur baru atau mengubah perilaku yang sudah ada.
Superclass (parent class) → kelas induk yang mewariskan atribut dan method.
Subclass (child class) → kelas turunan yang mewarisi semua atribut dan method dari superclass, serta dapat menambahkan atribut dan method baru.

<img width="249" height="91" alt="image" src="https://github.com/user-attachments/assets/46e26d9e-e07e-4307-80cc-09cfdd807256" />

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/0eb05b89-616a-44f5-b806-43c2aee80556" />

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/955a0017-5a9f-4996-9ddc-575848242622" />

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/1a52001b-ed30-4a46-9da7-4d34d9e7116e" />

Disini saya menambahkan subclass kelas dan laboratorium dari superclass ruangan


## Overriding
Overriding adalah kemampuan subclass untuk menimpa (override) method yang sudah ada di superclass dengan implementasi yang berbeda. 

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/c73e8711-5fc3-4322-adfd-9d31cd5ca362" />

<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/d8cc6fc6-b7d2-49b2-9812-b5a895790948" />

<img width="836" height="128" alt="image" src="https://github.com/user-attachments/assets/3b5f5fdc-e708-426e-bb77-b4ff8d1b61d9" />

<img width="1022" height="168" alt="image" src="https://github.com/user-attachments/assets/6101237e-508b-4023-922f-9b8d2df33d1e" />

Dalam kode ini overriding digunakan untuk menulis ulang method toString() milik superclass Ruangan. Ruangan hanya menampilkan nomor, tipe, dan status ruangan, sedangkan subclass Kelas dan Laboratorium menambahkan informasi khusus—Kelas menambah mata kuliah dan Laboratorium menambah jenis lab. Akibatnya, ketika objek dicetak dengan System.out.println(), Java otomatis memanggil toString() versi subclass sehingga informasi tambahan tampil sesuai tipe objeknya.




## Alur Program

Program ini memiliki 7 menu 


<img width="1016" height="243" alt="image" src="https://github.com/user-attachments/assets/4436b521-0609-43a5-be82-ec4c09a62864" />


1. menu pertama yaitu menambah data, pada bagian ini user bakal diminta untuk mengisi data data seperti nomor ruangan,tipe ruangan, dan status.


<img width="977" height="229" alt="image" src="https://github.com/user-attachments/assets/87638fbb-dc61-428c-9b36-f39418e74f29" />


2. menu kedua yaitu menampilkan semua ruangan, dimenu ini program bakal menampilkan semua ruangan yang sudah di tambahkan.


<img width="973" height="187" alt="image" src="https://github.com/user-attachments/assets/e43b31b7-54a1-4a4e-a72e-82fc8ac0bf3e" />


3. menu ketiga yaitu mengupdate atau mengubah data, jadi pada menu ini user memilih mana yang akan diubah datanya.


<img width="965" height="238" alt="image" src="https://github.com/user-attachments/assets/536f8f17-0a7e-4cc7-a288-22256863a4ba" />


4. menu keempat yaitu menghapus ruangan, jadi dimenu ini user dapat menghapus data dengan memilih nomor yang ingin dihapus.


<img width="982" height="206" alt="image" src="https://github.com/user-attachments/assets/580a0c35-7f0f-4e41-99ae-9957628fc633" />


5. menu kelima yaitu mencari ruangan bedasarkan nomor, jadi dimenu ini user harus memasukkan nomor mana yang ingin di cari


<img width="580" height="211" alt="image" src="https://github.com/user-attachments/assets/e18bfac2-02f7-4937-9e99-fb6ee716ce1c" />


6. menu keenam yaitu mencari ruangan bedasarkan tipe, jadi dimenu ini user harus memasukkan tipe ruangan apa yang ingin di cari


<img width="971" height="197" alt="image" src="https://github.com/user-attachments/assets/4498f69a-5167-4799-8fe8-11174d374c0c" />


7. menu ketujuh yaitu keluar dari program


<img width="975" height="289" alt="image" src="https://github.com/user-attachments/assets/dc8b1d98-67c0-4220-9274-e89e21009658" />



8. Tampilan setelah menu keluar adalah penerapan Overriding


<img width="1022" height="168" alt="image" src="https://github.com/user-attachments/assets/6101237e-508b-4023-922f-9b8d2df33d1e" />

