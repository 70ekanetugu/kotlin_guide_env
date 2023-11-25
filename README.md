# Kotlin入門用

# 環境構築
GitPod使います。手順は以下の通りです。  

1. Chrome拡張機能で「GitPod」入れる
2. 当該リポジトリで「GitPod」をクリック
3. コンテナ立ち上がるまで待つ
    - ブラウザ上でVSCodeが立ち上がればOK
4. ブラウザVSCodeのターミナルで `sdk current` を実行し、インストール状況を確認(以下があればOK)
    - gradle : 7.4
    -  java  : 11
    - kotlin : 1.7.0
5. `.gradlew run` でコード実行できることを確認

# Gradle
```shell
# main実行
./gradlew run

# テスト実行(-iで詳細出力, --testsで実行対象を絞り込み)
./gradlew test [-i] [--tests "package.className[.methodName]]
```

# 参考資料
- [Get started with Kotlin](https://kotlinlang.org/docs/getting-started.html)
- [Kotlin Standard Library](https://kotlinlang.org/api/latest/jvm/stdlib/)
- [Qiita: JavaプログラマのためのKotlin入門](https://qiita.com/koher/items/bcc58c01c6ff2ece658f)
