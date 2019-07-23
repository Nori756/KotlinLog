package  com.example.kotlinlog

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("～～", "～～")      // 「私の名前は〜〜です。年は〜〜歳です。」

        human.say()

        human.hobby()
    }
}
