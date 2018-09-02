package interactionWithUser;

import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.JOptionPane;

public class PotatoesAndBananas {

	public static void main(String[] args) {
		String article = "bananas";
		BigDecimal bananasCost = Shopping(article);
		article = "potatoes";
		BigDecimal potatoesCost = Shopping(article);
		
		JOptionPane.showMessageDialog(null, "You have to pay " + bananasCost + " for bananas and " + potatoesCost + " for potatoes.");
		int comparing = potatoesCost.compareTo(bananasCost);
		
		if (comparing == 0){
			JOptionPane.showMessageDialog(null,"Price of both articles is equal.");
		} else if (comparing ==1) {
			JOptionPane.showMessageDialog(null, "Potatoes cost more");
		} else {
			JOptionPane.showMessageDialog(null, "Bananas cost more");
		}
		
		

	}
	static BigDecimal Shopping(String articleTxt){
		String articlePriceTxt = JOptionPane.showInputDialog("Hom much for " + articleTxt);
		BigDecimal articlePrice = new BigDecimal(articlePriceTxt);
		String articleAmoutTxt = JOptionPane.showInputDialog("Amout of " + articleTxt);
		BigDecimal articleAmout = new BigDecimal(articleAmoutTxt);
		BigDecimal articleCost = articleAmout.multiply(articlePrice).setScale(2, RoundingMode.HALF_UP);
		return articleCost;
	}

}
