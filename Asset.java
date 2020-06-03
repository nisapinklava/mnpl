class Asset {

    // Attribute
    private String nama_asset;
    private double harga_asset;
    private double harga_sewa;
    private double harga_hipotik;
    private Player pemilik;
    private boolean status_kepemilikan;
    private boolean dapat_dijual;
    private double harga_pajak;

    // Method
    public void setAssetDapatDijual(boolean status) { 
        this.dapat_dijual = status;
    }

    public boolean getAssetDapatDijual() {
        return this.dapat_dijual;
    }

    public void setNamaAsset(String nama) {
        this.nama_asset = nama;
    }
    
    public String getNamaAsset() {  
        return this.nama_asset;
    }

    public void setHargaAsset(double harga) {
        this.harga_asset = harga;
    }
    
    public double getHargaAsset() {
        return this.harga_asset;
    }

    public void setHargaSewa(double hargasewa) {
        this.harga_sewa = hargasewa;
    }
    
    public double getHargaSewa() {
        return this.harga_sewa;
    }

    public void setHargaHipotik(double hargahipotik) {
        this.harga_hipotik = hargahipotik;
    }
    
    public double getHargaHipotik() {
        return this.harga_hipotik;
    }

    public void setPemilik(Player pemilik) {
        this.pemilik = pemilik;
    }
    
    public Player getPemilik() {
        return this.pemilik;
    }

    public void setStatusKepemilikan(boolean status) {
        this.status_kepemilikan = status;
    }
    
    public boolean getStatusKepemilikan() {
        return this.status_kepemilikan;
    }

    public void setHargaPajak(double pajak){
        this.harga_pajak = pajak;
    }

    public double getHargaPajak() {
        return this.harga_pajak;
    }

}
