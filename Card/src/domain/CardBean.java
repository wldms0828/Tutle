package domain;

public class CardBean {
	public String kind;
	public int number;
	public static int width = 100;
	public static int height = 250;
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getNumber() {
		
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public static int getWidth() {
		return width;
	}
	public static void setWidth(int width) {
		CardBean.width = width;
	}
	public static int getHeight() {
		return height;
	}
	public static void setHeight(int height) {
		CardBean.height = height;
	}
	@Override
	public String toString() {
		return "CardBean [kind=" + kind + ", number=" + number + "]";
	}
}
