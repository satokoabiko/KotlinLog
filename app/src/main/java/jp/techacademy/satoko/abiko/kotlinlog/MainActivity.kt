package jp.techacademy.satoko.abiko.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // レイアウトファイルを設定する
        setContentView(R.layout.activity_main)
        Log.d("kotlintest","ログへの出力テスト")

        // クラス
        var human = Human("山田花子",20,"ブランド" )      // 名前を山田花子、年齢を20でHumanのインスタンスを作る
        human.say()
        human.think()
      }
}