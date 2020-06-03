import java.util.ArrayList;

class Komplek extends Asset {

    // Attribute
    public ArrayList<Negara> list_negara = new ArrayList<>();
    public int jumlah_rumah = 0;
    public int jumlah_hotel = 0;

    public ArrayList<Negara> getListNegara() {
        return this.list_negara;
    }

    public void bangun_rumah() {
        this.jumlah_rumah++;
    }

    public void jual_rumah() {
        this.jumlah_rumah--;
    }

    public void beli_hotel() {
        this.jumlah_hotel++;
    }

    public void jual_hotel() {
        this.jumlah_hotel--;
    }
    
    public int getJumlahRumah() {  
        return this.jumlah_rumah;
    }
    
    public int getJumlahHotel() {  
        return this.jumlah_hotel;
    }
}