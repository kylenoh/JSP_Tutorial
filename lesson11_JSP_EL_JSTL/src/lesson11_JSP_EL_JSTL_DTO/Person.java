package lesson11_JSP_EL_JSTL_DTO;

public class Person {
//	멤버 변수
	private String name;
	private double height;
	private double weight;
	private double bmi;
	private String result;
	
//	기본 생성자
	public Person() {
		// TODO Auto-generated constructor stub
	}

//	커스텀 생성자
	public Person(String name, double height, double weight, double bmi, String result) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.bmi = bmi;
		this.result = result;
	}

//	Getter & Setter 생성
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getBmi() {
		return bmi;
	}

	public void setBmi(double bmi) {
		this.bmi = bmi;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
	
}
