# Kotlin入門用

# 環境構築
GitPod使ってください。手順は以下の通りです。  

1. Chrome拡張機能で「GitPod」入れる
2. 当該リポジトリで「GitPod」をクリック
3. コンテナ立ち上がるまで待つ
    - ブラウザ上でVSCodeが立ち上がればOK
4. ブラウザVSCodeのターミナルで以下を確認
```shell
# 以下を実行
$ sdk current

# 以下がインストールされていればOK
# gradle: 7.4
# java  : 11
# kotlin: 1.7.0
```
5. `.gradlew run` で実行できることを確認


# 参考資料
- [Kotlin Standard Library](https://kotlinlang.org/api/latest/jvm/stdlib/)
- [Qiita: JavaプログラマのためのKotlin入門](https://qiita.com/koher/items/bcc58c01c6ff2ece658f)