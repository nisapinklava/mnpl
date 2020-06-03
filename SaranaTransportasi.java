class SaranaTransportasi extends Asset {

    // Attribute
    private int harga_satu_stasiun;
    private int harga_dua_stasiun;
    private int harga_tiga_stasiun;
    private int harga_empat_stasiun;

    public void setHarga1Stasiun(int harga1stasiun) {
        this.harga_satu_stasiun = harga1stasiun;
    }

    public int getHarga1Stasiun(){
        return this.harga_satu_stasiun;
    }
	
	public void setHarga2Stasiun(int harga2stasiun) {
        this.harga_dua_stasiun = harga2stasiun;
    }

    public int getHarg2Stasiun(){
        return this.harga_dua_stasiun;
    }

    public void setHarga3Stasiun(int harga3stasiun) {
        this.harga_tiga_stasiun = harga3stasiun;
    }

    public int getHarga3Stasiun(){
        return this.harga_tiga_stasiun;
    }

    public void setHarga4Stasiun(int harga4stasiun) {
        this.harga_empat_stasiun = harga4stasiun;
    }

    public int getHarga4Stasiun(){
        return this.harga_empat_stasiun;
    }    
}