package  com.example.kotlinlog

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tarou = Human("太郎", 5, "スポーツ")      // 「私の名前は〜〜です。年は〜〜歳です。」

        tarou.say()

        tarou.think()
        var jirou = Human("次郎", 8, "音楽")

        jirou.say()

        jirou.think()
    }
}
