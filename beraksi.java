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
