package domain;

public class MarineBean extends GoundUnitBean{
	private String gun;

	public String getGun() {
		return gun;
	}

	public void setGun(String gun) {
		this.gun = gun;
	}

	@Override
	public String toString() {
		return "마린 [gun=" + gun + ", name=" + name + ", hitpoint=" + hitpoint + ", hp=" + hp + "]"+"\n";
	}
}
