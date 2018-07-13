package domain;

public class ComputerBean extends ProductBean {
	public ComputerBean(){
		setPrice(50);
		setName("컴퓨터");
	}
	@Override
	public String toString() {
		return "ComputerBean [price=" + price + ", bonusPoint=" + bonusPoint + "]";
	}

}
