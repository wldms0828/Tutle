package domain;

public class TriangleBean extends PointBean{
	private String angle;

	public String getAngle() {
		return angle;
	}

	public void setAngle(String angle) {
		this.angle = angle;
	}

	@Override
	public String toString() {
		return "삼각형 [앵글=" + angle + ", 위치=" + spot + "]";
	}
}
