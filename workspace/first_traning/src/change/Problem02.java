package change;

import java.util.ArrayList;
import java.util.List;

import util.DateUtil;
import util.NumericUtil;

/**
 * ランダムで生成した数値を並び変える問題
 * @param args
 */
public class Problem02 {

    /**
     * ランダムで生成した数値を振り分ける問題
     * @param args
     */
    public static void main(String[] args) {

        /*
         * ランダムに生成した数値のリストについて
         * バブルソートを使用して並び替えを実施したい。
         * 途中まで実装してあるため、残りを実装せよ
         */

        // テスト用のランダムデータを作成
        List<Integer> testList = NumericUtil.makeRandomList(1000, 1000);

        /* -- ここから問題 -- */
        // バブルソートを使用して昇順ソート(テストデータは使いまわすため、コピーして使用)
        bubbleSortAsc(new ArrayList<Integer>(testList));

        // バブルソートを使用して降順ソート(テストデータは使いまわすため、コピーして使用)
        bubbleSortDesc(new ArrayList<Integer>(testList));

        // 他にどのようなソートアルゴリズムがあるか調べ、作成せよ

    }

    /**
     * 引数で受け取ったリストをバブルソートで昇順に並び替えたものを出力する。
     * @param testList 並び替え対象リスト
     * @return 並び替えたリスト
     */
    public static void bubbleSortAsc(List<Integer> testList) {

        // 処理時間測定用に開始時間を取得
        long startTime = System.currentTimeMillis();

        // 値を入れ替えるための一時変数
        int tmpData;
        for (int i = 0; i < testList.size() -1; i++) {
            for (int j = testList.size() -1; i < j; j-- ) {

                /*-- 問題 ここのif文内の「true」を変更して実装せよ--*/
                if (true) {
                    tmpData = testList.get(i);
                    testList.set(i, testList.get(j));
                    testList.set(j, tmpData);
                }
            }
        }

        testList.stream()
        .forEach(System.out::println);

        // 処理時間測定用に終了時間を取得
        long endTime = System.currentTimeMillis();

        // 処理時間を出力
        System.out.println("処理時間:" + DateUtil.getProcTime(startTime, endTime));

    }

    public static void bubbleSortDesc(List<Integer> testList) {};
}
