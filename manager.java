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

