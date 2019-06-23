package br.com.exemploedittext

import android.os.Build.VERSION_CODES.O
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.AppCompatEditText
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity :
    AppCompatActivity(),
    View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_entrar_id.setOnClickListener(this)


    }

    override fun onClick(v: View?) {
        Toast.makeText(this, "O e-mail ${et_email_id.text} está logado!", Toast.LENGTH_LONG).show()
    }
}
