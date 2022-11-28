package com.example.wikipedia.fragments

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.wikipedia.activities.DetaileActivity
import com.example.wikipedia.activities.SEND_DATA
import com.example.wikipedia.adapters.Explore_recyclerview_adapter
import com.example.wikipedia.adapters.Trends_recyclerview_adapter
import com.example.wikipedia.databinding.FragmentExploreBinding
import com.example.wikipedia.wiki_data


class Explore : Fragment(), Explore_recyclerview_adapter.Explore_events {
    lateinit var binding: FragmentExploreBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentExploreBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val DATA: List<wiki_data> = arrayListOf(

            wiki_data(
                "Acra (fortress)",
                "The Acra (also spelled Akra, from Ancient Greek: Ἄκρα, Hebrew: חקרא ,חקרה Ḥaqra(h)), with the meaning of \"stronghold\" (see under \"Etymology\"), was a place in Jerusalem thought to have had a fortified compound built by Antiochus Epiphanes, ruler of the Seleucid Empire, following his sack of the city in 168 BCE. The name Acra was also used at a later time for a city quarter probably associated with the by-then destroyed fortress, known in his time to Josephus (1st century CE) as both Acra and \"the lower city\". The fortress played a significant role in the events surrounding the Maccabean Revolt, which resulted in the formation of the Hasmonean Kingdom. The \"upper city\" was captured by Judas Maccabeus, with the Seleucid garrison taking refuge in the \"Acra\" below,[1][2] and the task of destroying this last enemy stronghold inside Jerusalem fell to Simon Maccabeus surnamed Thassi.[3] Our knowledge about the Acra is based almost exclusively on the writings of Josephus, which are of a later date, and on the First and Second Books of Maccabees, which were written not long after the described events.[4][5][6][7]\n" +
                        "\n" +
                        "The exact location of Acra within Jerusalem, and even the meaning of the term - fortress, fortified compound inside the city, or compound with an associated fortress - is critical to understanding Hellenistic Jerusalem, but it remains a matter of ongoing discussion. The fact that Josephus has used the name interchangeably with 'the lower city'[8] certainly doesn't help. Historians and archaeologists have proposed various sites around Jerusalem, relying initially mainly on conclusions drawn from literary evidence. This approach began to change in the light of excavations which commenced in the late 1960s. New discoveries have prompted reassessments of the ancient literary sources, Jerusalem's geography, and previously discovered artifacts. The more recent theories combine archaeological and textual evidence and favour locations near the Temple Mount and south of it,[9] but there are alternative theories as well (see \"Location\").\n" +
                        "\n" +
                        "The ancient Greek term acra was used to describe other fortified structures during the Hellenistic period. The Acra is often called the Seleucid Acra to distinguish it from references to the Ptolemaic Baris as an acra and from the later city quarter of Jerusalem which inherited the name Acra.",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fd/Acra_fortress_-_Givati_Parking_Lot_dig_1.jpg/220px-Acra_fortress_-_Givati_Parking_Lot_dig_1.jpg",
                "https://en.wikipedia.org/wiki/Acra_(fortress)"
            ),
            wiki_data(
                "Angkor Wat",
                "Angkor Wat (/ˌæŋkɔːr ˈwɒt/; Khmer: អង្គរវត្ត, \"City/Capital of Temples\") is a temple complex in Cambodia and is the largest religious monument in the world,[1] on a site measuring 162.6 hectares (1,626,000 m2; 402 acres).[2] Originally constructed as a Hindu temple[1] dedicated to the god Vishnu for the Khmer Empire by King Suryavarman II, it was gradually transformed into a Buddhist temple towards the end of the 12th century; as such, it is also described as a \"Hindu-Buddhist\" temple.[3][4]\n" +
                        "\n" +
                        "Angkor Wat was built at the behest of the Khmer King Suryavarman II[5] in the early 12th century in Yaśodharapura (Khmer: យសោធរបុរៈ, present-day Angkor), the capital of the Khmer Empire, as his state temple and eventual mausoleum. Angkor Wat combines two basic plans of Khmer temple architecture: the temple-mountain and the later galleried temple. It is designed to represent Mount Meru, home of the devas in Hindu mythology: within a moat more than 5 kilometres (3 mi) long[6] and an outer wall 3.6 kilometres (2.2 mi) long are three rectangular galleries, each raised above the next. At the centre of the temple stands a quincunx of towers. Unlike most Angkorian temples, Angkor Wat is oriented to the west; scholars are divided as to the significance of this. The temple is admired for the grandeur and harmony of the architecture, its extensive bas-reliefs, and for the numerous devatas adorning its walls. The modern name Angkor Wat, alternatively Nokor Wat,[7] means \"Temple City\" or \"City of Temples\" in Khmer. Angkor (អង្គរ ângkôr) meaning \"city\" or \"capital city\", is a vernacular form of the word nokor (នគរ nôkôr), which comes from the Sanskrit/Pali word nagara (Devanāgarī: नगर).[8] Wat (វត្ត vôtt) is the word for \"temple grounds\", also derived from Sanskrit/Pali vāṭa (Devanāgarī: वाट), meaning \"enclosure\".[9]",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/4/44/Ankor_Wat_temple.jpg/220px-Ankor_Wat_temple.jpg",
                "https://en.wikipedia.org/wiki/Angkor_Wat"
            ),
            wiki_data(
                "Belton House",
                "Belton House is a Grade I listed country house in the parish of Belton near Grantham in Lincolnshire, England, built between 1685 and 1688 by Sir John Brownlow, 3rd Baronet. It is surrounded by formal gardens and a series of avenues leading to follies within a larger wooded park. Belton has been described as a compilation of all that is finest of Carolean architecture, the only truly vernacular style of architecture that England had produced since the Tudor period.[1] It is considered to be a complete example of a typical English country house.[2][3]\n" +
                        "\n" +
                        "For about three centuries until 1984, Belton House was the seat successively of the Brownlow family, which had first acquired land in the area in the late 16th century, and of its heirs the Cust family (in 1815 created Earl Brownlow). Despite his great wealth Sir John Brownlow, 3rd Baronet, chose to build a comparatively modest house rather than one of the grand Baroque palaces being built by others at the time. The contemporary, if provincial, Carolean style was the selected choice of design. The new house was fitted with the latest innovations such as sash windows[4] for the principal rooms, and more significantly, with completely separate areas for the staff. Successive generations made changes to the interior of the house which reflected their changing social position and tastes, yet the fabric and design of the house changed little.\n" +
                        "\n" +
                        "Following World War I,[5] the Custs, like many previously wealthy English families, were faced with mounting financial problems and finally in 1984 they donated the house, with most of its contents, to the National Trust, which now opens Belton to the public.",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/Belton_House_South_Elevation.jpg/350px-Belton_House_South_Elevation.jpg",
                "https://en.wikipedia.org/wiki/Belton_House"
            ),
            wiki_data(
                "Ukiyo-e",
                "Ukiyo-e[a] is a genre of Japanese art which flourished from the 17th through 19th centuries. Its artists produced woodblock prints and paintings of such subjects as female beauties; kabuki actors and sumo wrestlers; scenes from history and folk tales; travel scenes and landscapes; flora and fauna; and erotica. The term ukiyo-e (浮世絵) translates as \"picture[s] of the floating world\".\n" +
                        "\n" +
                        "In 1603, the city of Edo (Tokyo) became the seat of the ruling Tokugawa shogunate. The chōnin class (merchants, craftsmen and workers), positioned at the bottom of the social order, benefited the most from the city's rapid economic growth, and began to indulge in and patronise the entertainment of kabuki theatre, geisha, and courtesans of the pleasure districts; the term ukiyo (\"floating world\") came to describe this hedonistic lifestyle. Printed or painted ukiyo-e works were popular with the chōnin class, who had become wealthy enough to afford to decorate their homes with them.\n" +
                        "\n" +
                        "The earliest ukiyo-e works emerged in the 1670s, with Hishikawa Moronobu's paintings and monochromatic prints of beautiful women. Colour prints were introduced gradually, and at first were only used for special commissions. By the 1740s, artists such as Okumura Masanobu used multiple woodblocks to print areas of colour. In the 1760s, the success of Suzuki Harunobu's \"brocade prints\" led to full-colour production becoming standard, with ten or more blocks used to create each print. Some ukiyo-e artists specialized in making paintings, but most works were prints. Artists rarely carved their own woodblocks for printing; rather, production was divided between the artist, who designed the prints, the carver, who cut the woodblocks, the printer, who inked and pressed the woodblocks onto handmade paper, and the publisher, who financed, promoted, and distributed the works. As printing was done by hand, printers were able to achieve effects impractical with machines, such as the blending or gradation of colours on the printing block.\n" +
                        "\n" +
                        "Specialists have prized the portraits of beauties and actors by masters such as Torii Kiyonaga, Utamaro, and Sharaku that came in the late 18th century. The 19th century also saw the continuation of masters of the ukiyo-e tradition, with the creation of the artist Hokusai's The Great Wave off Kanagawa, one of the most well-known works of Japanese art, and the artist Hiroshige's The Fifty-three Stations of the Tōkaidō. Following the deaths of these two masters, and against the technological and social modernization that followed the Meiji Restoration of 1868, ukiyo-e production went into steep decline. However, the 20th century saw a revival in Japanese printmaking: the shin-hanga (\"new prints\") genre capitalized on Western interest in prints of traditional Japanese scenes, and the sōsaku-hanga (\"creative prints\") movement promoted individualist works designed, carved, and printed by a single artist. Prints since the late 20th century have continued in an individualist vein, often made with techniques imported from the West.\n" +
                        "\n" +
                        "Ukiyo-e was central to forming the West's perception of Japanese art in the late 19th century, particularly the landscapes of Hokusai and Hiroshige. From the 1870s onwards, Japonisme became a prominent trend and had a strong influence on the early Impressionists such as Edgar Degas, Édouard Manet and Claude Monet, as well as having an impact on Post-Impressionists such as Vincent van Gogh, and Art Nouveau artists such as Henri de Toulouse-Lautrec.",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d4/Tokaido13_Hara.jpg/243px-Tokaido13_Hara.jpg",
                "https://en.wikipedia.org/wiki/Ukiyo-e"
            ),
            wiki_data(
                "The Thankful Poor",
                "The Thankful Poor is an 1894 genre painting by the African-American painter Henry Ossawa Tanner. It depicts two African Americans praying at a table, and shares common themes with Tanner's other paintings from the 1890s including The Banjo Lesson (1893) and The Young Sabot Maker (1895). The work is based on photographs Tanner had taken, and is influenced by his views on education and race, which were in turn derived from those of his father, Benjamin Tucker Tanner, and the African Methodist Episcopal Church. The painting is considered a milestone in African-American art, notably for its countering of racial stereotypes.\n" +
                        "\n" +
                        "Following his return to the United States in 1893, Tanner became more racially aware and chose to use artwork including The Thankful Poor as a means of portraying African-American culture in a dignified manner. The painting received praise from critics upon its exhibition in Philadelphia during the spring of 1894, but it is also Tanner's last African-American genre work as the artist began to focus on biblical scenes.\n" +
                        "\n" +
                        "After remaining hidden for years, the painting was discovered in a storage closet of the Pennsylvania School for the Deaf in 1970, before being purchased by Camille and Bill Cosby in 1981 for their private collection. In 2020, the painting was sold by the Cosbys to Art Bridges, a foundation created by Alice Walton for loaning artwork. The Thankful Poor has been exhibited at the National Museum of African Art, and a preparatory study is held by the DuSable Museum of African American History.",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/4/40/The_Thankful_Poor%2C_1894._Henry_Ossawa_Tanner.jpg/400px-The_Thankful_Poor%2C_1894._Henry_Ossawa_Tanner.jpg",
                "https://en.wikipedia.org/wiki/The_Thankful_Poor"
            ),
            wiki_data(
                "Streatham portrait",
                "The \"Streatham\" portrait is an oil painting on panel from the 1590s believed to be a later copy of a woodcut of the English noblewoman Lady Jane Grey from 1580.[1][2][3] It shows a three-quarter-length depiction of a young woman in Tudor-period dress holding a prayer book, with the faded inscription \"Lady Jayne\" or \"Lady Iayne\" in the upper-left corner. It is in poor condition and damaged, as if it has been attacked. As of January 2015 the portrait is in Room 3 of the National Portrait Gallery in London.\n" +
                        "\n" +
                        "The work is thought to have been completed as part of a set of paintings of Protestant martyrs. It was in the possession of a collector in Streatham, London, by the early 20th century. In December 2005 the portrait was examined by the art dealer Christopher Foley. He saw it as an accurate, though poorly executed, reproduction of a contemporary painting of Jane, had it verified and on that basis negotiated its sale. The work was acquired by the National Portrait Gallery in London for a rumoured £100,000. The historian David Starkey was highly critical of the sale and challenged Foley's identifications.",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/8/87/Streathamladyjayne.jpg/340px-Streathamladyjayne.jpg",
                "https://en.wikipedia.org/wiki/Streatham_portrait"
            ),
            wiki_data(
                "Galerina marginata",
                "Galerina marginata, known colloquially as funeral bell, deadly skullcap, autumn skullcap or deadly galerina, is a species of extremely poisonous mushroom-forming fungus in the family Hymenogastraceae of the order Agaricales. It contains the same deadly amatoxins found in the death cap (Amanita phalloides). Ingestion in toxic amounts causes severe liver damage with vomiting, diarrhea, hypothermia, and eventual death if not treated rapidly. About ten poisonings have been attributed to the species now grouped as G. marginata over the last century.\n" +
                        "\n" +
                        "G. marginata is widespread in the Northern Hemisphere, including Europe, North America, and Asia, and has also been found in Australia. It is a wood-rotting fungus that grows predominantly on decaying conifer wood. The fruit bodies of the mushroom have brown to yellow-brown caps that fade in color when drying. The gills are brownish and give a rusty spore print. A well-defined membranous ring is typically seen on the stems of young specimens but often disappears with age. In older fruit bodies, the caps are flatter and the gills and stems browner. The species is a classic \"little brown mushroom\" – a catchall category that includes all small to medium-sized, hard-to-identify brownish mushrooms, and may be easily confused with several edible species.\n" +
                        "\n" +
                        "Before 2001, the species G. autumnalis, G. oregonensis, G. unicolor, and G. venenata were thought to be distinct from G. marginata due to differences in habitat and the viscidity of their caps, but phylogenetic analysis showed that they are all the same species.",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/b/bb/Galerina_marginata_Point_Reyes.jpg/220px-Galerina_marginata_Point_Reyes.jpg",
                "https://en.wikipedia.org/wiki/Galerina_marginata"
            )
        )


        set_trends_recyclerview_adapter(DATA)

    }


    private fun set_trends_recyclerview_adapter(list: List<wiki_data>) {
        val myAdapter = Explore_recyclerview_adapter(list, this)
        binding.exploreRecyclerview.adapter = myAdapter
        binding.exploreRecyclerview.layoutManager =
            LinearLayoutManager(binding.root.context, RecyclerView.VERTICAL, false)
    }

    override fun cardview_clickListener(wikiData: wiki_data) {


        val intent = Intent( context , DetaileActivity::class.java )
        intent.putExtra( SEND_DATA , wikiData )
        startActivity(intent)

    }


}