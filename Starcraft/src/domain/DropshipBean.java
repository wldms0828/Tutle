package domain;

public class DropshipBean extends AirUnitBean {
	private String space;

	
	public String getSpace() {
		return space;
	}

	public void setSpace(String space) {
		this.space = space;
	}
	@Override
	public String toString() {
		return "드랍십 [공간=" + space + ", 파일럿=" + pilot + ", 타격점=" + hitpoint + ", 체력=" + hp + "]"+"\n";
	}


}
