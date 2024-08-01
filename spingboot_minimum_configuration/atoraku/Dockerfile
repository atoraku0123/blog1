# JDKはamazoncorrettoを使用
FROM amazoncorretto:22-jdk as corretto22

WORKDIR /app

# コンテナ内で ./gradlew コマンドを実行するために必要
RUN yum install -y findutils tar


FROM mysql:8.0.39-debian as mysql

RUN apt-get update && apt-get install -y locales \
  && sed -i -e 's/# \(ja_JP.UTF-8\)/\1/' /etc/locale.gen \
  && locale-gen \
  && update-locale LANG=ja_JP.UTF-8

ENV LC_ALL ja_JP.UTF-8
ENV TZ Asia/Tokyo
ENV LANG=ja_JP.UTF-8
