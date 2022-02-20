# メモ

## 参考

* ECS
  * <https://github.com/awslabs/aws-cloudformation-templates/tree/master/aws/services/ECS>
* CodePipeline
  * <https://docs.aws.amazon.com/code-samples/latest/catalog/code-catalog-cloudformation-codepipeline.html>

## 履歴から消したものが入ってしまったら

* <https://docs.github.com/ja/authentication/keeping-your-account-and-data-secure/removing-sensitive-data-from-a-repository>
* <https://rtyley.github.io/bfg-repo-cleaner/>

  * BFGでやる

  * mirrorでclone
    * git clone --mirror git@github.com:akahane-yasuhiko/web-api-sandbox.git 08_web-api-sandbox_mirror

  * 消す
    * java -jar bfg-1.14.0.jar  --delete-files ファイル名
    * すると↓のコマンドが表示されるので実行。
    * git reflog expire --expire=now --all && git gc --prune=now --aggressive

  * pushする
    * 最後にgit push
    * forceつけなくても行けた
