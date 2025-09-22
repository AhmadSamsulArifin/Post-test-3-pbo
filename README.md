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






