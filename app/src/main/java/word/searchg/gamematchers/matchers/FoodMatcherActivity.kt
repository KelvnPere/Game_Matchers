package word.searchg.gamematchers.matchers

import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import word.searchg.gamematchers.R

import kotlinx.android.synthetic.main.activity_food_matcher.*
import kotlinx.android.synthetic.main.content_food_matcher.*
import word.searchg.gamematchers.R.drawable.*

class FoodMatcherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_matcher)
        setSupportActionBar(toolbar)

        // images to be shown
        val images: MutableList<Int> =
            mutableListOf(banana, beans, bole, plantain, rice, soup,banana, beans, bole, plantain, rice, soup)

        // button associated with the images
        val buttons: Array<Button> = arrayOf(
            button1,
            button2,
            button3,
            button4,
            button5,
            button6,
            button7,
            button8,
            button9,
            button10,
            button11,
            button12
        )

        val cardBack = star
        var clicked = 0
        var turnOver = false
        var lastClicked = -1

        // this will randomlize the placement of the images in the button.
        images.shuffle()

        for (i in 0..11) {
           // buttons[i].setBackgroundResource(plantain)
            buttons[i].text = "backOfTheCard"
           // buttons[i].textSize = 0.0F
            buttons[i].setOnClickListener {
                if (buttons[1].text == "backOfTheCard" && !turnOver) {
                    buttons[i].setBackgroundResource(images[i])
                    buttons[i].setText(images[i])
                    if (clicked == 0){
                        lastClicked = i
                    }
                    clicked++
                }else if (buttons[i].text !in "backOfTheCard"){
                    buttons[i].setBackgroundResource(cardBack)
                    buttons[i].text = "backOfTheCard"
                    clicked--
                }

            if (clicked == 2){
                turnOver = true
               if (buttons[i].text == buttons[lastClicked].text){
                   buttons[i].isClickable = false
                   buttons[lastClicked].isClickable = false
                     turnOver = false
                      clicked = 0
               }
            }else if (clicked == 0){
                turnOver = false
            }

            }
        }
    }

}
