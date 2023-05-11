package jp.techacademy.satoko.abiko.kotlinlog
import android.util.Log
// プロパティ

open class Human: Animal, Thinkable {
    var hobby: String
    // 引数付きコンストラクタ（親クラスから関数を呼び出す）
  //  constructor(name: String, age: Int, hobby: String): super(name, age) {
  //  }
    override fun say() {
        Log.d("kotlintest", "「私の名前は" +this.name + "です。歳は" + this.age + "です。" )
    }
    // 引数付きコンストラクタ（親クラス(animal)から関数を呼び出す）
    constructor(name: String, age: Int, hobby: String) : super(name, age) {
        this.hobby =  hobby
    }
    // Thinkableインターフェイスのメソッドをオーバーライド
    override fun think() {
        Log.d("kotlintest",  "「私は" + this.hobby  + "について考える。」")
    }

}