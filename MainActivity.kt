import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var episodeTitleTextView: TextView
    private lateinit var episodeSummaryTextView: TextView
    private lateinit var episodeDurationTextView: TextView

    private val episodes = listOf(
        Episode(
            "Cartman Gets an Anal Probe",
            "While the boys are waiting for the school bus, Cartman explains the odd nightmare he had the previous night involving alien visitors.",
            "S01E01",
            "22 min"
        ),
        Episode(
            "Weight Gain 4000",
            "When Cartman's environmental essay wins a national contest, America's sweetheart, Kathie Lee Gifford, comes to South Park to present the award.",
            "S01E02",
            "22 min"
        ),
        Episode(
            "Volcano",
            "A weekend trip to experience the finer points of camping, fishing and blowing animals to smithereens is threatened by an erupting volcano.",
            "S01E03",
            "22 min"
        ),
        Episode(
          "Big Gay Al's Gay Boat Ride",
          "When Stan discovers his new dog Sparky is gay, he becomes so confused he loses his will to play in the big Homecoming Football game against North Park",
          "S01E04",
          "22 min"
        ),
        Episode(
          "An Elephant Makes Love To A Pig",
          "Kyle's mom won't let him keep his new pet, an elephant because it's so huge. So the boys turn turn to the Dr. Mephesto to genetically engineer a smaller elephant.",
          "S01E05",
          "22 min"
        ),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        episodeTitleTextView = findViewById(R.id.episodeTitleTextView)
        episodeSummaryTextView = findViewById(R.id.episodeSummaryTextView)
        episodeDurationTextView = findViewById(R.id.episodeDurationTextView)

        button.setOnClickListener {
            showRandomEpisode()
        }
    }

    private fun showRandomEpisode() {
        val randomEpisode = episodes[Random.nextInt(episodes.size)]
        episodeTitleTextView.text = randomEpisode.title
        episodeSummaryTextView.text = randomEpisode.summary
        episodeDurationTextView.text = "Duration: ${randomEpisode.duration}"
    }
}

data class Episode(
    val title: String,
    val summary: String,
    val episodeNumber: String,
    val duration: String
)
