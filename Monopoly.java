import java.util.Scanner;
import java.util.ArrayList;

class Monopoly {

    public ArrayList<Asset> petak = new ArrayList<>();
    private Asset Penjara, Start, ParkirBebas, Pajak;
    private DanaUmum DanaUmum;
    private Kesempatan Kesempatan;
    private Negara Indonesia, Malaysia, Singapura, Vietnam, Amerika_Serikat, Afrika, Kutub_Utara, Kutub_Selatan;
    private Perusahaan perusahaan_listrik, perusahaan_internet;
    private SaranaTransportasi stasiun_bandung;
    public Player player1, player2, player3, player4;
    private double uang_ditengah = 0;
    Scanner input = new Scanner(System.in);

    public Monopoly() {
        this.set_data();
        this.tambah_petak();
    }

    public void set_player() {

        // Player 1
        System.out.print("Masukkan nama player ke 1 : ");
        String namaPlayer1 = input.nextLine();
        player1 = new Player(namaPlayer1, 150000);

        // Player 2
        System.out.print("Masukkan nama player ke 2 : ");
        String namaPlayer2 = input.nextLine();
        player2 = new Player(namaPlayer2, 150000);

        // Player 3
        System.out.print("Masukkan nama player ke 3 : ");
        String namaPlayer3 = input.nextLine();
        player3 = new Player(namaPlayer3, 150000);

        // Player 4
        System.out.print("Masukkan nama player ke 4 : ");
        String namaPlayer4 = input.nextLine();
        player4 = new Player(namaPlayer4, 150000);

    }

    public void tambahUangDitengah(double uang) { this.uang_ditengah += uang; }

    public void setUangDitengah(double uang) { this.uang_ditengah = uang; }

    public double getUangDitengah() { return this.uang_ditengah; }

    public void set_data() {

        Start = new Asset();
        Start.setNamaAsset("Start");
        Start.setAssetDapatDijual(false);

        ParkirBebas = new Asset();
        ParkirBebas.setNamaAsset("Parkir Bebas");
        ParkirBebas.setAssetDapatDijual(false);

        Penjara = new Asset();
        Penjara.setNamaAsset("Penjara");
        Penjara.setAssetDapatDijual(false);

        Kesempatan = new Kesempatan();
        Kesempatan.setNamaAsset("Kesempatan");
        Kesempatan.setAssetDapatDijual(false);
        Kesempatan.addPerintah("Melanggar lalu lintas denda Rp.5.000");
        Kesempatan.addPerintah("Mabuk di muka umum denda Rp.1.500");
        Kesempatan.addPerintah("Mundur tiga petak");

        DanaUmum = new DanaUmum();
        DanaUmum.setNamaAsset("Dana Umum");
        DanaUmum.setAssetDapatDijual(false);
        DanaUmum.addPerintah("Bayar rumah sakit Rp.10.000");
        DanaUmum.addPerintah("Dapat asuransi jiwa Rp.15.000");
        DanaUmum.addPerintah("Bayar uang sekolah Rp.15.000");

        Pajak = new Asset();
        Pajak.setNamaAsset("Pajak");
        Pajak.setHargaPajak(20000);
        Pajak.setAssetDapatDijual(false);

        perusahaan_listrik = new Perusahaan();
        perusahaan_listrik.setNamaAsset("Perusahaan Listrik");
        perusahaan_listrik.setAssetDapatDijual(true);
        perusahaan_listrik.setHargaAsset(6000);
        perusahaan_listrik.setHargaSewa(600);
        perusahaan_listrik.setHargaHipotik(3500);
        
        Indonesia = new Negara();
        Indonesia.setNamaAsset("Indonesia");
        Indonesia.setAssetDapatDijual(true);
        Indonesia.setHargaAsset(20000);
        Indonesia.setHargaSewa(2000);
        Indonesia.setIndexKomplek('A');

        Malaysia = new Negara();
        Malaysia.setNamaAsset("Malaysia");
        Malaysia.setAssetDapatDijual(true);
        Malaysia.setHargaAsset(20000);
        Malaysia.setHargaSewa(2000);
        Malaysia.setIndexKomplek('A');

        Singapura = new Negara();
        Singapura.setNamaAsset("Singapura");
        Singapura.setAssetDapatDijual(true);
        Singapura.setHargaAsset(15000);
        Singapura.setHargaSewa(1500);
        Singapura.setHargaHipotik(14000);
        Singapura.setIndexKomplek('A');

        Vietnam = new Negara();
        Vietnam.setNamaAsset("Vietnam");
        Vietnam.setAssetDapatDijual(true);
        Vietnam.setHargaAsset(17000);
        Vietnam.setHargaSewa(1700);
        Vietnam.setHargaHipotik(16000);
        Vietnam.setIndexKomplek('B');

        perusahaan_internet = new Perusahaan();
        perusahaan_internet.setNamaAsset("Perusahaan Internet");
        perusahaan_internet.setAssetDapatDijual(true);
        perusahaan_internet.setHargaAsset(5000);
        perusahaan_internet.setHargaSewa(500);
        perusahaan_internet.setHargaHipotik(4000);

        Amerika_Serikat = new Negara();
        Amerika_Serikat.setNamaAsset("Amerika Serikat");
        Amerika_Serikat.setAssetDapatDijual(true);
        Amerika_Serikat.setHargaAsset(30000);
        Amerika_Serikat.setHargaSewa(3000);
        Amerika_Serikat.setHargaHipotik(29000);
        Amerika_Serikat.setIndexKomplek('B');

        Afrika = new Negara();
        Afrika.setNamaAsset("Afrika");
        Afrika.setAssetDapatDijual(true);
        Afrika.setHargaAsset(40000);
        Afrika.setHargaSewa(4000);
        Afrika.setHargaHipotik(39000);
        Afrika.setIndexKomplek('B');

        stasiun_bandung = new SaranaTransportasi();
        stasiun_bandung.setNamaAsset("Stasiun London");
        stasiun_bandung.setAssetDapatDijual(true);
        stasiun_bandung.setHargaAsset(7000);
        stasiun_bandung.setHargaSewa(2000);
        stasiun_bandung.setHargaHipotik(6000);

        Kutub_Utara = new Negara();
        Kutub_Utara.setNamaAsset("Kutub Utara");
        Kutub_Utara.setAssetDapatDijual(true);
        Kutub_Utara.setHargaAsset(45000);
        Kutub_Utara.setHargaSewa(5000);
        Kutub_Utara.setHargaHipotik(44000);
        Kutub_Utara.setIndexKomplek('C');

        Kutub_Selatan = new Negara();
        Kutub_Selatan.setNamaAsset("Kutub Selatan");
        Kutub_Selatan.setAssetDapatDijual(true);
        Kutub_Selatan.setHargaAsset(43000);
        Kutub_Selatan.setHargaSewa(5000);
        Kutub_Selatan.setHargaHipotik(42000);
        Kutub_Selatan.setIndexKomplek('C');

    }

    public void tambah_petak() {
        
        petak.add(Start);
        petak.add(Indonesia);
        petak.add(Malaysia);
        petak.add(perusahaan_listrik);
        petak.add(Singapura);
        petak.add(Vietnam);
        petak.add(ParkirBebas);
        petak.add(perusahaan_internet);
        petak.add(stasiun_london);
        petak.add(Penjara);
        petak.add(Amerika_Serikat);
        petak.add(DanaUmum);
        petak.add(Kesempatan);
        petak.add(Pajak);
        petak.add(Afrika);
        petak.add(Kutub_Utara);
        petak.add(Kutub_Selatan);

    }

    public void bermain(Player player, Monopoly monopoly) {
        // Monopoly monopoly = new Monopoly();

        // Check apakah player dipenjara atau tidak?
        if(player.getStatusPenjara()) {
            player.penjara();
        } else {

            // Menampilkan nama player
            System.out.println("===============================================================");
            System.out.println("Sekarang giliran : " + player.getNamaPlayer());
            // Player kocok dadu terlebih dahulu
            player.kocok_dadu();

            // Player di set posisi nya sesuai petak yang diinjaknya
            player.setIndexPosisiPemain(player.getTotalDadu());
            if(player.getIndexPosisiPemain() >= monopoly.petak.size()) {
                player.setUlangIndexPosisiPemain(player.getIndexPosisiPemain() - monopoly.petak.size());
                System.out.println("===================================");
                System.out.println("Anda sudah melewati start");
                System.out.println("===================================");
                player.tambahUang(20000);
                System.out.println("Anda mendapatkan uang sebesar 20.000 dari bank =)");
            }
            player.setPosisi(monopoly.petak.get(player.getIndexPosisiPemain()));
            
            // Menampilkan total dadu yang keluar dan menunjukkan dimana posisi player sekarang
            System.out.println("Total titik dadu adalah " + player.getTotalDadu() + " dan posisi anda berada di " + player.getPosisi().getNamaAsset());
            System.out.println("===============================================================");
            
            // Apakah asset yang diinjak dapat dijual
            if(player.getPosisi().getAssetDapatDijual()) {
                // Apabila Asset dapat dijual
                if(player.getUang() >= player.getPosisi().getHargaAsset()) {
                    // Apabila Uang player lebih besar dari harga asset
                    if(!player.getPosisi().getStatusKepemilikan()) {
                        // Apabila Tidak memiliki pemilik
                        System.out.print("Apakah anda ingin membeli asset " + player.getPosisi().getNamaAsset() + " dengan harga Rp." + player.getPosisi().getHargaAsset() + "? (true/false) : ");
                        boolean beli = input.nextBoolean();
                        if(beli) {
                            System.out.println(player.getNamaPlayer() + " membeli asset " + player.getPosisi().getNamaAsset());
                            player.beli_asset(player.getPosisi());
                            player.setUang(player.getUang() - player.getPosisi().getHargaAsset());
                            player.getPosisi().setStatusKepemilikan(true);
                            player.set_nama_pemilik(player.getPosisi(), player);
                            System.out.println("Asset " + player.getPosisi().getNamaAsset() + " sudah ditambahkan kedalam daftar Asset " + player.getNamaPlayer());
                        }
                        System.out.println("===========================================================");   
                    } else {
                        // check apakah asset yang diinjak itu bukan milik kita
                        if(!player.getPosisi().getPemilik().getNamaPlayer().equals(player.getNamaPlayer())) {
                            System.out.println("Anda menginjak asset milik " + player.getPosisi().getPemilik().getNamaPlayer() + " yaitu " + player.getPosisi().getNamaAsset());
                            System.out.println("Anda harus membayar sewa sebesar Rp." + player.getPosisi().getHargaSewa());
                            if(player.getUang() < player.getPosisi().getHargaSewa()) {
                                if(player.jumlah_asset_saya() != 0) {
                                    System.out.println("Anda tidak memiliki uang yang cukup untuk membayar sewa asset yang anda injak");
                                    System.out.println("-------------------------------------------");
                                    System.out.println("Total uang anda sebesar : Rp." + player.getUang());
                                    System.out.println("-------------------------------------------");
                                    System.out.println("Anda harus menjual asset yang anda miliki untuk membayar sewa");
                                    player.jualAsset();
                                } else {
                                    player.setStatusPlayer(false);
                                    System.out.println("Anda sudah bangkrut karena tidak dapat membayar sewa asset atau pun menjual asset anda");
                                }
                            }
                            player.getPosisi().getPemilik().setUang(player.getPosisi().getPemilik().getUang() + player.getPosisi().getHargaSewa());
                            // tambahin fungsi kurangin uang
                            System.out.println("Anda sudah membayar sewa kepada " + player.getPosisi().getPemilik().getNamaPlayer() + " sebesar Rp." + player.getPosisi().getHargaSewa());
                            System.out.println("===========================================================");
                        }
             
                    }
                }
            } else {
                // Asset tidak dapat dijual
                if(player.getPosisi().getNamaAsset().equals("Penjara")) {
                    player.setStatusPenjara(true);
                    player.penjara();
                }else if(player.getPosisi().getNamaAsset().equals("Dana Umum")) {
                    // Apabila berada di Dana Umum
                    System.out.println("Anda menginjak petak Dana Umum");
                    String perintah = DanaUmum.getRandomPerintah();
                    System.out.println(perintah);
                    player.lakukanPerintah(DanaUmum.getIndexRandom() + 1, player.getPosisi(), monopoly);
                } else if(player.getPosisi().getNamaAsset().equals("Kesempatan")) {
                    // Apabila berada di Kesempatan
                    System.out.println("Anda menginjak petak Kesempatan");
                    String perintah = Kesempatan.getRandomPerintah();
                    System.out.println(perintah);
                    player.lakukanPerintah(Kesempatan.getIndexRandom() + 1, player.getPosisi(), monopoly);
                } else if(player.getPosisi().getNamaAsset().equals("Parkir Bebas")) {
                    // Apabila berada di Parkir Bebas
                    System.out.println("Anda menginjak petak Parkir Bebas");
                } else if(player.getPosisi().getNamaAsset().equals("Pajak")) {
                    System.out.println("Anda menginjak petak Pajak");
                    System.out.println("Anda harus membayar pajak kepada bank sebesar Rp." + player.getPosisi().getHargaPajak());
                    if(player.getUang() < player.getPosisi().getHargaPajak()) {
                        if(player.jumlah_asset_saya() != 0) {
                            System.out.println("Anda tidak memiliki uang yang cukup untuk membayar pajak");
                            System.out.println("-------------------------------------------");
                            System.out.println("Total uang anda sebesar : Rp." + player.getUang());
                            System.out.println("-------------------------------------------");
                            System.out.println("Anda harus menjual asset yang anda miliki untuk membayar pajak");
                            player.jualAsset();
                        } else {
                            player.setStatusPlayer(false);
                            System.out.println("Anda sudah bangkrut karena tidak dapat membayar sewa asset atau pun menjual asset anda");
                        }
                    }
                    player.setUang(player.getUang() - player.getPosisi().getHargaPajak());
                    monopoly.tambahUangDitengah(player.getPosisi().getHargaPajak());;
                    System.out.println("Anda sudah membayar pajak kepada bank sebesar Rp." + player.getPosisi().getHargaPajak());
                    System.out.println("===========================================================");
                }
            }

            // Apakah player ingin menjual asset
            if(!player.getStatusPenjara()) {
                if(player.jumlah_asset_saya() != 0) {
                    System.out.println("Apakah anda ingin menjual asset? (true/false) : ");
                    boolean jual = input.nextBoolean();
                    input.nextLine();
                    if(jual) {
                        // Jual asset
                        player.jualAsset();
                    }
                    System.out.println("===========================================================");
    
                    System.out.println("Apakah anda ingin melihat asset anda? (true/false) : ");
                    boolean lihat = input.nextBoolean();
                    if(lihat) {
                        player.tampilkan_asset_saya();
                        System.out.println("-------------------------------------------");
                        System.out.println("Total uang anda sebesar : Rp." + player.getUang());
                        System.out.println("-------------------------------------------");
                    }
                } else {
                    System.out.println("Anda tidak memiliki asset untuk dijual ataupun ditampilkan");
                }
    
            }
        }

    }

    public void tampilkan_petak(Monopoly monopoly) {
        for(int i = 0; i < monopoly.petak.size(); i++) {
            System.out.println("Petak ke " + (i + 1) + " adalah = " + monopoly.petak.get(i).getNamaAsset());
        }
    }
}

        