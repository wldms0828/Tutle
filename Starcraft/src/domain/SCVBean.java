package domain;

public class SCVBean extends GoundUnitBean{
	private String mineral;

	
	public String getMineral() {
		return mineral;
	}

	public void setMineral(String mineral) {
		this.mineral = mineral;
	}

	@Override
	public String toString() {
		return "SCV [미네랄=" + mineral + ", 이름=" + name + ", 타격점=" + hitpoint + ", 체력=" + hp + "]"+"\n";
	}

}
