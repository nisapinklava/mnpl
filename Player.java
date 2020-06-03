import java.util.ArrayList;
import java.util.Scanner;

class Player {

    // Attribute
    private String nama_player;
    private boolean status_player, mempunyai_asset, status_penjara;
    private int limit_dadu_sama = 0;
    private int index_posis_pemain = 0;
    private int limit_dadu_penjara = 0;
    private int total_dadu, giliran;
    private Asset posisi;
    private double uang;
    private int dadu1;
    private int dadu2;
    private ArrayList<Asset> asset_saya = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public Player(String namaPlayer, double uang) {
        this.setNamaPlayer(namaPlayer);
        this.setStatusPlayer(true);
        this.setUang(uang);
    }

    public void jualAsset() {
        this.tampilkan_asset_saya();
        System.out.print("Asset mana yang akan " + this.getNamaPlayer() + " jual? : ");
        String asset_yang_akan_dijual = input.nextLine();
        Asset cari = this.getAsset(asset_yang_akan_dijual);
        if(cari != null) {
            this.tambahUang(cari.getHargaAsset());
            this.set_nama_pemilik(cari, null);
            cari.setStatusKepemilikan(false);
            this.jual_asset(cari);
            System.out.println("Asset " + asset_yang_akan_dijual + " berhasil dijual");
        } else {
            System.out.println("Asset yang anda cari tidak ada =)");
        }
    }

    public void set_nama_pemilik(Asset asset, Player player) { asset.setPemilik(player);}

    public void penjara() {
        // Menampilkan nama player
        System.out.println("===============================================================");
        System.out.println("Sekarang giliran : " + this.getNamaPlayer());
        System.out.println("Pilih action untuk keluar penjara :");
        System.out.println("1. Kocok Dadu\n2. Bayar");
        System.out.println("Pilih action untuk dilakukan : ");
        int pilihan = input.nextInt();
        switch (pilihan){
            case 1 :
            default :
                this.kocokDaduPenjara();
                break;
            case 2 :
                if(this.getUang() >= 20000) {
                    System.out.println("Anda harus membayar sebesar Rp.20.000,00");
                    System.out.println("Apakah anda ingin membayarnya? (true/false) : ");
                    boolean pilihan_player = input.nextBoolean();
                    if(pilihan_player) {
                        this.membayar(20000);
                    }
                } else {
                    this.kocokDaduPenjara();
                }
                break;
        }
    }

    public void kocokDaduPenjara() {
        this.kocok_dadu();
        if(this.getDadu1() != this.getDadu2()) {
            if(this.getLimitDaduPenjara() == 3) {
                this.setStatusPenjara(false);
                System.out.println("Anda sudah keluar penjara");
            }
            this.setLimitDaduPenjara(1);
        } else if(this.getDadu1() == this.getDadu2()) {
            this.setStatusPenjara(false);
            System.out.println("Anda sudah keluar penjara");
        }
    }

    public void membayar(double harga) {
        double rumus = this.getUang() - harga;
        this.setUang(rumus);
    }

    public void tambahUang(double uang) {
        double rumus = this.getUang() + uang;
        this.setUang(rumus);
    }

    public void lakukanPerintah(int indexRandom, Asset asset, Monopoly monopoly) {
        if(asset.getNamaAsset().equals("Dana Umum")) {
            switch(indexRandom) {
                case 1 :
                    System.out.println("Anda harus membayar rumah sakit sebesar Rp.10.000");
                    this.setUang(this.getUang() - 10000);
                    break;
                case 2 :
                    System.out.println("Anda mendapatkan asuransi jiwa sebesar Rp.15.000");
                    this.setUang(this.getUang() + 15000);
                    break;
                case 3 :
                    System.out.println("Anda harus membayar uang sekolah sebesar Rp.15.000");
                    this.setUang(this.getUang() - 15000);
                    break;
            }
        } else if(asset.getNamaAsset().equals("Kesempatan")) {
            switch(indexRandom) {
                case 1 :
                    System.out.println("Anda melanggar lalu lintas denda sebesar Rp.5.000");
                    this.setUang(this.getUang() - 5000);
                    break;
                case 2 :
                    System.out.println("Anda mabuk di muka umum denda sebesar Rp.1.500");
                    this.setUang(this.getUang() + 1500);
                    break;
                case 3 :
                    System.out.println("Anda harus mundur tiga petak");
                    int posisi = this.getIndexPosisiPemain() - 3;
                    this.setPosisi(monopoly.petak.get(posisi));
                    this.setIndexPosisiPemain(posisi);
                    System.out.println("Anda berada di petak " + monopoly.petak.get(posisi).getNamaAsset());
                    break;
            }
        }
    }

    public int getDadu1() { return this.dadu1; }
    
    public int getDadu2() { return this.dadu2; }

    public void setStatusPenjara(boolean penjara) { this.status_penjara = penjara; }

    public boolean getStatusPenjara() { return this.status_penjara; }

    public void setLimitDaduPenjara(int dadu) { this.limit_dadu_penjara += dadu; }

    public int getLimitDaduPenjara() { return this.limit_dadu_penjara; }

    public void setIndexPosisiPemain(int posisi) { this.index_posis_pemain += posisi; }

    public void setUlangIndexPosisiPemain(int posisiIndex) { this.index_posis_pemain = posisiIndex; }

    public int getIndexPosisiPemain() { return this.index_posis_pemain; }

    public void setGiliran(int giliran) { this.giliran = giliran; }

    public int getGiliran() { return this.giliran; }

    public void setNamaPlayer(String nama) { this.nama_player = nama; }
    
    public String getNamaPlayer() { return this.nama_player; }

    public void setStatusPlayer(boolean status) { this.status_player = status; }
    
    public boolean getStatusPlayer() { return this.status_player; }

    public void setMempunyaiAsset(boolean mempunyai) { this.mempunyai_asset = mempunyai; }
    
    public boolean getMempunyaiAsset() { return this.mempunyai_asset; }

    public void setLimitDaduSama(int limitDaduSama) { this.limit_dadu_sama = limitDaduSama; }
    
    public int getLimitDaduSama() { return this.limit_dadu_sama; }

    public void setTotalDadu(int totaldadu) { this.total_dadu = totaldadu; }
    
    public int getTotalDadu() { return this.total_dadu; }

    public void setPosisi(Asset posisi) { this.posisi = posisi; }
    
    public Asset getPosisi() { return this.posisi; }

    public ArrayList<Asset> getAssetSaya(){ return this.asset_saya; }

    public void setUang(double uang) { this.uang = uang; }
    
    public double getUang() { return this.uang; }

    public void kocok_dadu() {
        this.dadu1 = (int) (Math.random() * 6 + 1);
        this.dadu2 = (int) (Math.random() * 6 + 1);
        this.total_dadu = dadu1 + dadu2;
        System.out.println("Dadu ke 1 bernilai " + dadu1);
        System.out.println("Dadu ke 2 bernilai " + dadu2);
    }

    public void beli_asset(Asset asset) { asset_saya.add(asset); }

    public void jual_asset(Asset asset) { asset_saya.remove(asset); }

    public void tampilkan_asset_saya() {
        System.out.println("Ini adalah asset yang anda miliki : ");
        for(int i = 0; i < this.asset_saya.size(); i++) {
            System.out.println((i + 1) + ". " + asset_saya.get(i).getNamaAsset());
        }
    }

    public void tidak_memiliki_asset() {
        System.out.println("=============================================");
        System.out.println("Anda tidak memiliki asset untuk dilihatkan");
        System.out.println("=============================================");
    }

    public int jumlah_asset_saya() { return asset_saya.size(); }

    public void mempunyai_asset(Asset asset) {
        for(int i = 0; i < asset_saya.size(); i++) {
            if(asset_saya.get(i).getNamaAsset().equals(asset.getNamaAsset())) {
                this.mempunyai_asset = true;
            } else {
                this.mempunyai_asset = false;
            }
        }
    }

    public Asset getAsset(String nama) {
        Asset found = null;
        for(int i = 0; i < asset_saya.size(); i++) {
            if(asset_saya.get(i).getNamaAsset().equals(nama)) {
               found = asset_saya.get(i);
            } 
        }
        return found;
    }

}