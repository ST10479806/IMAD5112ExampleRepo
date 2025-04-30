package vcmsa.ci.mapogospizzahut

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.findViewTreeViewModelStoreOwner

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val radioGroupSize = findViewById<RadioGroup>(R.id.radioGroupSize)
        val rbSmall = findViewById<RadioButton>(R.id.rdSmall)
        val rbMedium = findViewById<RadioButton>(R.id.rdMedium)
        val rbLarge = findViewById<RadioButton>(R.id.rdLarge)
        val chkCheese = findViewById<CheckBox>(R.id.chkCheese)
        val chkOlives = findViewById<CheckBox>(R.id.chkOlives)
        val btnCompute = findViewById<Button>(R.id.btnCompute)
        val btnClear = findViewById<Button>(R.id.btnClear)
        val txtTotal = findViewById<TextView>(R.id.txtTotal)


        btnCompute.setOnClickListener {
            var total = 0.0

            if (rbSmall.isChecked) {

                total += 55.99
            } else if (rbMedium.isChecked) {
                total += 89.99

            } else if (rbLarge.isChecked) {
                total += 119.99

            }

            if (chkCheese.isChecked) {
                total += 5.50
            }
            if (chkOlives.isChecked) {
                total += 3.50
            }
            txtTotal.text = String.format("Total Amount Due: R%.2f", total)
        }
        btnClear.setOnClickListener {
            txtTotal.text =""
            //radioGroupSize.clearCheck()
            rbSmall.isChecked = false
            rbMedium.isChecked = false
            rbLarge.isChecked = false
            chkOlives.isChecked = false
            chkCheese.isChecked = false



        }




















        }























    }
