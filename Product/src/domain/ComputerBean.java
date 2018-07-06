package domain;

public class ComputerBean extends ProductBean {
	public ComputerBean(){
		setPrice(50);
	}
	@Override
	public String toString() {
		return "ComputerBean [price=" + price + ", bonusPoint=" + bonusPoint + "]";
	}

}
