
package com.hardware.myapplication



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast


import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.hardware.myapplication.databinding.ActivityPatientBinding

class Patient : AppCompatActivity() {

    private lateinit var binding: ActivityPatientBinding
    private lateinit var database: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPatientBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.save.setOnClickListener {

            val hospital  = binding.name.text.toString()
            val contactNo = binding.age.text.toString()
            val address = binding.addres.text.toString()
            val category = binding.issues.text.toString()
            val suggestions = binding.suggues.text.toString()

            if (hospital.isNotEmpty() && contactNo.isNotEmpty()&& address.isNotEmpty()&& category.isNotEmpty()&& suggestions.isNotEmpty()) {

                database = FirebaseDatabase.getInstance().getReference("Users")
                val User = User(address, contactNo, category,hospital)
                database.child(hospital).setValue(User).addOnSuccessListener {

                    binding.name.text.clear()
                    binding.age.text.clear()
                    binding.addres.text.clear()
                    binding.issues.text.clear()
                    binding.suggues.text.clear()


                    Toast.makeText(this, "Successfully Saved", Toast.LENGTH_SHORT).show()
                    if(1==1){

                        val gotobutton = findViewById<Button>(R.id.save)
                        gotobutton.setOnClickListener{

                            val intent1 = Intent(this, ActivityPdf::class.java)
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

    data class User(
        val agencyName: String? = null,
        val contactNo: String? = null,
        val userName: String? = null,
        val hospital: String
    )


}