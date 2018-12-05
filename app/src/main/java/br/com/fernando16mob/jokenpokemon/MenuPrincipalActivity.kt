package br.com.fernando16mob.jokenpokemon

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu_principal.*

class MenuPrincipalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_principal)

        btJogar.setOnClickListener{
            startActivity(Intent(this, JogoActivity::class.java))
        }

        //btRanking.setOnClickListener { Intent(this, ) }

        btSobre.setOnClickListener{
            startActivity(Intent(this, SobreActivity::class.java))
        }


    }


}
