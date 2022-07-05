package kt.guide.qiita

// 同じ処理をKotlinで書けるかどうか
fun notNull(): String {
    val s = "nonNull"

    // 以下に文字数を連結して返す処理

    
}

// NullPointerExceptionが発生するような状況の場合、nullを返すようにしてみる。
// ついでに...
// 「?.」を使ってみる
// 「?:」を使って、null以外を返すようにしてみる
fun nullable(): String {
    val s = null

    // 以下に文字数を連結して返す処理


}