package check01;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * 本問題では、コレクションフレームワークのList系クラスとMap系クラスの基本的な記述を学びましょう。
 * 現場で必ず使用するものなので、ポイントをしっかり押さえておきましょう。
 *
 * 問①〜問③まであります。
 * 問②に関しては、コメントを記述してください。
 *
 */
public class Main {

    public static final String SHOP_SHOHIN_00 = "バナナ";
    public static final String SHOP_SHOHIN_01 = "牛乳";
    public static final String SHOP_SHOHIN_02 = "豚肉";
    public static final String SHOP_SHOHIN_03 = "コロッケ";

    public static void main(String args[]) {

        // ① String型のList、"ShohinList"を宣言し、与えられた変数を全て使って要素を追加してください。
        List<String> shohinList = new ArrayList<>();
        shohinList.add(SHOP_SHOHIN_00);
        shohinList.add(SHOP_SHOHIN_01);
        shohinList.add(SHOP_SHOHIN_02);
        shohinList.add(SHOP_SHOHIN_03);

        // ② 以下の「shopMap.put(shohinList.get(1), 180);」の処理について、どのような処理をしているのか、コメントに記述してください。
        /*
         * shohinListの2番目の要素（"牛乳"）をキーとして、価格180を値として、shopMapにエントリを追加しています。
         */
        LinkedHashMap<String, Integer> shopMap = new LinkedHashMap<String, Integer>();
        shopMap.put(shohinList.get(0), 125); // "バナナ"をキーとして125を追加
        shopMap.put(shohinList.get(1), 180); // "牛乳"をキーとして180を追加
        shopMap.put(shohinList.get(2), 350); // "豚肉"をキーとして350を追加
        shopMap.put(shohinList.get(3), 100); // "コロッケ"をキーとして100を追加

        // ③ カリキュラムを参考に拡張for文を使って、問題の画像と同じ表示になるよう記述してください。
        // 「shohinList」と「shopMap」が保持する値を上手く利用しましょう。
        for (String shohin : shohinList) {
            System.out.println(shohin + ":" + shopMap.get(shohin) );
        }
    }
}
