package com.example.belajarlagi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.AdapterView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.belajarlagi.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import android.view.Menu




class MainActivity : AppCompatActivity(), VirusAdapter.OnVirusItemClickListener {

    lateinit var binding: ActivityMainBinding
    lateinit var virusList: ArrayList<Virus>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        virusList = ArrayList()
        addVirus()
        Rv_Virus.layoutManager = LinearLayoutManager (this)
        Rv_Virus.addItemDecoration(DividerItemDecoration(this,1))
        Rv_Virus.adapter = VirusAdapter(virusList, this)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if (id == R.id.profil){
            Toast.makeText(this, "Open Profile", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }
        return super.onOptionsItemSelected(item)
    }

    fun addVirus(){
        virusList.add(Virus("Virus Marburg","Para ilmuwan mengidentifikasi virus Marburg tahun1967, ketika terjadi wabah kecil di antara para pekerja laboratorium di Jerman yang terpapar monyet-monyet yang terinfeksi yang diimpor dari Uganda. Virus Marburg mirip dengan Ebola karena keduanya dapat menyebabkan demam berdarah. Orang yang terinfeksi akan mengalami demam tinggi dan perdarahan di seluruh tubuh yang dapat menyebabkan syok, kegagalan organ, dan kematian.", R.drawable.virus_marburg) )
        virusList.add(Virus("Virus Ebola","Wabah Ebola pertama yang diketahui pada manusia menyerang secara serentak di Republik Sudan dan Republik Demokratik Kongo tahun 1976. Ebola menyebar melalui kontak dengan darah atau cairan tubuh lain, atau interaksi dari orang atau hewan yang terinfeksi. Menurut seorang ahli virus Ebola dan profesor mikrobiologi di Universitas Boston, Elke Muhlberger, strain virus Ebola diketahui bervariasi pada dampak kematian.", R.drawable.virus_ebola) )
        virusList.add(Virus("HIV","Di dunia modern, virus yang paling mematikan dari semuanya mungkin adalah HIV. Menurut Dr. Amesh Adalja, seorang dokter penyakit menular dan juru bicara untuk Infectious Disease Society of America, HIV masih menjadi pembunuh terbesar. Diperkirakan 32 juta orang telah meninggal karena HIV sejak penyakit ini pertama kali diakui pada awal 1980-an. Obat antivirus yang kuat memang memungkinkan pasien hidup selama bertahun-tahun dengan HIV. Tetapi penyakit ini terus menghancurkan banyak negara berpenghasilan rendah dan menengah, di mana 95 persen infeksi HIV baru terjadi.", R.drawable.hiv) )
        virusList.add(Virus("Hantavirus","Hantavirus Pulmonary Syndrome (HPS) pertama kali mendapat perhatian luas di Amerika Serikat (AS) pada 1993, ketika seorang lelaki muda yang sehat dan tunangannya meninggal dalam beberapa hari karena sesak napas. Beberapa bulan kemudian, otoritas kesehatan menemukan hantavirus dari tikus rusa yang tinggal di rumah salah satu orang yang terinfeksi. Lebih dari 600 orang di AS telah terinfeksi HPS dan 36 persen telah meninggal karena penyakit ini.", R.drawable.hantavirus) )
        virusList.add(Virus("Flu Spanyol","Salah satu jenis influenza paling mematikan adalah flu Spanyol yang dimulai pada 1918, dan merebak hingga 40 persen populasi dunia serta menewaskan sekitar 50 juta orang. Ini merupakan pandemi influenza kategori 5 yang mulai menyebar di Amerika Serikat, muncul di Afrika Barat dan Prancis, lalu menyebar hampir ke seluruh dunia.", R.drawable.flu_spanyol) )
        virusList.add(Virus("DBD","Virus demam berdarah pertama kali muncul pada tahun 1950-an di Filipina dan Thailand, kemudian menyebar ke seluruh wilayah tropis dan subtropis di dunia. Hingga 40 persen dari populasi dunia sekarang tinggal di daerah-daerah di mana demam berdarah adalah endemik, dan penyakit ini kemungkinan akan menyebar lebih jauh ketika suhu dunia menghangat.", R.drawable.dbd) )
        virusList.add(Virus("Rotavirus","Rotavirus dapat menyebar dengan cepat melalui fecal-oral route dan menyebabkan diare parah pada bayi dan anak kecil. Meskipun anak-anak di negara maju jarang meninggal karena infeksi rotavirus, penyakit ini adalah pembunuh di negara berkembang.", R.drawable.rotavirus) )
        virusList.add(Virus("SARS-CoV","Virus yang menyebabkan sindrom pernapasan akut yang parah atau SARS ini pertama kali muncul tahun 2002 di provinsi Guangdong, China selatan. Virus itu awalnya kemungkinan muncul pada kelelawar, kemudian melompat ke mamalia malam seperti musang sebelum akhirnya menginfeksi manusia. Setelah memicu wabah di China, SARS menyebar ke 26 negara di seluruh dunia, menginfeksi lebih dari 8 ribu orang dan menewaskan lebih dari 770 selama dua tahun.", R.drawable.sars_cov) )
        virusList.add(Virus("SARS-CoV-2","SARS-CoV-2 termasuk dalam keluarga besar virus yang sama dengan SARS-CoV, yang saat ini dikenal sebagai coronavirus (Covid-19), dan pertama kali diidentifikasi pada Desember 2019 di kota Wuhan, China. Virus yang belum ada obatnya hingga sekarang dan di tahun 2020 virusnya masih berlanjut para ilmuawan belum mengetahui kapan wabah ini berakhir tapi satu hal yang pasti banyak orang meninggal sebelum vaksin di temukan", R.drawable.sars_cov_2) )
        virusList.add(Virus("MERS-CoV","Virus yang menyebabkan Middle East respiratory syndrome atau MERS ini memicu wabah di Arab Saudi pada 2012 dan di Korea Selatan pada 2015. Virus MERS termasuk keluarga virus yang sama dengan SARS-CoV dan SARS-CoV-2, dan juga kemungkinan berasal dari kelelawar. Penyakit itu menginfeksi unta sebelum menular ke manusia dan membuat orang yang terinfeksi mengalami demam, batuk, dan sesak napas.", R.drawable.mers_cov) )
        virusList.add(Virus("Virus Rabies","Virus yang tidak kalah mematikan adalah virus Rabies yang menyerang hewan peliharaan. Vaksin Rabies untuk binatang peliharaan diperkenalkan pada 1920-an.", R.drawable.virus_rabies) )
        virusList.add(Virus("Virus Cacar","Pada tahun 1980, Majelis Kesehatan Dunia menyatakan dunia bebas dari penyakit cacar. Tetapi sebelum itu, manusia berjuang melawan cacar selama ribuan tahun, dan penyakit ini membunuh sekitar 1 dari 3 orang yang terinfeksi virus cacar. Itu membuat korban selamat dengan bekas luka yang dalam dan permanen dan, seringkali, kebutaan.", R.drawable.virus_cacar) )
    }

    override fun onItemClick(item: Virus, position: Int) {
        Toast.makeText(this, "Open ${item.name}", Toast.LENGTH_SHORT).show()
        val intent = Intent(this, VirusDetail::class.java)
        intent.putExtra("VIRUSNAME", item.name)
        intent.putExtra("VIRUSDETAIL", item.detail)
        intent.putExtra("VIRUSLOGO", item.logo.toString())
        startActivity(intent)

    }
}
