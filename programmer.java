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



