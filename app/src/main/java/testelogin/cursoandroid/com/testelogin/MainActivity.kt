package testelogin.cursoandroid.com.testelogin

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : Activity() {

    private var login: String? = null
    private var senha: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botaoLogarId.setOnClickListener {
            val mainLogin = loginId.text.toString()
            val mainSenha = senhaId.text.toString()



            if (mainLogin == login && mainSenha == senha) {

                startActivity(Intent(this, SegundaTela::class.java))

            } else {
                textoErroId.visibility = View.VISIBLE
            }
        }

        botaoRegistroId.setOnClickListener { startActivityForResult(Intent(this@MainActivity, TelaRegistro::class.java), 10) }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        login = data?.extras?.getString("loginRegistro")
        senha = data?.extras?.getString("senhaRegistro")

    }
}
