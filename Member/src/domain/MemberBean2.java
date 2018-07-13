package domain;

public class MemberBean2 {
	private String id,pass,name,age,gender;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "멤버테스트 [아이디=" + id + ", 비밀번호=" + pass + ", 이름=" + name + ", 나이=" + age + ", 성별=" + gender
				+ "]\n";
	}
}