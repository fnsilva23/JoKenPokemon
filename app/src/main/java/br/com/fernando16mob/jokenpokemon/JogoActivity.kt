package br.com.fernando16mob.jokenpokemon

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.fernando16mob.jokenpokemon.model.Pokemon
import kotlinx.android.synthetic.main.activity_jogo.*

class JogoActivity : AppCompatActivity() {

    var  pontuacao: Int =    0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jogo)

        ivAgua.setOnClickListener{
            //var pokemonPlayer1: Pokemon = Pokemon.AGUA
            //var cpu: Pokemon =

            //comparar(Pokemon.AGUA)
        }

        ivFogo.setOnClickListener{
            //comparar(Pokemon.FOGO)
        }

        ivPlanta.setOnClickListener{
           //comparar(Pokemon.PLANTA)
        }

    }

    fun selecionarPokemon(pokemon: Pokemon){
        //ivJogador1.setImageDrawable(R.drawable.op_bulbassaur)
    }


    fun comparar (player1: Pokemon, cpu: Pokemon){


        /*
        • Água ganha de Fogo
        • Fogo ganha de Grama
        • Grama ganha de Água*/
    }

    fun ganhou () {
        pontuacao = pontuacao +2
    }

    fun empatar (){
        pontuacao = pontuacao +1
    }

    fun goToFim(){
        val intent = Intent(this, FimDeJogoActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        startActivity(intent)
        finish()
    }

}
