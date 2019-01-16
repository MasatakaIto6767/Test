import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Template {
    public void template() {
        try {
            //ファイルのパスを指定
            File file = new File("/Users/itom817/Task_FE/src/template.txt");
            //ファイルが存在しない場合は例外の発生
            if (!file.exists()) {
                System.out.println("ファイルが存在しません");
                return;
            }
            //BufferedReaderクラスのreadLineメソッドを使い１行ずつ読み込み表示する
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String data;

            while ((data = bufferedReader.readLine()) != null) {
                FileToString f = new FileToString();
                f.fileTest();
                System.out.println(data.replace("<名前>","伊藤 幹崇 ").replace("<明細>", "メモリ;5,000円,HDD;9,000円").replace("<合計>", "14,000"));
            }
            //ファイルを閉じてリソースを解放
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
