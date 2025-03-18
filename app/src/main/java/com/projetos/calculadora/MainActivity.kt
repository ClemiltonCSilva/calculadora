package com.projetos.calculadora
//
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.projetos.calculadora.databinding.ActivityMainBinding
import org.mariuszgromada.math.mxparser.Expression

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val calculo = binding.calculo
        val resultado = binding.resultadocalculo
        binding.zero.setOnClickListener{ calculo.text = "${calculo.text}0"}
        binding.um.setOnClickListener { calculo.text = "${calculo.text}1" }
        binding.dois.setOnClickListener { calculo.text = "${calculo.text}2"}
        binding.tres.setOnClickListener{
            calculo.text = "${calculo.text}3"
        }
        binding.quatro.setOnClickListener{
            calculo.text = "${calculo.text}4"
        }
        binding.cinco.setOnClickListener{
            calculo.text = "${calculo.text}5"
        }
        binding.seis.setOnClickListener{
            calculo.text = "${calculo.text}6"
        }
        binding.sete.setOnClickListener{
            calculo.text = "${calculo.text}7"
        }
        binding.oito.setOnClickListener{
            calculo.text = "${calculo.text}8"
        }
        binding.nove.setOnClickListener{
            calculo.text = "${calculo.text}9"
        }
        binding.prtesq .setOnClickListener{
            calculo.text = "${calculo.text}("
        }
        binding.prtdir.setOnClickListener{
            calculo.text = "${calculo.text})"
        }
        binding.div.setOnClickListener{
            calculo.text = "${calculo.text}/"
        }
        binding.mais.setOnClickListener{
            calculo.text = "${calculo.text}+"
        }
        binding.menos.setOnClickListener{
            calculo.text = "${calculo.text}-"
        }
        binding.vezes.setOnClickListener{
            calculo.text = "${calculo.text}*"
        }
        binding.igual.setOnClickListener{
            val resultado = Expression(calculo.text.toString()).calculate()
            if (resultado.isNaN()){
                binding.resultadocalculo.text = "Expressão Inválida"
            }else{
                binding.resultadocalculo.text = resultado.toString()
            }

        }
        binding.excluir.setOnClickListener{
            calculo.text = calculo.text.dropLast(1)
        }

        binding.ce.setOnClickListener{
            calculo.text = ""
            resultado.text = ""
        }


        binding.ponto.setOnClickListener{
            calculo.text = "${calculo.text}."
        }

    }
}

