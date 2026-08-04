package com.hrushant.basicsofandroid

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_order = findViewById<Button>(R.id.btn_order)
        val rg_meat_type = findViewById<RadioGroup>(R.id.rg_meat_type)
        val cb_cheese = findViewById<CheckBox>(R.id.cb_cheese)
        val cb_sauce = findViewById<CheckBox>(R.id.cb_sauce)
        val cb_salad = findViewById<CheckBox>(R.id.cb_salad)
        val tv_order = findViewById<TextView>(R.id.tv_order_list)
        btn_order.setOnClickListener {
            val checkedRadioBtnId = rg_meat_type.checkedRadioButtonId
            val checkedRb = findViewById<RadioButton>(checkedRadioBtnId)
            val isCheese = cb_cheese.isChecked
            val isSauce = cb_sauce.isChecked
            val isSalad = cb_salad.isChecked
            val orderString = "You ordered a burger with : \n" +
                    "${checkedRb.text} and " +
                    (if(isCheese) "\nCheese " else "") +
                    (if(isSalad) "\nSalad " else "") +
                    (if(isSauce) "\nSauce " else "")
            tv_order.text = orderString
        }

    }
}