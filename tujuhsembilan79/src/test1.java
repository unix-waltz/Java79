import java.util.*;

import static java.lang.System.out;

public class test1 {
    public static void main(String[] args) {

//        System.out.println("i am determined to learn how to code.");
//        System.out.println("Today's date is");
//
//    }

//        double rataRata;
//        int total = 0;
//        int totalHari = 7;
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Hitung Pengeluaran Anda!!!\n");
//        System.out.println("Halo, Siapa nama Anda?");
//        String nama = input.nextLine();
//
//        for (int hari = 1; hari <= totalHari; hari++) {
//            System.out.print("Berapa uang yang Anda keluarkan di warkop pada hari " + getNamaHari(hari) + "? ");
//            Integer pengeluaran = input.nextInt();
//            total += pengeluaran;
//        }
//
//        rataRata = (double) total / totalHari;
//
//        System.out.println("\nHasil Perhitungan: ");
//        System.out.println("Hai " + nama);
//        System.out.println("Total pengeluaran Anda di klub minggu ini adalah $ " + total);
//        System.out.println("Dengan rata-rata pengeluaran harian sebesar $ " + rataRata);
//    }
//
//    public static String getNamaHari(int kodeHari) {
//        switch (kodeHari) {
//            case 1:
//                return "Senin";
//            case 2:
//                return "Selasa";
//            case 3:
//                return "Rabu";
//            case 4:
//                return "Kamis";
//            case 5:
//                return "Jumat";
//            case 6:
//                return "Sabtu";
//            case 7:
//                return "Minggu";
//            default:
//                return "";
//        }

//        Scanner keyboard = new Scanner (System.in);
//        boolean a, b, c, d, e, f;
//        double x, y;
//        System.out.print ("Give me two numbers. First: ");
//        x = keyboard.nextDouble ();
//        System.out.print ("Second: ");
//        y=keyboard.nextDouble();
//        a = (x <y);
//        b = (x <= y);
//        c = (x==y);
//        d = (x != y);
//        e = (x > y);
//        f = (x >= y);
//        System.out.println(x + " is LESS THAN" + y + ": "+ a);
//        System.out.println(x + " is LESS THAN / EQUAL TO" + y + ": "+ b);
//        System.out.println(x + " EQUAL TO " + y + ": "+ c);
//        System.out.println(x + " NOT EQUAL TO " + y + ": "+ d);
//        System.out.println(x + " IS GREATER THAN " + y + ": "+ e);
//        System.out.println(x + " IS GREATER THAN / EQUAL TO " + y + ": "+ f);
//        System.out.println();
//
//        System.out.println(! (x < y) + " " + (x >= y) );
//        System.out.println( ! (x <= y) + " "+ (x > y) );
//        System.out.println(! (x == y) + " " + (x != y) ) ;
//        System.out.println(! (x != y) + " "+ (x == y) );
//        System.out.println( ! (x > y) + " "+ (x <= y) );
//        System.out.println(! (x >= y) + " "+ (x < y) );
//        int umur, pengalaman;
//        double penampilan;
//        String lulusan,nama,jeniskelamin,posisi,hasil;
//        boolean reqKoor1,reqKoor2,reqAdmin1,reqAdmin2,reqAdmin3,reqSpv1,reqSpv2;
//        Scanner input = new Scanner(System.in);
//
//        System.out.println ("Selamat datang di PT Semut 79");
//        System.out.println("==============================\n");
//        System.out.println("Silahkan input Data Anda");
//        System.out.println("Nama : ");
//        nama = input.next();
//        System.out.println ("Umur : ");
//        umur = input.nextInt();
//        System.out.println ("JenisKelamin (Pria/Wanita) :");
//        jeniskelamin = input.next();
//        System.out.println("Lulusan (SMK/D3/S1) : ");
//        lulusan = input.next();
//        System.out.println("Pengalaman (tahun): ");
//        pengalaman = input.nextInt();
//        System.out.println("Penampilan(1 s.d 10) : ");
//        penampilan = input.nextDouble();
//        System.out.println("Posisi uang dilamar (SPV,Admin,atau Koordinator) : ");
//        posisi = input.next();
//        //Kodisi if untuk menentukan posisi yang dipilih
//        if(posisi.equalsIgnoreCase("Koordinator")){
//            //Membuat kondisi setiap koordinator
//            reqKoor1 = jeniskelamin.equalsIgnoreCase("Pria") && umur >=21 && umur <=30 && (lulusan.equalsIgnoreCase("SMK")|| lulusan.equalsIgnoreCase("D3")) && pengalaman >=2;
//            reqKoor2 = jeniskelamin.equalsIgnoreCase("Pria") && umur >30 && lulusan.equalsIgnoreCase("S1") && pengalaman >=5;
//            //kodisi if untuk menentukan  hasil kelulusan  posisi Koordinator
//            if (reqKoor1 || reqKoor2){
//                hasil = "Selamat, " + nama + ".\nAnda Memenuhi syarat sebagai" + posisi +". Dan akan masuk ke tahap selanjutnya.";
//            }else{
//                hasil = "Maaf, " + nama + ".\nAnda tidak memenuhi syarat sebagai" + posisi +". Dan tidak akan masuk ke tahap selanjutnya.";
//            }
//        }else if (posisi.equalsIgnoreCase("Admin")){
//            reqAdmin1 = jeniskelamin.equalsIgnoreCase("Wanita") && umur >= 20 && umur <= 25 && lulusan.equalsIgnoreCase("D3") && (penampilan>=8.5 && pengalaman >=3);
//            reqAdmin2 = jeniskelamin.equalsIgnoreCase("Wanita") && umur >= 25 && lulusan.equalsIgnoreCase("S1")
//                    && penampilan >=8.5 && pengalaman >= 3;
//            reqAdmin3 = jeniskelamin.equalsIgnoreCase("Pria") && umur  >= 20 && umur <=30 && penampilan >= 8.5 && (lulusan.equalsIgnoreCase("D3")||lulusan.equalsIgnoreCase("S1")) && pengalaman >= 2;
//            //kodisi if untuk menentukan  hasil kelulusan  posisi Koordinator
//            if (reqAdmin1 || reqAdmin2 || reqAdmin3){
//                hasil = "Selamat, " + nama + ".\nAnda Memenuhi syarat sebagai" + posisi +". Dan akan masuk ke tahap selanjutnya.";
//            }else{
//                hasil = "Maaf, " + nama + ".\nAnda tidak memenuhi syarat sebagai" + posisi +". Dan tidak akan masuk ke tahap selanjutnya.";
//            }
//        }else if (posisi.equalsIgnoreCase("SPV")){
//            //membuat Kondisi setiap kriteria SPV
//            reqSpv1 = umur >= 23 && umur <= 30 && lulusan.equalsIgnoreCase("S1") && pengalaman >1 ;
//            reqSpv2 = umur >= 25 && umur <= 35 && lulusan.equalsIgnoreCase("D3") && pengalaman >4 ;
//            //kondisi if untuk menentukan hasil kriteria posisi SPV
//            if(reqSpv1||reqSpv2){
//                hasil = "Selamat, " + nama + ".\nAnda Memenuhi syarat sebagai" + posisi +". Dan akan masuk ke tahap selanjutnya.";
//            }
//            else {
//                hasil = "Maaf, " + nama + ".\nAnda tidak memenuhi syarat sebagai" + posisi +". Dan tidak akan masuk ke tahap selanjutnya.";
//            }
//        }else {
//            //Hasil ketika posisi yang ditemukan tidak sesuai atau tidak ada.
//            hasil = "Maaf Posisi Yang Anda Cari Tidak Tersedia.";
//        }
//        System.out.println();
//        System.out.println(nama +", Terimakasih Telah mengikuti Lowongan kerja di PT.Secret Semut 79.\n" );
//        System.out.println("Berikut adalah Hasil dari Rekrutmen Untuk posisi " + posisi + " :");
//        System.out.println(hasil);

//        int matematika, bhsInggris, bhsIndonesia, ipa; //Variable untuk Menyimpan nilai Ijian.
//        int passingGradeSMK, passingGradeSastra, passingGradeTIK; //Variablesyarat kelulusan.
//        boolean isPassingSMK, isPassingSastra, isPassingTIK;
////Variable Bertipe boolean untuk meyimpan hasil ujian
//        double averageUjian, averageBahasa;
//        Scanner input = new Scanner (System.in);
////Inisialisasi dulu nilai variable untuk syarat kelulusan
//        passingGradeSMK = 73;
//        passingGradeSastra = 75;
//        passingGradeTIK = 80;
//        System.out.println("Masukan nilai Ujian Matematika :");
//        matematika = input.nextInt ();
//        System.out.println("Masukan nilai Ujian Bhs.Indonesia :");
//        bhsIndonesia = input.nextInt ();
//        System.out.println("Masukan nilai Ujian Bhs.Inggris :");
//        bhsInggris = input.nextInt ();
//        System.out.println("Masukan nilai Ujian IPA :");
//        ipa = input.nextInt ();
////menghitung rata-rata nilai ujian
//        averageUjian = (matematika + bhsIndonesia + bhsInggris + ipa)/4;
////menghitung nilai bahasa
//        averageBahasa = ( bhsIndonesia + bhsInggris)/2;
////menentukan kelulusan masuk SMK
//        isPassingSMK = averageUjian >= passingGradeSMK;
////menentukan kelulusan masuk Jurusan sastra
//        isPassingSastra = averageBahasa >= passingGradeSastra;
////menentukan kelulusan masuk Jurusan Teknik Komputer Jaringan
//        isPassingTIK = matematika > passingGradeTIK;
//        System.out.println("\n\nHasil dari simulasi Untuk Persyartan Penerimaan Siswa Di SMK Padepokan 79 Adalah Sebagai Berikut ;");
//        System.out.println("=====================================================================================================");
//        System.out.println("Apakah Anda Memenuhi Syarat Untuk Masuk ke SMK Padepokan 79 :" + isPassingSMK);
//        System.out.println("Apakah Anda Memenuhi Syarat Untuk Masuk ke Jurusan Sastra :" + isPassingSastra);
//        System.out.println("Apakah Anda Memenuhi Syarat Untuk Masuk ke Jurusan Teknik Komputer Jaringan :" + isPassingTIK);
//        Scanner keyboard = new Scanner (System.in);
//        int age;
//        double income, cute;
//        boolean allowed;
//        System.out.print ("Enter your age: ");
//        age = keyboard.nextInt ();
//        System.out.print("Enter your yearly income: ");
//        income = keyboard.nextDouble();
//        System.out.print ("How cute are you, on scale from 0.0 to 10.0? ");
//        cute = keyboard.nextDouble();
//        allowed= (age > 25 && age < 40 && (income> 50000 || cute >= 8.5));
//        System.out.println ("Allowed to date my grandchild? " + allowed);
//        Scanner keyboard= new Scanner (System.in);
//        String word;
//        boolean yep, nope;
//        System.out.println ("Type the word \"hasbi siung\", please.");
//        word = keyboard.next ();
//        yep = word.equals("weasel");
//        nope = ! word.equals ("weasel");
//        System.out.println("You typed what was requested: " + yep);
//        System.out.println ("You ignored polite instructions: " + nope);
//        int r1,r2,r3,r4,r5;
//        boolean allSame;
//        do{
//            r1 = 1+(int)(Math.random() * 6);
//            r2 = 1+(int)(Math.random() * 6);
//            r3 = 1+(int)(Math.random() * 6);
//            r4 = 1+(int)(Math.random() * 6);
//            r5 = 1+(int)(Math.random() * 6);
//            System.out.print("\nYou rolled: "+r1+" "+r2+" ");
//            System.out.println(r3+" "+r4+" "+r5);
//            showDice(r1);
//            showDice(r2);
//            showDice(r3);
//            showDice(r4);
//            showDice(r5);
//            allSame = (r1 == r2 && r2 == r3 && r3 == r4 && r4 ==r5);
//        }while(! allSame);
//        System.out.println("The yacht!!");
//    }
//    public static void showDice(int roll){
//        System.out.println("+---+");
//        if (roll == 1){
//            System.out.println("|   |");
//            System.out.println("| o |");
//            System.out.println("|   |");
//        }else if(roll == 2){
//            System.out.println("|o  |");
//            System.out.println("|   |");
//            System.out.println("|  o|");
//        }
//        else if(roll == 3){
//            System.out.println("|o  |");
//            System.out.println("| o |");
//            System.out.println("|  o|");
//        }else if(roll == 4){
//            System.out.println("|o o|");
//            System.out.println("|   |");
//            System.out.println("|o o|");
//        }else if(roll == 5){
//            System.out.println("|o o|");
//            System.out.println("| o |");
//            System.out.println("|o o|");
//        }
//        printTopHalf();
//
//        print48Colons();
//        print48Ohs();
//        print48Colons();
//        print48Ohs();
//        print48Colons();
//        print48Ohs();
//    }
//    public static void print48Colons(){
//        out.println("|:::::::::::::::::::::::::::::::::::::::::::::::|");
//    }
//    public static void print48Ohs(){
//        out.println("|00000000000000000000000000000000000000000000000|");
//    }
//    public static void print29Colons(){
//        out.println("|::::::::::::::::::::::::|");
//    }
//    public static void printPledge(){
//        out.println("I pledge allegiance to the flag.");
//    }
//    public static void print29Ohs(){
//        out.println("|000000000000000000000000|");
//    }
//    public static void print6Stars(){
//        out.println("|******");
//    }
//    public static void print5Stars(){
//        out.println("|*****");
//    }
//    public static void printSixStartLine(){
//        print6Stars();
//        print29Ohs();
//    }
//    public static void printFiveStartLine(){
//        print5Stars();
//        print29Ohs();
//    }
//    public static void printTopHalf(){
//        out.println("|________________________________________________|");
//        // the line above has 1 space then  48 undersscores between the quotes
//        printSixStartLine();
//        printFiveStartLine();
//        printSixStartLine();
//        printFiveStartLine();
//        printSixStartLine();
//        printFiveStartLine();
//        printSixStartLine();
//        int umur, pengalaman;
//        double penampilan;
//        String lulusan,nama,jeniskelamin,posisi,hasil;
//        boolean reqKoor1,reqKoor2,reqAdmin1,reqAdmin2,reqAdmin3,reqSpv1,reqSpv2;
//        boolean isPassing;
//        Scanner input = new Scanner(System.in);
//
//        System.out.println ("Selamat datang di PT Semut 79");
//        System.out.println("==============================\n");
//        System.out.println("Silahkan input Data Anda");
//        System.out.println("Nama : ");
//        nama = input.next();
//        System.out.println ("Umur : ");
//        umur = input.nextInt();
//        System.out.println ("JenisKelamin (Pria/Wanita) :");
//        jeniskelamin = input.next();
//        System.out.println("Lulusan (SMK/D3/S1) : ");
//        lulusan = input.next();
//        System.out.println("Pengalaman (tahun): ");
//        pengalaman = input.nextInt();
//        System.out.println("Penampilan(1 s.d 10) : ");
//        penampilan = input.nextDouble();
//        System.out.println("Posisi uang dilamar (SPV,Admin,atau Koordinator) : ");
//        posisi = input.next();
//        //Kodisi if untuk menentukan posisi yang dipilih
//        if(posisi.equalsIgnoreCase("Koordinator")){
//            isPassing= validateKoordinator(umur,jeniskelamin,lulusan,pengalaman,penampilan);
//        }else if (posisi.equalsIgnoreCase("Admin")){
//            isPassing= validateAdmin(umur,jeniskelamin,lulusan,pengalaman,penampilan);
//        }else if (posisi.equalsIgnoreCase("SPV")){
//            isPassing= validateSPV(umur,jeniskelamin,lulusan,pengalaman,penampilan);
//
//        }else {
//            //Hasil ketika posisi yang ditemukan tidak sesuai atau tidak ada.
//            hasil = "Maaf Posisi Yang Anda Cari Tidak Tersedia.";
//            isPassing=false;
//        }
//        if(isPassing){
//            hasil="Selamat, "+nama +".\nAnda memenuhi syarat " +posisi+ ". Dan akan masuk ke tahap selanjutnya.";
//        }else{
//            hasil ="Maaf, "+nama+ ".\nAnda tidak memenuhi Syarat sebagai "+posisi+". Dan tidak akan masuk ke tahap selanjutnya.";
//        }
//        printResult(nama,hasil,posisi);
//        System.out.println();
//        System.out.println(nama +", Terimakasih Telah mengikuti Lowongan kerja di PT.Secret Semut 79.\n" );
//        System.out.println("Berikut adalah Hasil dari Rekrutmen Untuk posisi " + posisi + " :");
//        System.out.println(hasil);
//    }
//    public static boolean validateKoordinator(int umur,String jeniskelamin, String lulusan,int pengalaman, double penampilan){
//        boolean reqKoor1,reqKoor2,result;
//        reqKoor1 = jeniskelamin.equalsIgnoreCase("Pria") && umur >=21 && umur <=30 && (lulusan.equalsIgnoreCase("SMK")|| lulusan.equalsIgnoreCase("D3")) && pengalaman >=2;
//        reqKoor2 = jeniskelamin.equalsIgnoreCase("Pria") && umur >30 && lulusan.equalsIgnoreCase("S1") && pengalaman >=5;
//        if(reqKoor1||reqKoor2){
//            result=true;
//        }else{
//            result=false;
//        }
//        return result;
//    }
//    public static boolean validateAdmin(int umur,String jeniskelamin, String lulusan,int pengalaman, double penampilan){
//        boolean reqAdmin1,reqAdmin2,reqAdmin3,result;
//        reqAdmin1 = jeniskelamin.equalsIgnoreCase("Wanita") && umur >= 20 && umur <= 25 && lulusan.equalsIgnoreCase("D3") && (penampilan>=8.5 && pengalaman >=3);
//        reqAdmin2 = jeniskelamin.equalsIgnoreCase("Wanita") && umur >= 25 && lulusan.equalsIgnoreCase("S1")
//                && penampilan >=8.5 && pengalaman >= 3;
//        reqAdmin3 = jeniskelamin.equalsIgnoreCase("Pria") && umur  >= 20 && umur <=30 && penampilan >= 8.5 && (lulusan.equalsIgnoreCase("D3")||lulusan.equalsIgnoreCase("S1")) && pengalaman >= 2;
//        if(reqAdmin1||reqAdmin2||reqAdmin3){
//            result = true;
//        }else{
//            result = false;
//        }
//        return result;
//    }
//    public static boolean validateSPV(int umur,String jeniskelamin, String lulusan,int pengalaman, double penampilan){
//        boolean reqSpv1,reqSpv2,result;
//        reqSpv1 = umur >= 23 && umur <= 30 && lulusan.equalsIgnoreCase("S1") && pengalaman >1 ;
//        reqSpv2 = umur >= 25 && umur <= 35 && lulusan.equalsIgnoreCase("D3") && pengalaman >4 ;
//        if(reqSpv1||reqSpv2){
//            result = true;
//        }else{
//            result = false;
//        }
//        return result;
//    }
//    public static void printResult(String nama,String hasil,String posisi){
//        System.out.println();
//        System.out.println(nama + ", Terima kasih sudah mengikuti lowongan kerja di PT Semut 79.\n");
//        System.out.println("Berikut adalah hasil dari Reckrutmen untuk posisi "+posisi+" :");
//        System.out.println(hasil);
//        double a,g;
//        String tws= "A triangel with sides.";
//        a = triangleArea(3,3,3);
//        System.out.println("A triangle with sides 3, 3, 3 has area " + a);
//        a = triangleArea(3,4,5);
//        System.out.println("A triangle with sides 3, 4, 5 has area " + a);
//        g = triangleArea(7,8,9);
//        System.out.println(tws+"7, 8, 9 has area "+g);
//        System.out.println(tws+"5, 12, 13 has area "+ triangleArea(5,12,13));
//        System.out.println(tws+"10, 9, 11 has area "+ triangleArea(10,9,11));
//        System.out.println(tws+"8, 15, 17 has area "+ triangleArea(8,15,17));
//    }
//    //this function computes the area of a triangel with side lenght a, b, &c.
//    public static double triangleArea(int a,int b, int c){
//        double s,A;
//        s = (a+b+c)/2;
//        A = Math.sqrt(s*(s-a)*(s-b)*(s-c));
//        return A;
//        Scanner input = new Scanner(System.in);
//        String title, namaDepan, namaBelakang, jenisKelamin;
//        int umur;
//        System.out.print ("Nama Depan: ");
//        namaDepan= input.next();
//        System.out.print ("Nama Belakang: ");
//        namaBelakang = input.next();
//        System.out.print ("Umur : ");
//        umur = input.nextInt();
//        System.out.print ("Jenis Kelamin (Pria/Wanita): ");
//        jenisKelamin = input.next();
//        if (umur <20) {
//            title = namaDepan;
//        }else{
//            if(jenisKelamin.equals ("Wanita")){
//                System.out.print ("Apakah anda sudah Menikah? (Ya/Tidak): ");
//                String status = input.next();
//                if(status.equals("Ya")) {
//                    title = "Mrs. ";
//                }else{
//                    title = "Ms. ";}
//            }
//            else{
//                title = "Mr. ";}}
//        System.out.print("\nHello " + title + " " + namaBelakang);
//        Scanner keyboard = new Scanner(System.in);
//        String coin, again ;
//        int streak = 0 ;
//        boolean gotHeads;
//        do{
//            gotHeads = Math.random() < 0.5;
//            if(gotHeads)
//                coin = "Heads";
//            else
//                coin = "Tails";
//            System.out.println("You flip a coin and it is ....."+ coin);
//            if(gotHeads){
//                streak++;
//                System.out.println("\tThat's"+streak+" in a row .....");
//                System.out.print("\tWould you like  to flip again(y/n)? ");
//                again = keyboard.next();
//            }
//            else{
//                System.out.println("\tYou lose everything!");
//                System.out.println("\tShould've quit  while you were aHEAD.....");
//                streak = 0;
//                again = "n";
//            }
//        }while(again.equals("y"));
//        System.out.println("final Score: " + streak);
//        int angka[] = {3,1,42,24,12};
//        //menggunaka perulangan For each untuk meanmpilkan angka
//        for(int x : angka){
//            System.out.print(x + " ");
//        }
//        Scanner keyboard = new Scanner(System.in);
//        int roll, ptot, ctot, turnTotal;
//        String choice = "";
//
//        ptot = 0;
//        ctot = 0;
//        do{
//            if(ptot<100){
//                turnTotal= 0 ;
//                System.out.println("Computer has " + ctot+" points.");
//                do{
//                    roll = 1 + (int)(Math.random()*6);
//                    System.out.println("\tComputer rolled a " + roll + ".");
//                    if(roll == 1){
//                        System.out.println("\tThat ends its turn.");
//                        turnTotal = 0;
//                    }else{
//                        turnTotal += roll ;
//                        System.out.print("\tComputer has " + turnTotal);
//                        System.out.print(" Points so far this round.\n");
//                        if(turnTotal<10){
//                            System.out.println("\tComputer will roll again");
//                        }
//
//                    }
//                }while(roll != 1 && turnTotal<10);
//                ctot += turnTotal;
//                System.out.print("\tComputer ends the round With ");
//                System.out.print(ctot+" points.\n");
//
//            }
//            turnTotal =0;
//            System.out.print("You have "+ ptot +" points.");
//            do{
//                roll = 1+(int)(Math.random()*6);
//                System.out.println("\tComputer rolled a " + roll + ".");
//                if(roll == 1){
//                    System.out.println("\tThat ends its turn.");
//                    turnTotal = 0;
//                }else{
//                    turnTotal +=roll;
//                    System.out.print("\tYou have " + turnTotal +" points.");
//                    System.out.print("so far this round.\n");
//                    System.out.print("\tWould you like to \"roll\" again");
//                    System.out.print(" or \"hold\"?");
//                    choice = keyboard.next();
//                }
//            }while(roll != 1 && choice.equals("roll"));
//            ptot += turnTotal;
//            System.out.println("\tYou end the round with " +ptot+" points\n");
//        }while(ptot < 50 && ctot < 50);
//        if(ptot>ctot){
//            System.out.println("Humanity Wins!!");
//        }else{
//            System.out.println("The Computer Wins.");
//        }
//        String [] planets={"Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune"};
//        for(String p : planets){
//            System.out.println(p+"\t"+p.toUpperCase());
//        }
//    }



//        Scanner input = new Scanner(System.in);
//        int changeNumber, indexToChange = 0;
//        int numbers[] = {3,2,5,11,7,10,11,3,15,11,17,10,5};
//        System.out.println("Array numbers");
//        System.out.println("{3,2,5,11,7,10,11,3,15,11,17,10,5}");
//        System.out.println("Merubah nilai dari arrays numbers !!!");
//        do{
//            System.out.print("Masukan posisi yang mau diganti 1 -13 : ");
//            indexToChange= input.nextInt();
//        }while(indexToChange < 1 || indexToChange > 13);
//        System.out.println("Masukan nilai yang akan diinputkan kedalam array numbers : ");
//        changeNumber = input.nextInt();
//        for(int i=0 ; i < numbers.length; i++){
//            if(indexToChange - 1 == i){
//                numbers[1] = changeNumber;
//            }
//        }
//        System.out.println("Menampilkan array numbers setelah dirubah");
//        System.out.print("{");
//        for(int i=0;i<numbers.length ; i++){
//            System.out.print(numbers[i]+" ");
//        }
//        System.out.print("}");
    }
}
