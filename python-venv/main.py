# python-dotenvをimportします。
from dotenv import load_dotenv
import os

# 同一ディレクトリに配置されている「.test.env」ファイルから環境変数を読み込みます。
load_dotenv(".test.env")

# 「.env」ファイルのtest envの値を読み込みます。
TEST_ENV: str = os.environ.get("TEST_ENV")
 
if TEST_ENV == "":
    # dotenvのimprotに失敗していればこちらが出力されます。
    print("TEST_ENV is empty")
else:
    # dotenvのimprotに成功し「.test.env」の環境変数が読み込めていればこちらが出力されます。
    print(TEST_ENV)
