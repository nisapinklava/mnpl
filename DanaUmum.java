import java.util.ArrayList;

class DanaUmum extends Asset {

    // Attribute
    private ArrayList<String> perintah = new ArrayList<>();
    private int indexRandom;

    public void addPerintah(String perintah) {
        this.perintah.add(perintah);
    }

    public String getRandomPerintah(){
        indexRandom = (int)(Math.random() * this.perintah.size());
        return this.perintah.get(indexRandom);
    }

    public int getIndexRandom() {
        return this.indexRandom;
    }
    
    public void removePerintah(int index) {
        this.perintah.remove(index);
    }


}