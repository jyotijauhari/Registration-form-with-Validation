package com.dj.registrationform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var registerLayout : ConstraintLayout ? = null
        var radioGroup : RadioGroup ?= null
    }

    fun RegisterUser(view: View) {
            Validation()
    }


    fun Validation(){


        val userName: String = etUsername.text.toString()
        val name : String = etName.etName.toString()
        val postAdd1 : String = etAdd1.text.toString()
        val postAdd2 : String = etAdd2.text.toString()
        val city : String = etCity.text.toString()
        val postCode : String = etPostcode.text.toString()
        val age : String = etAge.text.toString()



        if (etUsername.text.toString().isEmpty()) {
            etUsername.error = "username cannot be empty."
            return
        }
        else if (etName?.text.isNullOrEmpty()) {
            etName?.error = "Person Name cannot be empty."
            return
        }
        else if (etAdd1?.text.isNullOrEmpty()) {
            etAdd1?.error = "Address cannot be empty."
            return
        }
        /*else if (etAdd2?.text.isNullOrEmpty()) {
            etAdd2?.error = "Person Name cannot be empty."
            return
        }*/
        else if (etCity?.text.isNullOrEmpty()) {
            etCity?.error = "City name cannot be empty."
            return
        }
        else if (etPostcode?.text.isNullOrEmpty()) {
            etPostcode?.error = "Postcode cannot be empty."
            return
        }
        else if (etAge?.text.isNullOrEmpty()) {
            etAge?.error = "Age cannot be empty."
            return
        }
        else if (radioGroup.getCheckedRadioButtonId() == -1 ) {
            Toast.makeText(getApplicationContext(), "Please select Gender", Toast.LENGTH_SHORT).show();
        }
        else if (!checkBox1.isChecked && !checkBox2.isChecked && !checkBox3.isChecked && !checkBox4.isChecked && !checkBox5.isChecked && !checkBox6.isChecked ) {
              Toast.makeText(this,"Select atleast one genre", Toast.LENGTH_SHORT).show()
            }
        else
        {

            intent = Intent(this, DashBoard::class.java)
            startActivity(intent)
        }




       /* if (userName.trim().length < 1 || name.trim().length < 1 || postAdd1.trim().length < 1 ||
            postAdd2.trim().length < 1 || city.trim().length < 1 || postCode.trim().length < 1 || age.trim().length < 1){
            Toast.makeText(applicationContext, "This field can't be empty! ", Toast.LENGTH_SHORT).show()
        }*/

    }

    fun RegisterTwitter(view: View) {
        Toast.makeText(this, "Registered using Twitter", Toast.LENGTH_SHORT).show()
    }
    fun RegsiterFacebook(view: View) {
        Toast.makeText(this, "Registered using Facebook", Toast.LENGTH_SHORT).show()
    }

    fun onRadioButtonClicked(view: View) {
        if (view is RadioButton) {
            // Is the button now checked?
            val checked = view.isChecked

            if (view.isChecked){

            }
            else
            {
                Snackbar.make(registerLayout,"choose a gender",Snackbar.LENGTH_SHORT).show()
            }
            // Check which radio button was clicked
            when (view.getId()) {
                R.id.radioMale ->
                    if (checked) {
                        // male
                    }
                R.id.radioFemale ->
                    if (checked) {
                        // female
                    }
            }
        }
    }
}