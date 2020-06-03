class Negara extends Komplek {

    // Attribute
    private double harga_1_rumah;
    private double harga_2_rumah;
    private double harga_3_rumah;
    private double harga_1_hotel;
    private char index_komplek;

    public void setIndexKomplek(char index) { this.index_komplek = index; }

    public char getIndexKomplek() { return this.index_komplek; }

    public void setHarga1Rumah(int harga1rumah) { this.harga_1_rumah = harga1rumah; }
    
    public double getHarga1Rumah() { return this.harga_1_rumah; }

    public void setHarga2Rumah(int harga2rumah) { this.harga_2_rumah = harga2rumah; }
    
    public double getHarga2Rumah() { return this.harga_2_rumah; }

    public void setHarga3Rumah(int harga3rumah) { this.harga_3_rumah = harga3rumah; }
    
    public double getHarga3Rumah() { return this.harga_3_rumah; }

    public void setHarga1Hotel(int harga1hotel) { this.harga_1_hotel = harga1hotel; }
    
    public double getHarga1Hotel() { return this.harga_1_hotel; }

}
