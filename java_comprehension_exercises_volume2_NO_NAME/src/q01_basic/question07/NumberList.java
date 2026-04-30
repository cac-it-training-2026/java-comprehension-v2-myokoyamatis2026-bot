package q01_basic.question07;

import java.util.ArrayList;
import java.util.List;

/**
 * 整数リストを制御するクラス
 * 
 */
class NumberList {

	/**
	 * 整数のList
	 * 
	 */
	private List<Integer> numbers = new ArrayList<>();

	/**
	 * 1から引数までの整数をListに代入する
	 * 
	 * @param limit（Listの最終要素）
	 */
	public void addFromOneTo(Integer limit) {
		//TODO ここから実装する
		for (int i = 1; i <= limit; i++) {
			numbers.add(i);
		}

	}

	/**
	 * Listの各要素整数を合計する
	 * 
	 * @return Listの要素の合計値
	 */
	public Integer calcSumOfList() {
		Integer sum = 0;
		//TODO ここから実装する
		for (Integer num : numbers) {//numbersの中の要素を1つずつnumという変数に入れて回す
			sum += num;
		}
		return sum;
	}

	/**
	 * Listの各要素を2倍にする
	 * 
	 */
	public void doubleListEachValue() {
		//TODO ここから実装する
		for (int i = 0; i < numbers.size(); i++) {//長さをはかりそれまで繰り返して
			numbers.set(i, numbers.get(i) * 2);//要素数を取り出して二倍に上書きして戻す
		}
	}

	/**
	 * Listの要素の前半部分を削除する
	 * 要素数が奇数の場合、中央値は残す
	 */
	public void removeIndexOfFirstHalf() {
		int removeCount = numbers.size() / 2;
		//TODO ここから実装する
		for (int i = 0; i < removeCount; i++) {
			numbers.remove(0);
		}
	}

	/**
	 * @return numbers
	 */
	public List<Integer> getNumbers() {
		return numbers;
	}

	/**
	 * @param numbers セットする numbers
	 */
	public void setNumbers(List<Integer> numbers) {
		this.numbers = numbers;
	}

}
