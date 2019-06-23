package br.com.exemploedittext

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_entrar_id.setOnClickListener {
            if (validarCampos()){
                Toast.makeText(this, "O e-mail ${et_email_id.text} está logado!", Toast.LENGTH_LONG).show()
            }
        }
    }

    fun validarCampos(): Boolean{

        var tudoOk = true

        if (et_email_id.text.toString().isEmpty()){
            et_email_id.setError("Campo Obrigatório!")
            tudoOk = false
        }

        if (et_senha_id.text.toString().isEmpty()){
            et_senha_id.setError("Campo Obrigatório!")
            tudoOk = false
        }

        return tudoOk
    }
}
