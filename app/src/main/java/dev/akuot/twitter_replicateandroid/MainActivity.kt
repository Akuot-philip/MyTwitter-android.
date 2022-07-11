package dev.akuot.twitter_replicateandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.akuot.twitter_replicateandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displytTweet()

    }
    fun displytTweet(){
        var tweet1=Twitter("Akuot","@akuot","I love you","","23","50","500")
        var tweet2=Twitter("Nkima","@nkima","This is amazing","","35","60","500")
        var tweet3=Twitter("Philip","@philip","What is this","","30","70","500")
        var tweet4=Twitter("Odoyo","@ododyo","Woow","","50","80","500")
        var tweet5=Twitter("Cecilia","@cecilia","Okay","","20","50","500")
        var tweet6=Twitter("Riako","@riako","Jesus","","10","90","500")

        var TwitterList=
            listOf(tweet1,tweet2,tweet3,tweet4,tweet5,tweet6)
        var twitterAdapter=TwitterRvAdapter(TwitterList)
        binding.rvTwitter.layoutManager=LinearLayoutManager(this)
        binding.rvTwitter.adapter=twitterAdapter
    }
}