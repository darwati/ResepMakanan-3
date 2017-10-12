package com.bintang.ferry.resepmakanan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ImageView gambarResep;
    TextView judulResep;
    TextView deskripsiResep;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gambarResep = (ImageView) findViewById(R.id.gambar);
        judulResep = (TextView) findViewById(R.id.judul);
        deskripsiResep = (TextView) findViewById(R.id.rincian);
        recyclerView = (RecyclerView) findViewById(R.id.myRecycle);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(linearLayoutManager);

        String[] judulResep = {"Rendang", "Nasi Goreng", "Soto Ayam", "Bakso"};

        String[] deskripsiResep = {"Rendang atau randang adalah masakan daging bercita rasa pedas yang menggunakan campuran dari berbagai bumbu dan rempah-rempah. Masakan ini dihasilkan dari proses memasak yang dipanaskan berulang-ulang dengan santan kelapa. Proses memasaknya memakan waktu berjam-jam (biasanya sekitar empat jam) hingga kering dan berwarna hitam pekat.",
                "Nasi goreng adalah sebuah makanan berupa nasi yang digoreng dan diaduk dalam minyak goreng atau margarin, biasanya ditambah kecap manis, bawang merah, bawang putih, asam jawa, lada dan bumbu-bumbu lainnya, seperti telur, ayam, dan kerupuk.\n" +
                        " Ada pula nasi goreng jenis lain yang dibuat bersama ikan asin yang juga populer di seluruh Indonesia.", "Soto ayam adalah makanan khas Indonesia yang berupa sejenis sup ayam dengan kuah yang berwarna kekuningan. Warna kuning ini dikarenakan oleh kunyit yang digunakan sebagai bumbu. Soto ayam banyak ditemukan di daerah-daerah di Indonesia dan Singapura. Selain ayam bahan yang digunakan juga meliputi telur rebus, irisan kentang, daun seledri, serta bawang goreng. Terkadang soto juga disajikan dengan lontong atau nasi putih. Selain itu soto ayam juga sering dihidangkan dengan sambal, kerupuk dan koya (campuran tumbukan kerupuk dengan bawang putih).",
                "Bakso atau baso adalah jenis bola daging yang lazim ditemukan pada masakan Indonesia. Bakso umumnya dibuat dari campuran daging sapi giling dan tepung tapioka, akan tetapi ada juga bakso yang terbuat dari daging ayam, ikan, atau udang bahkan daging kerbau. Dalam penyajiannya, bakso umumnya disajikan panas-panas dengan kuah kaldu sapi bening, dicampur mi, bihun, taoge, tahu, terkadang telur dan ditaburi bawang goreng dan seledri."};

        int[] gambarResep = {R.drawable.rendang, R.drawable.nasi, R.drawable.soto, R.drawable.bakso};

        String[] JudulDetail = {"Rendang", "Nasi Goreng", "Soto Ayam", "Bakso"};

        String[] DeskripsiDetail = {"Bahan Utama Untuk Membuat Resep Daging Rendang Asli Padang: \n" +
                "- 1.5 kg daging\n" +
                "- 2 liter santan dari 2 butir kelapa tua\n" +
                "- 2 batang daun serai, memarkan\n" +
                "- 4 lembar daun jeruk purut\n" +
                "- 2 cm asam kandis/gelugur\n" +
                "- 2 lembar daun kunyit, simpulkan\n\n" +
                "Bumbu Resep Rendang Padang Asli Minang yang harus Dihaluskan: \n" +
                "> 5 butir kemiri\n" +
                "> 6 siung bawang putih\n" +
                "> 100 g cabe merah besar\n" +
                "> 12 butir bawang merah\n" +
                "> 100 g cabe merah keriting\n" +
                "> 2 cm jahe, bakar\n" +
                "> 2 cm lengkuas\n" +
                "> 3 cm kunyit, bakar\n" +
                "> 1/2 sdm ketumbar\n" +
                "> 2 sdt garam\n" +
                "> 1/2 sdt pala\n" +
                "> 1 sdt jintan, sangrai\n" +
                "> Penyedap rasa secukupnya\n\n" +
                "Cara Mengolah Resep Rendang Padang Asli khas Minang:\n" +
                "1. Pertama tama olah daging yang sudah disiapkan, potong-potong daging rendang dengan bentuk dadu atau seukuran yang diinginkan, hanya saja jangan pernah memotong daging terlalu kecil untuk diolah menjadi rendang agar saat dimasak nanti daging tidak hancur.\n" +
                "2. Tuangkan santan ke wajan berukuran besar, masukkan pula serai, irisan bawang merah, asam dan daun kunyit. Aduk-aduk hingga santan mendidih dan pastikan santan yang anda masak tidak pecah, untuk itu Anda harus terus mengaduk-aduk santan hingga mendidih merata.\n" +
                "3. Setelah santan mendidih, masukkan perlahan bumbu yang telah dihaluskan kedalamnya dan sesekali aduk-aduk selama kurang lebih 20 – 30 menit.\n" +
                "4. Setelah anda melihat santan tampak berminyak, berarti ini saatnya kamu memasukan potongan daging rendang yang telah dibersihkan dan masak dengan menggunakan api kecil/sedang hingga santan mengental dan mengering serta bumbu meresap ke pori pori daging.\n" +
                "5. Terus masak hingga daging empuk dan matang merata, jangan lengah untuk terus diaduk-aduk agar bagian dasar tidak gosong dan daging tidak gagal.\n" +
                "6. Ternyata tidak sulit kan untuk memasak rendang padang asli minang? Hanya butuh ketekunan, kesabaran dan mengikuti resep rendang padang asli minang di atas, kamu bisa menyajikan rendang padang yang sangat lezat melegenda khas minang untuk keluarga anda.\n",
                "Bahan-bahan yang harus disiapkan:\n" +
                        "- Nasi 600 gr\n" +
                        "- Daging ayam 125 g. Cincang halus\n" +
                        "- Telur 1 butir. Kocok\n" +
                        "- Bawang merah 5 siung\n" +
                        "- Bawang putih 3 siung\n" +
                        "- Cabai merah 3 buah\n" +
                        "- Daun bawang 1 batang. Iris halus\n" +
                        "- Kecap manis 2 sdm\n" +
                        "- Garam 1 sdt\n" +
                        "- Merica 1/4 sdt\n" +
                        "- Minyak\n\n" +
                        "Cara Membuat:\n" +
                        "1. Masukkan bawang merah, bawang putih, dan cabai merah ke dalam cobek kemudian haluskan.\n" +
                        "2. Goreng telur menjadi orak-arik lalu sisihkan.\n" +
                        "3. Bumbu yang telah dihaluskan kemudian di tumis dengan minyak secukupnya. Tumis terus hingga harum.\n" +
                        "4. Masukkan ayam cincang, telur, dan daun bawang ke dalam bumbu. Tumis lagi hingga merata.\n" +
                        "5. Tambahkan kecap, garam, dan merica. Aduk hingga rata.\n" +
                        "6. Baru kemudian masukkan nasi dan aduk hingga rata.\n" +
                        "7. Nasi goreng telah jadi dan sajikan pada piring saji.\n",
                "Bahan:\n" +
                        "- 1 ekor ayam utuh (bersihkan)\n" +
                        "- 200 gram kol\n" +
                        "- 200 gram tauge (rebus sebentar)\n" +
                        "- 4 buah kentang (rebus atau kukus, kupas, dan goreng)\n" +
                        "- 2 buah tomat\n" +
                        "- 50 gr soun (rendam dalam air panas)\n" +
                        "- 3 telur rebus\n" +
                        "- 2 liter air\n" +
                        "- bawang goreng\n\n" +
                        "Bumbu:\n" +
                        "> 3 lembar daun jeruk\n" +
                        "> 2 batang serai\n" +
                        "> 2 lembar daun salam\n" +
                        "> 1 batang daun bawang\n" +
                        "> 25 gram lengkuas\n" +
                        "> 2 sdm minyak goreng\n\n" +
                        "Bumbu yang dihaluskan:\n" +
                        "* 5 gram kunyit\n" +
                        "* 4 buah kemir\n" +
                        "* 15 gram jahe\n" +
                        "* 3 buah bawang merah\n" +
                        "* 2 siung bawang putih\n" +
                        "* 1/2 sdt merica\n" +
                        "* 2 sdm garam\n\n" +
                        "Cara membuat:\n" +
                        "1. Tumis bumbu yang dihaluskan dengan api kecil hingga harum\n" +
                        "2. Rebus ayam di dalam panci bersama dengan bumbu yang sudah ditumis, lengkuas, daun jeruk, daun salam, dan daun serai selama paling sedikit 30 menit sampai daging ayam menjadi empuk. Waktu memasak bisa disingkat dengan menggunakan panci presto.\n" +
                        "3. Bila kuah masih kurang enak boleh ditambah garam atau merica secukupnya\n" +
                        "4. Pisahkan daging dari tulang dengan menggunakan garpu dan pisau\n" +
                        "5. Masukkan kembali tulang ke dalam kuah di panci\n" +
                        "6. Masukkan potong daun bawang\n" +
                        "7. Kuah perlu dididihkan kembali sebelum dihidangkan\n" +
                        "8. Di dalam mangkok letakkan kol, tauge, sohun, irisan kentang, tomat, serta telur dan daging ayam\n" +
                        "9. Siram kuah soto yang mendidih ke dalam mangkok\n" +
                        "10. Tambahkan bawang goreng dan irisan jeruk nipis di atasnya kalau suka\n" +
                        "11. Hidangkan dengan sambal cuka, kecap manis, kerupuk dan emping.\n",
                "Bahan-bahan:\n" +
                        "- Daging sapi ½ kg, giling\n" +
                        "- Tepung kanji 50 g\n" +
                        "- Telur 1 butir\n" +
                        "- Lada bubuk ½ sdt\n" +
                        "- Garam 1 sdt\n" +
                        "- Bawang putih 4 siung, haluskan\n" +
                        "- Es batu 40 g, hancurkan\n" +
                        "- Air 2 L\n\n" +
                        "Cara membuat bakso:\n" +
                        "1. Masukkan daging sapi yang telah digiling ke dalam wadah, campurkan tepung kanji, telur, lada bubuk, garam dan bawang putih yang telah dihaluskan. Campur atau uleni dengan tangan atau bisa menggunakan alat sampai semua tercampur sempurna.\n" +
                        "2. Jika dirasa adonan masih lembek dan sulit dibentuk, maka bisa ditambahkan es batu secara perlahan sampai dirasa adonan bisa dibentuk.\n" +
                        "3. Rebus air dalam panci sampai mendidih\n" +
                        "4. Ambil adonan daging dengan tangan lalu bentuk bulat baik dengan kedua tangan atau dengan satu tangan ditekan hingga adonan keluar melalui jari telunjuk dan jempol.\n" +
                        "5. Masukkan adonan yang telah terbentuk ke dalam air panas.\n" +
                        "6. Lanjutkan hingga semua adonan habis.\n" +
                        "7. Jika bakso telah mengapung maka bakso telah matang. Angkat\n\n"};

        int[] GambarDetail = {R.drawable.rendang, R.drawable.nasi, R.drawable.soto, R.drawable.bakso};

        ArrayList<ListResep> listresep = new ArrayList<>();

        for (int i = 0; i < judulResep.length; i++) {
            ListResep listResep = new ListResep(judulResep[i], gambarResep[i], deskripsiResep[i], GambarDetail[i], DeskripsiDetail[i], JudulDetail[i]);
            listresep.add(listResep);
        }

        myAdapter listResepAdapter = new myAdapter(this, listresep);
        recyclerView.setAdapter(listResepAdapter);


    }
}