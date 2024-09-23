
package com.hardware.myapplication



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast


import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.hardware.myapplication.databinding.ActivityAdminBinding

class Admin : AppCompatActivity() {

    private lateinit var binding: ActivityAdminBinding
    private lateinit var database: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityAdminBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.registerBtn.setOnClickListener {

            val hospital  = binding.hospitalname.text.toString()
            val contactNo = binding.mobilenumber.text.toString()
            val address = binding.address.text.toString()
            val category = binding.catgory.text.toString()

            if (hospital.isNotEmpty() && contactNo.isNotEmpty()&& address.isNotEmpty()&& category.isNotEmpty()) {

                database = FirebaseDatabase.getInstance().getReference("Users")
                val User = Patient.User(address, contactNo, category, hospital)
                database.child(hospital).setValue(User).addOnSuccessListener {

                    binding.hospitalname.text.clear()
                    binding.mobilenumber.text.clear()
                    binding.catgory.text.clear()
                    binding.address.text.clear()


                    Toast.makeText(this, "Successfully Saved", Toast.LENGTH_SHORT).show()
                    if(1==1){

                        val gotobutton = findViewById<Button>(R.id.registerBtn)
                        gotobutton.setOnClickListener{

                            val intent1 = Intent(this, Patient::class.java)
                            startActivity(intent1)
                        }
                    }


                }.addOnFailureListener {

                    Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show()


                }
            } else {
                Toast.makeText(this, "Empty Fields Are not Allowed !!", Toast.LENGTH_SHORT).show()

            }

        }

    }




}

