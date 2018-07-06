package domain;

public class TvBean extends ProductBean {
	public TvBean() {
		setPrice(100);
	}
	@Override
	public String toString() {
		return "TvBean [price=" + price + ", bonusPoint=" + bonusPoint + "]";
	}

}
