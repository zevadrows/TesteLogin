package testelogin.cursoandroid.com.testelogin

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tela_registro.*

class TelaRegistro : Activity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_registro)

        botaoCadastroId?.setOnClickListener {
            val loginRegistro = loginRegistroId.text.toString()
            val senhaRegistro = senhaRegistroId.text.toString()


            val confirmSenha = confirmSenhaId.text.toString()

            if (senhaRegistro == confirmSenha) {

                val intent = Intent()
                intent.putExtra("loginRegistro", loginRegistro)
                intent.putExtra("senhaRegistro", senhaRegistro)
                setResult(RESULT_OK,intent)
                finish()
            } else {

                erroRegistroId.text = "A senha que você digitou não bate com sua confirmação. Tente novamente."

            }
        }

    }
}
