package word.searchg.gamematchers

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import android.view.View


import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import word.searchg.gamematchers.matchers.FoodMatcherActivity
import word.searchg.gamematchers.matchers.PlaceMatcherActivity
import word.searchg.gamematchers.matchers.ShoeMatcherActivity

class MainActivity : AppCompatActivity() {
    val  tag  = "ClickListener"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)


        foodMatcherBtn.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,FoodMatcherActivity::class.java)
            Log.d(tag, "FoodMatcher Called")
            startActivity(intent)
        })

        placeMatcherBtn.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,PlaceMatcherActivity::class.java)
            Log.d(tag, "PlaceMatcher Called")
            startActivity(intent)
        })

        shoeMatcherBtn.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,ShoeMatcherActivity::class.java)
            Log.d(tag, "ShoeMatcher Called")
            startActivity(intent)
        })
    }





}
