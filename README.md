# tugas_inheritance

link = "https://github.com/BAGAZDWI33/latihan_inheritance.git"


##super class

public class pegawai {
        private String Nama;
        private double GajiPokok;


    //setter
        public void setNama(String Nama){
            this.Nama = Nama;
        }
        public void  setGajiPokok(double GajiPokok){
            this.GajiPokok = GajiPokok;
        }
        public String getNama(){
            return this.Nama;
        }
        public double getGajiPokok(){
            return this.GajiPokok;
        }
        public void cetakinfo(){
            System.out.println("Nama : " + getNama());
            System.out.println("gaji pokok : " + getGajiPokok());


        }
}

kelas cabang pertama(inheritance)

public class programmer extends pegawai {
    private double Bonus;

    //setter
    public void setBonus(double Bonus){
        this.Bonus = Bonus;
    }
    public double getBonus(){
        return this.Bonus;
    }


    public void cetakInfo() {
        System.out.println("Nama : " + getNama());
        System.out.println("gaji pokok : " + getGajiPokok());
        System.out.println("Bonus : " + getBonus());

    }
}


public class manager extends programmer{
    private double Tunjangan;

    //setter
    public void settunjangan(double Tunjangan){
        this.Tunjangan = Tunjangan;
    }
    public double gettunjangan(){
        return this.Tunjangan;
    }
    public void cetakInfo() {
        System.out.println("Nama : " + getNama());
        System.out.println("gaji pokok : " + getGajiPokok());
        System.out.println("tunjangan : " + gettunjangan());

    }
}


disana terdapat menthod setter getter

 
    public void settunjangan(double Tunjangan){
        this.Tunjangan = Tunjangan;
    }
    public double gettunjangan(){
        return this.Tunjangan;
}


penggunaan pembacaan setter getter pada java pada hasil nya

public class beraksi {
    public static void main(String[] args) {
         manager asep = new manager();
         programmer anto = new programmer();

         asep.setNama("bagas dwi prasetyo");
         asep.setGajiPokok(500000);
         asep.settunjangan(4000000);
         System.out.println("Nama : " + asep.getNama());
         System.out.println("gaji pokok : " + asep.getGajiPokok());
         System.out.println("tunjangan : " + asep.gettunjangan()+"\n");
         asep.cetakinfo();

         anto.setNama("shodik kurnaya");
         anto.setGajiPokok(500000);
         anto.setBonus(5000000);
         System.out.println("Nama : " + anto.getNama());
         System.out.println("gaji pokok : " + anto.getGajiPokok());
         System.out.println("tunjangan : " + anto.getBonus()+"\n");
         anto.cetakinfo();



    }
}



dengan hasil 

 
Nama : bagas dwi prasetyo
gaji pokok : 500000.0
tunjangan : 4000000.0

Nama : bagas dwi prasetyo
gaji pokok : 500000.0
Nama : shodik kurnaya
gaji pokok : 500000.0
tunjangan : 5000000.0

Nama : shodik kurnaya
gaji pokok : 500000.0

Process finished with exit code 0


hasil terdapat pada gambar screenshot1 dan screenshot2

by.bagas dwi prasetyo 312110053
