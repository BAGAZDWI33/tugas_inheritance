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

