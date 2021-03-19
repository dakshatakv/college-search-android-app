package com.example.futuredictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Coimbatore : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coimbatore)

        val list = ArrayList<CollegesDataClass>()
        list.add(CollegesDataClass("A.S.L. Pauls College of Engineering and Technology, Pollachi, Coimbatore","College Code : 2604","Affiliated University  : Anna University - Coimbatore","Contact : 97866 55803"))

        list.add(CollegesDataClass("Adithya Institute of Technology, Coimbatore","College Code : 2744","Affiliated University : Anna University - Coimbatore","Contact : 9842677711"))

        list.add(CollegesDataClass("Agricultural Engineering College & Research Institute, Coimbatore","","Affiliated University : Deemed University","Contact : 0422- 6611200"))

        list.add(CollegesDataClass("Akshaya College of Engineering & Technology, Coimbatore","College Code : 2763","Affiliated University : Anna University - Coimbatore","Contact : 9843394451"))

        list.add(CollegesDataClass("Amrita School of Engineering, Coimbatore","","Affiliated University : Deemed University","Contact : 0422-2685169"))

        list.add(CollegesDataClass("Avinashilingam Faculty Of Engineering College, Coimbatore","","Affiliated University : Deemed University","Contact : 0422-2658716"))

        list.add(CollegesDataClass("C.M.S. College of Engineering, Coimbatore","College Code : 2772","Affiliated University : Anna University - Coimbatore","Contact : 0422 - 2636055"))

        list.add(CollegesDataClass("Christ The King Engineering College, Coimbatore","College Code : 2650","Affiliated University : Anna University - Coimbatore","Contact : 04254- 273362"))

        list.add(CollegesDataClass("Coimbatore Aeronautical College, Othakkal Mandapam, Coimbatore","","Affiliated University : Anna University","Contact : 9843155985"))

        list.add(CollegesDataClass("Coimbatore Institute of Engineering and Technology, Coimbatore","College Code : 2704","Affiliated University : Anna University - Coimbatore","Contact : 9790038605"))

        list.add(CollegesDataClass("Coimbatore Institute of Technology, Coimbatore","College Code : 2007","Affiliated University : Anna University - Coimbatore","Contact : 9843071074"))

        list.add(CollegesDataClass("Coimbatore Marine College, Othakkal Mandapam, Coimbatore","","Affiliated University : Anna University","Contact : 9843155985"))

        list.add(CollegesDataClass("Dr Mahalingam College of Engineering and Technology, Pollachi, Coimbatore","College Code : 2706","Affiliated University : Anna University - Coimbatore","Contact : 9842304358"))

        list.add(CollegesDataClass("Dr. N.G.P. Institute of Technology, Coimbatore","College Code : 2736","Affiliated University : Anna University - Coimbatore","Contact : 9442853333"))

        list.add(CollegesDataClass("Easa College of Engineering and Technology, Coimbatore","College Code : 2749","Affiliated University : Anna University - Coimbatore","Contact : 0422-4214878"))

        list.add(CollegesDataClass("Government College of Technology, Coimbatore","College Code : 2005","Affiliated University : Anna University - Coimbatore","Contact : 0422- 2455868"))

        list.add(CollegesDataClass("Hindustan Institute of Technology, Coimbatore","College Code : 2740","Affiliated University : Anna University - Coimbatore","Contact : 0422-2610966"))

        list.add(CollegesDataClass("Hindusthan College of Engineering and Technology, Coimbatore","College Code : 2708","Affiliated University : Anna University - Coimbatore","Contact : 9443209834"))

        list.add(CollegesDataClass("Indus College of Engineering, Coimbatore","College Code : 2128","Affiliated University : Anna University - Coimbatore","Contact : 9443143876"))

        list.add(CollegesDataClass("Info Institute of Engineering, Coimbatore","College Code : 2732","Affiliated University : Anna University - Coimbatore","Contact : 9786612277"))

        list.add(CollegesDataClass("J.C.T. College of Engineering and Technology, Coimbatore","College Code : 2769","Affiliated University : Anna University - Coimbatore","Contact : 0422 2636900"))

        list.add(CollegesDataClass("Jansons Institute of Engineering and Technology, Coimbatore","College Code : 2762","Affiliated University : Anna University - Coimbatore","Contact : 0421-2264900"))

        list.add(CollegesDataClass("Jawaharlal Institute of Technology, Coimbatore","College Code : 2755","Affiliated University : Anna University - Coimbatore","Contact : 04222656625"))

        list.add(CollegesDataClass("K.G.I.S.L. Institute of Technology, Coimbatore","College Code : 2751","Affiliated University : Anna University - Coimbatore","Contact : 9843120515"))

        list.add(CollegesDataClass("K.P.R. Institute of Engineering and Technology, Arasur, Coimbatore","College Code : 2009","Affiliated University : Anna University - Coimbatore","Contact : 0422- 2519100"))

        list.add(CollegesDataClass("Kalaignar Karunanidhi Institute of Technology, Palladam, Coimbatore","College Code : 2750","Affiliated University : Anna University - Coimbatore","Contact : 9965590056"))

        list.add(CollegesDataClass("Kalaivani College of Technology, Coimbatore","College Code : 2770","Affiliated University : Anna University - Coimbatore","Contact : 9150008944"))

        list.add(CollegesDataClass("Karpagam College of Engineering, Coimbatore","College Code : 2710","Affiliated University : Anna University - Coimbatore","Contact : 0422-2619041"))

        list.add(CollegesDataClass("Karpagam Institute of Technology, Coimbatore","College Code : 1901","Affiliated University : Anna University - Coimbatore","Contact : 0422-6454555"))

        list.add(CollegesDataClass("Karunya University (Karunya Institute of Technology), Coimbatore","","Affiliated University : Deemed University","Contact : 0422-6724936"))

        list.add(CollegesDataClass("Kathir College of Engineering, Coimbatore","College Code : 2745","Affiliated University : Anna University - Coimbatore","Contact : 9750188188"))

        list.add(CollegesDataClass("KTVR Knowledge Park for Engineering and Technology, Coimbatore","College Code : 2746","Affiliated University : Anna University - Coimbatore","Contact : 9487425000"))

        list.add(CollegesDataClass("Kumaraguru College of Technology, Coimbatore","College Code : 2712","Affiliated University : Anna University - Coimbatore","Contact 0422 - 2669402"))

        list.add(CollegesDataClass("Maharaja Engineering College, Avinashi, Coimbatore","College Code : 2714","Affiliated University : Anna University - Coimbatore","Contact : 9842331128"))

        list.add(CollegesDataClass("Maharaja Prithvi Engineering College, Avinashi, Coimbatore","College Code : 2724","Affiliated University : Anna University - Coimbatore","Contact : 9842331128"))

        list.add(CollegesDataClass("Maharaja Institute of Technology, Coimbatore","College Code : 2730","Affiliated University : Anna University - Coimbatore","Contact : 9894981730"))

        list.add(CollegesDataClass("Nehru Institute of Engineering and Technology, Coimbatore","","Affiliated University : Anna University - Coimbatore","Contact : 04222622008"))

        list.add(CollegesDataClass("P.A. College of Engineering and Technology, Pollachi, Coimbatore","College Code : 2741","Affiliated University : Anna University - Coimbatore","Contact : 04259-221384"))

        list.add(CollegesDataClass("P.P.G. Institute of Technology, Coimbatore","College Code : 1959","Affiliated University : Anna University - Coimbatore","Contact : 9843042230"))

        list.add(CollegesDataClass("P.S.G. College of Technology, Coimbatore","College Code : 2006","Affiliated University : Anna University - Coimbatore","Contact : 0422 - 2572477"))

        list.add(CollegesDataClass("Park College of Engineering Technology, Kaniyur, Coimbatore","College Code : 2716","Affiliated University : Anna University - Coimbatore","Contact : 9443743342"))

        list.add(CollegesDataClass("Park College of Technology, Karumathampatti, Coimbatore","College Code : 2768","Affiliated University : Anna University - Coimbatore","Contact : 8883179777"))

        list.add(CollegesDataClass("R.V.S. College of Engineering and Technology (Faculty of Engineering), Coimbatore","","Affiliated University : Anna University - Coimbatore","Contact : 0422 -2687877"))

        list.add(CollegesDataClass("R.V.S. Faculty of Engineering, Coimbatore","College Code : 2776","Affiliated University : Anna University - Coimbatore","Contact : 0422- 2687877"))

        list.add(CollegesDataClass("R.V.S. School of Architecture, Coimbatore","College Code : 2778","Affiliated University : Anna University","Contact : 0422- 2688077"))

        list.add(CollegesDataClass("Ranganathan Engineering College, Coimbatore","College Code : 2737","Affiliated University : Anna University - Coimbatore","Contact : 9943919965"))

        list.add(CollegesDataClass("Rathinam Technical Campus, Coimbatore","College Code : 2329","Affiliated University : Anna University - Coimbatore","Contact : 98946 16026"))

        list.add(CollegesDataClass("S.N.S. College of Engineering, Coimbatore","College Code : 2734","Affiliated University : Anna University - Coimbatore","Contact : 04226465202"))

        list.add(CollegesDataClass("S.N.S. College of Technology, Coimbatore","College Code : 2726","Affiliated University : Anna University - Coimbatore",""))

        list.add(CollegesDataClass("S.S.K. College of Engineering and Technology, Coimbatore","College Code : 2743","Affiliated University : Anna University - Coimbatore","Contact : 9750956751"))

        list.add(CollegesDataClass("S.V.S. College of Engineering, Pollachi, Coimbatore","College Code : 2654","Affiliated University : Anna University - Coimbatore","Contact : 9047049993"))

        list.add(CollegesDataClass("Sasurie Academy of Engineering, Coimbatore","College Code : 2738","Affiliated University : Anna University - Coimbatore","Contact : 04254327676"))

        list.add(CollegesDataClass("Sree Sakthi Engineering College, Coimbatore","College Code : 2673","Affiliated University : Anna University - Coimbatore","Contact : 9245600252"))

        list.add(CollegesDataClass("Sri Eshwar College of Engineering, Coimbatore","College Code : 2739","Affiliated University : Anna University - Coimbatore","Contact : 7373617171"))

        list.add(CollegesDataClass("Sri Krishna College of Engineering and Technology, Coimbatore","College Code : 2718","Affiliated University : Anna University - Coimbatore","Contact : 0422-2678002"))

        list.add(CollegesDataClass("Sri Ramakrishna Engineering College, Coimbatore","College Code : 2719","Affiliated University : Anna University - Coimbatore","Contact : 9842299009"))

        list.add(CollegesDataClass("Sri Ramakrishna Institute of Technology, Coimbatore","College Code : 2725","Affiliated University : Anna University - Coimbatore","Contact : 0422-2605477"))

        list.add(CollegesDataClass("Sri Ranganathar Institute of Engineering and Technology, Coimbatore","College Code : 2342","Affiliated University : Anna University","Contact : 0422 2697792"))

        list.add(CollegesDataClass("Sri Shakthi Institute Of Engineering & Technology, Coimbatore","College Code : 2727","Affiliated University : Anna University - Coimbatore","Contact : 0422 6450893"))

        list.add(CollegesDataClass("Sri Shakthi Institute of Engineering and Technology, Coimbatore","College Code : 2727","Affiliated University : Anna University - Coimbatore","Contact : 9443687165"))

        list.add(CollegesDataClass("Sriguru Institute of Technology, Coimbatore","College Code : 2765","Affiliated University : Anna University - Coimbatore","Contact : 9629487777"))

        list.add(CollegesDataClass("Suguna College of Engineering, Coimbatore","College Code : 2360","Affiliated University : Anna University","Contact : 9698110101"))

        list.add(CollegesDataClass("Tamilnadu College of Engineering, Coimbatore","College Code : 2721","Affiliated University : Anna University - Coimbatore","Contact : 9894612700"))

        list.add(CollegesDataClass("Tamilnadu School of Architecture, Coimbatore","College Code : 2728","Affiliated University : Anna University - Coimbatore","Contact : 9442208932"))

        list.add(CollegesDataClass("Tejaa Shakthi Institute of Technology for Women, Coimbatore","College Code : 2130","Affiliated University : Anna University - Coimbatore","Contact : 9442592800"))

        list.add(CollegesDataClass("United Institute of Technology, Coimbatore","College Code : 2761","Affiliated University : Anna University - Coimbatore","Contact : 0422- 6724084"))

        list.add(CollegesDataClass("V.L.B. Janaki Ammal College of Engineering and Technology, Coimbatore","College Code : 2722","Affiliated University : Anna University - Coimbatore","Contact : 0422 - 2604545"))
        val recycler_view_college : RecyclerView = findViewById(R.id.recycler_view_college)

        recycler_view_college.adapter=CollegesAdapter(list)
        recycler_view_college.layoutManager= LinearLayoutManager(this)
        recycler_view_college.setHasFixedSize(true)
    }
}