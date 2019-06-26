package br.com.exemploedittext

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_cadastro.*
import kotlinx.android.synthetic.main.activity_main.*

class CadastroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        bt_cadastrar_id.setOnClickListener {
            if (validarCampos()){
                chamarAlertDialog()
            }
        }
    }

    fun validarCampos(): Boolean{

        var tudoOk = true

        if (et_nome_id.text.toString().isEmpty()){
            et_nome_id.setError("Campo Obrigatório!")
            tudoOk = false
        }

        if (et_cad_email_id.text.toString().isEmpty()){
            et_cad_email_id.setError("Campo Obrigatório!")
            tudoOk = false
        }

        if (et_dt_nasci_id.text.toString().isEmpty()){
            et_dt_nasci_id.setError("Campo Obrigatório!")
            tudoOk = false
        }

        if (et_cel_id.text.toString().isEmpty()){
            et_cel_id.setError("Campo Obrigatório!")
            tudoOk = false
        }

        if (et_cad_senha_id.text.toString().isEmpty()){
            et_cad_senha_id.setError("Campo Obrigatório!")
            tudoOk = false
        }

        if (et_cad_conf_senha_id.text.toString().isEmpty()){
            et_cad_conf_senha_id.setError("Campo Obrigatório!")
            tudoOk = false
        }

        return tudoOk
    }

    fun chamarAlertDialog(){
        var alertDialog = AlertDialog.Builder(this)
        alertDialog.setTitle("Atenção")
        alertDialog.setMessage("Deseja salvar os dados?")

        alertDialog.setPositiveButton("Sim", { _, _ ->

            //Aqui sera executado a instrução a sua escolha
            Toast.makeText(this, "Cadastro salvo com sucesso!", Toast.LENGTH_LONG).show()

        })

        alertDialog.setNegativeButton("Não", { _, _ ->
            //Aqui sera executado a instrução a sua escolha
            Toast.makeText(this, "Usuário cancelou a operação!", Toast.LENGTH_LONG).show()

        })
        alertDialog.show()
    }
}
