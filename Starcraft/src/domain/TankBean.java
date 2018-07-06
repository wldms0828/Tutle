package domain;

public class TankBean extends GoundUnitBean{
	private String cannon;

	public String getCannon() {
		return cannon;
	}

	public void setCannon(String cannon) {
		this.cannon = cannon;
	}
	@Override
	public String toString() {
		return "탱크 [캐논=" + cannon + ", 이름=" + name + ", 타격점=" + hitpoint + ", 체력=" + hp + "]"+"\n";
	}

	
}
