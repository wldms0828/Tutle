package domain;

public class CircleBean extends PointBean{
	private String r ;

	public String getR() {
		return r;
	}

	public void setR(String r) {
		this.r = r;
	}

	@Override
	public String toString() {
		return "원 [반지름=" + r + ", 위치=" + spot + "]";
	}
}
