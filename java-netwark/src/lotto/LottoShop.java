package lotto;
/**
 * @file_name : SBS.java
 * @author 	  : apfl1@naver.com
 * @date 	  : 2015. 10. 7.
 * @Story	  : 로또 추첨(스윙)
 */
public class LottoShop {
	public static void main(String[] args) {
		System.out.println("행운의 로또");
		Lotto lotto = new Lotto();
		lotto.inputMoney(5000);
		lotto.extractNum();
		lotto.printLotto();
		System.out.println(lotto.printLotto());
	}
}
