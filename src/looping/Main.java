package looping;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //scanner dan variabel hasil untuk pilihan ke 3
        Scanner hasil = new Scanner(System.in);
        String ulang;

        do {
            System.out.println("================================");
            System.out.println("Pilih salah satu nomor untuk melihat hasilnya \n" + 
                                 "1. Segitiga Siku siku \n" +
                                 "2. Segitiga Sama kaki \n" +
                                 "3. Segitiga Terbalik");

            int pilihan;
            System.out.print("Masukan pilihan anda : ");
            pilihan = hasil.nextInt();

            //scanner dan variabel untuk pilihan ke 2
            Scanner hasil2 = new Scanner(System.in);
            int pilihan2;

            if (pilihan == 1) {
                System.out.println("====================================\n" + 
                                   "ini adalah hasi segitiga siku siku\n" + 
                                   "====================================\n" + 
                                   "Silahkan pilih metode perulangan : \n"+ 
                                   "1. For\n"+
                                   "2. While\n"+
                                   "3. Do while");

                    System.out.print("Masukan pilhan anda: ");
                    pilihan2 = hasil2.nextInt();

                    //scanner dan variabel untuk pilihan ke 3
                    Scanner hasil3 = new Scanner(System.in);
                    int tinggi;

                    if( pilihan2 == 1 ) {
                        System.out.println("====================================\n" + 
                        "Anda memilih perulangan for segitiga siku siku : \n" + 
                        "====================================\n");

                        System.out.println("for(kondisi) {aksi}\n" + 
                        "====================================\n" + 
                        "KARAKTERISTIK for :\n" + 
                        "1. for bisa di gunakan bercabang \n" + 
                        "2. for bersifat case sensitive artinya java hanya menganggap for dengan huruf kecil \n" + 
                        "3. jika kondisi tidak memenuhi syarat program akan berhenti");

                        System.out.print("Masukkan tinggi segitiga: ");
                        tinggi = hasil3.nextInt();
                        for (int i = 0; i < tinggi; i++) {
                            for (int j = 0; j <= i; j++) {
                                System.out.print("* ");
                            }
                            System.out.println();
                        }
                    }else if( pilihan2 == 2 ) {
                        System.out.println("====================================\n" + 
                        "Anda memilih perulangan for segitiga siku siku : \n" + 
                        "====================================\n");
                        System.out.println("while(kondisi) {aksi}\n" + 
                        "====================================\n" +
                        "KARAKTERISTIK while :\n" + 
                        "1. while bisa di gunakan bercabang \n" + 
                        "2. while bersifat case sensitive artinya java hanya menganggap for dengan huruf kecil \n" + 
                        "3. jika kondisi tidak memenuhi syarat program akan berhenti");

                        System.out.print("Masukkan tinggi segitiga: ");
                        tinggi = hasil3.nextInt();
                        for (int i = 0; i < tinggi; i++) {
                            for (int j = 0; j <= i; j++) {
                                System.out.print("* ");
                            }
                            System.out.println();
                        }
                    }else if( pilihan2 == 3 ) {
                        System.out.println("====================================\n" + 
                        "Anda memilih perulangan do while segitiga siku siku : \n" + 
                        "====================================\n");
                        System.out.println("do{aksi} while(kondisi)\n" + 
                        "====================================\n" +
                        "KARAKTERISTIK do while :\n" + 
                        "1. do while bisa di gunakan bercabang \n" + 
                        "2. do while bersifat case sensitive artinya java hanya menganggap for dengan huruf kecil \n" + 
                        "3. jika konndisi tidak memenuhi syarat maka program akan berhenti \n" + 
                        "4. aksi akan di jalankan terlebih dahulu baru kondisinya di cek");

                        System.out.print("Masukkan tinggi segitiga: ");
                        tinggi = hasil3.nextInt();

                        int i = 1;
                        do {
                        int j = 1;
                        do {
                            System.out.print("* ");
                            j++;
                        } while (j <= i);

                        System.out.println();
                        i++;
                         } while (i <= tinggi);
                    }else{
                        System.out.println("Maaf Anda salah memilih program");
                    }

            } else if (pilihan == 2) {
                System.out.println("====================================\n" + 
                                   "ini adalah hasi segitiga Sama kaki\n" + 
                                   "====================================\n" + 
                                   "Silahkan pilih metode perulangan : \n"+ 
                                   "1. For\n"+
                                   "2. While\n"+
                                   "3. Do while");

                System.out.print("Masukan pilhan anda: ");
                pilihan2 = hasil2.nextInt();
               
                //scanner dan variabel untuk pilihan ke 3
                Scanner hasil3 = new Scanner(System.in);
                int tinggi;

                if( pilihan2 == 1 ) {
                    System.out.println("====================================\n" + 
                    "Anda memilih perulangan for segitiga sama kaki : \n" + 
                    "====================================\n");

                    System.out.println("for(kondisi) {aksi}\n" + 
                    "====================================\n" + 
                    "KARAKTERISTIK for :\n" + 
                    "1. for bisa di gunakan bercabang \n" + 
                    "2. for bersifat case sensitive artinya java hanya menganggap for dengan huruf kecil \n" + 
                    "3. jika kondisi tidak memenuhi syarat program akan berhenti");

                    System.out.print("Masukkan tinggi segitiga: ");
                    tinggi = hasil3.nextInt();
                    for (int i = 0; i < tinggi; i++) {
                        for (int j = 0; j < tinggi - i - 1; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 0; k < 2 * i + 1; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                }else if( pilihan2 == 2 ) {
                    System.out.println("====================================\n" + 
                    "Anda memilih perulangan for segitiga sama kaki : \n" + 
                    "====================================\n");
                    System.out.println("while(kondisi) {aksi}\n" + 
                    "====================================\n" +
                    "KARAKTERISTIK while :\n" + 
                    "1. while bisa di gunakan bercabang \n" + 
                    "2. while bersifat case sensitive artinya java hanya menganggap for dengan huruf kecil \n" + 
                    "3. jika kondisi tidak memenuhi syarat program akan berhenti");

                    System.out.print("Masukkan tinggi segitiga: ");
                    tinggi = hasil3.nextInt();
                    int i = 1;

                    while (i <= tinggi) {
                        int j = i;
                        while (j < tinggi) {
                            System.out.print(" ");
                            j++;
                        }
                        int k = 0;
                        while (k != 2 * i - 1) {
                            System.out.print("*");
                            k++;
                        }
                        System.out.println();
                        i++;
                    }

                }else if( pilihan2 == 3 ) {
                    System.out.println("====================================\n" + 
                    "Anda memilih perulangan do while segitiga sama kaki : \n" + 
                    "====================================\n");
                    System.out.println("do{aksi} while(kondisi)\n" + 
                    "====================================\n" +
                    "KARAKTERISTIK do while :\n" + 
                    "1. do while bisa di gunakan bercabang \n" + 
                    "2. do while bersifat case sensitive artinya java hanya menganggap for dengan huruf kecil \n" + 
                    "3. jika konndisi tidak memenuhi syarat maka program akan berhenti \n" + 
                    "4. aksi akan di jalankan terlebih dahulu baru kondisinya di cek");

                    System.out.print("Masukkan tinggi segitiga: ");
                    tinggi = hasil3.nextInt();

                    int i = 1;

                    do {
                    int j = i;
                    while (j < tinggi) {
                    System.out.print(" ");
                    j++;
                    }
                    int k = 0;
                    while (k != 2 * i - 1) {
                    System.out.print("*");
                    k++;
                    }
                    System.out.println();
                    i++;
                    } while (i <= tinggi);

                }else{
                    System.out.println("Maaf Anda salah memilih program");
                }

                
            } else if (pilihan == 3) {
                System.out.println("====================================\n" + 
                                   "ini adalah hasi segitiga Terbalik\n" + 
                                   "====================================\n" + 
                                   "Silahkan pilih metode perulangan : \n"+ 
                                   "1. For\n"+
                                   "2. While\n"+
                                   "3. Do while");

                System.out.print("Masukan pilhan anda: ");
                pilihan2 = hasil2.nextInt();
               
                //scanner dan variabel untuk pilihan ke 3
                Scanner hasil3 = new Scanner(System.in);
                int tinggi;

                if( pilihan2 == 1 ) {
                    System.out.println("====================================\n" + 
                    "Anda memilih perulangan for segitiga terbalik : \n" + 
                    "====================================\n");

                    System.out.println("for(kondisi) {aksi}\n" + 
                    "====================================\n" + 
                    "KARAKTERISTIK for :\n" + 
                    "1. for bisa di gunakan bercabang \n" + 
                    "2. for bersifat case sensitive artinya java hanya menganggap for dengan huruf kecil \n" + 
                    "3. jika kondisi tidak memenuhi syarat program akan berhenti");

                    System.out.print("Masukkan tinggi segitiga: ");
                    tinggi = hasil3.nextInt();

                    for (int i = tinggi; i >= 1; i--) {
                        for (int j = 1; j <= tinggi - i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= 2 * i - 1; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                }else if( pilihan2 == 2 ) {
                    System.out.println("====================================\n" + 
                    "Anda memilih perulangan for segitiga terbalik : \n" + 
                    "====================================\n");
                    System.out.println("while(kondisi) {aksi}\n" + 
                    "====================================\n" +
                    "KARAKTERISTIK while :\n" + 
                    "1. while bisa di gunakan bercabang \n" + 
                    "2. while bersifat case sensitive artinya java hanya menganggap for dengan huruf kecil \n" + 
                    "3. jika kondisi tidak memenuhi syarat program akan berhenti");

                    System.out.print("Masukkan tinggi segitiga: ");
                    tinggi = hasil3.nextInt();

                    int i = tinggi;
                    while (i >= 1) {
                        int j = tinggi - i;
                        while (j > 0) {
                            System.out.print(" ");
                            j--;
                        }
                        int k = 2 * i - 1;
                        while (k > 0) {
                            System.out.print("*");
                            k--;
                        }
                        System.out.println();
                        i--;
                    }

                }else if( pilihan2 == 3 ) {
                    System.out.println("====================================\n" + 
                    "Anda memilih perulangan do while segitiga sama kaki : \n" + 
                    "====================================\n");
                    System.out.println("do{aksi} while(kondisi)\n" + 
                    "====================================\n" +
                    "KARAKTERISTIK do while :\n" + 
                    "1. do while bisa di gunakan bercabang \n" + 
                    "2. do while bersifat case sensitive artinya java hanya menganggap for dengan huruf kecil \n" + 
                    "3. jika konndisi tidak memenuhi syarat maka program akan berhenti \n" + 
                    "4. aksi akan di jalankan terlebih dahulu baru kondisinya di cek");

                    System.out.print("Masukkan tinggi segitiga: ");
                    tinggi = hasil3.nextInt();

                    int i = tinggi;
                    do {
                        int j = tinggi - i;
                        do {
                            System.out.print(" ");
                            j--;
                        } while (j > 0);
            
                        int k = 2 * i - 1;
                        do {
                            System.out.print("*");
                            k--;
                        } while (k > 0);
            
                        System.out.println();
                        i--;
                    } while (i >= 1);
                    

                }else{
                    System.out.println("Maaf Anda salah memilih program");
                }
            } else {
                System.out.println("Maaf nomor yang Anda pilih salah!");
                System.out.print("Apakah Anda ingin mengulangi program? (ketik y untuk ya, n untuk tidak) : ");
                ulang = hasil.next();
                continue;
            }     


            System.out.print("Apakah Anda ingin mengulangi program? (ketik y untuk ya, n untuk tidak) : ");
            ulang = hasil.next();
        } while (ulang.equalsIgnoreCase("y"));

        System.out.println("Terima kasih telah menggunakan program ini!");
        hasil.close();
    }
}
