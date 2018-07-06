package domain;

public class BuyerBean {
	private int money,bonusPoint;
	public BuyerBean() {
		setMoney(200);
	} 
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	@Override
	public String toString() {
		return "BuyerBean [money=" + money + ", bonusPoint=" + bonusPoint + "]";
	}
	
}
