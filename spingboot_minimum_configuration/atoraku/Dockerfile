# JDKはamazoncorrettoを使用
FROM amazoncorretto:22-jdk as local

WORKDIR /app

# コンテナ内で ./gradlew コマンドを実行するために必要
RUN yum install -y findutils


FROM amazoncorretto:22-jdk as release

# 環境変数を受け取る
ARG env

# テスト実行

# gradle ビルド

# JARファイルをコンテナにコピー

# コンテナのビルド
