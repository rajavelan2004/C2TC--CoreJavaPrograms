package day3.encapsulation;

public class Oopsconceptdemo {
	private int serialNum;
	private String name;
	private int age;

	public int getSerialNum() {
		return serialNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}

	@Override
	public String toString() {
		return "OopsConceptDemo [serialNum=" + serialNum + ", name=" + name + ", age=" + age + "]";
	}
	


}
