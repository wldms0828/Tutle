package domain;

public class AudioBean extends ProductBean {
	public AudioBean(){
		setPrice(10);
		setName("오디오");
	}
	@Override
	public String toString() {
		return "AudioBean [price=" + price + ", bonusPoint=" + bonusPoint + "]";
	}

}
