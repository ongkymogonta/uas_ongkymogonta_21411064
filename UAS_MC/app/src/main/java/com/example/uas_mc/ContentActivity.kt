package com.example.uas_mc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ContentActivity : AppCompatActivity() {

    private lateinit var ClubRecyclerView: RecyclerView
    private lateinit var ClubList : ArrayList<Club>
    private lateinit var ClubAdapter : ClubAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content)

        ClubList = ArrayList()

        ClubList.add(
            Club(R.drawable.realmadrid, "Real Madrin",
                "Real Madrid Club de Fútbol (pengucapan bahasa Spanyol: [reˈal maˈðɾið ˈkluβ ðe ˈfutβol]; Royal Madrid Football Club), umumnya dikenal sebagai Real Madrid, adalah klub sepak bola profesional yang berbasis di Madrid, Spanyol.Didirikan pada tahun 1902 sebagai Madrid Football Club, secara tradisional mengenakan kostum kandang putih. Kata Real (\"dari kerajaan\") Spanyol dan dianugerahkan ke klub oleh Raja Alfonso XIII pada tahun 1920 bersama-sama dengan mahkota kerajaan di lambang klub.")
        )

        ClubList.add(
            Club(R.drawable.barcelona, "Barcelona",
                "Barcelona atau Barça, adalah klub sepak bola profesional yang berbasis di Barcelona, Catalunya, Spanyol, yang ikut serta di kompetisi tertinggi sepak bola Spanyol, La Liga.Didirikan pada tahun 1899 oleh sekelompok pemain Swiss, Inggris, Jerman dan Katalan yang dipimpin oleh Joan Gamper, klub telah menjadi simbol budaya Catalan dan Catalanisme, yang mempunyai motto \"Més que un club\" (Lebih dari sebuah klub). Tidak seperti banyak klub sepak bola lainnya, para pendukung memiliki dan mengoperasikan Barcelona.")
        )

        ClubList.add(
            Club(R.drawable.mu, "Manchester United ",
                "Manchester United Football Club adalah sebuah klub sepak bola profesional yang berbasis di Old Trafford, Manchester Raya, yang bermain di Liga Utama Inggris dengan gelar Liga Utama Inggris terbanyak sepanjang masa. Didirikan sebagai Newton Heath LYR Football Club pada tahun 1878, klub ini berganti nama menjadi Manchester United pada 1902 dan pindah ke Old Trafford pada tahun 1910.Manchester United telah memenangkan banyak trofi di sepak bola Inggris, termasuk rekor 20 gelar Liga, 12 Piala FA, 6 Piala Liga dan rekor 21 FA Community Shield.")
        )

        ClubList.add(
            Club(R.drawable.munchen, "Bayern Munchen",
                "FC Bayern Minga (dalam bahasa Bayern), atau FC Bayern, adalah sebuah klub sepak bola Jerman yang berbasis di München, Bayern. Klub ini terkenal sebagai klub paling sukses dalam sejarah sepak bola Jerman, setelah memenangkan rekor 32 gelar nasional dan 20 piala nasional.FC Bayern didirikan pada tahun 1900 oleh sebelas pemain sepak bola yang dipimpin oleh Franz John.Meskipun Bayern memenangkan kejuaraan nasional pertamanya pada tahun 1932, klub tersebut tidak dipilih untuk Bundesliga pada awal tahun 1963.")
        )

        ClubList.add(
            Club(R.drawable.liverpol, "Liveerpol",
                "Liverpool Football Club /ˈlɪvərpuːl/ (dikenal pula sebagai Liverpool atau The Reds) adalah sebuah klub sepak bola profesional asal Inggris yang berbasis di Liverpool. Didirikan pada tahun 1892, Liverpool kemudian bergabung dengan Football League di tahun berikutnya dan sejak pembentukannya memainkan pertandingan kandang mereka di Stadion Anfield yang terletak sekitar 4,8 km dari pusat kota.Pada kompetisi domestik, Liverpool telah memenangkan 19 Gelar Liga, 8 Piala FA, rekor 9 Piala Liga dan 16 Community Shield FA.")
        )

        ClubList.add(
            Club(R.drawable.chelsea, "Chelsea",
                "Chelsea Football Club adalah sebuah klub sepak bola profesional yang bermarkas di Fulham, London. Didirikan pada 1905, klub ini kini berkompetisi di Liga Utama Inggris dan memainkan pertandingan kandang mereka di Stamford Bridge.Chelsea merupakan salah satu klub sepak bola tersukses di Inggris, dengan telah memenangkan lebih dari tiga puluh gelar juara kompetisi klub domestik dan internasional.Kesuksesan pertama Chelsea diraih saat meraih gelar juara Divisi 1 Liga Inggris pada 1955. ")
        )

        ClubList.add(
            Club(R.drawable.juventus, "Juventus",
                "Juventus Football Club S.p.A. (BIT: JUVE) (dari bahasa Latin: iuventus: masa muda [juˈvɛntus]), biasa disebut sebagai Juventus dan populer dengan nama Juve (pengucapan [ˈjuːve]), adalah klub sepak bola profesional asal Italia yang berbasis di kota Turin, Piemonte. Klub ini didirikan pada tahun 1897 dengan nama Sport Club Juventus oleh sekelompok pelajar muda di kota Turin yang dipimpin oleh seorang ahli bernama Eugenio Canfari dan saudaranya Enrico.Sejak bulan September 2011, mereka berkandang di Juventus Stadium yang berkapasitas 41.507 tempat duduk.")
        )

        ClubRecyclerView = findViewById(R.id. ClubRecyclerView)
        ClubRecyclerView.setHasFixedSize(true)
        ClubRecyclerView.layoutManager = LinearLayoutManager(this)

        ClubAdapter =  ClubAdapter(ClubList)
        ClubRecyclerView.adapter = ClubAdapter
        ClubAdapter.onItemClick = {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("Club", it)
            startActivity(intent)
        }
    }
}