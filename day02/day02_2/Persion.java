package day02_2;

//【作业二】
//考察知识点：构造函数,方法重载
//
//要求：
//编写Java程序用于显示人的姓名和年龄。 
//1）定义一个Person类，该类中应该有两个私有属性，姓名(name)和年龄(age)，以及性别(gender)。
//2）定义不同参数列表的构造方法并初始化，控制台打印输出。
//4)编写测试类Main,在main方法中根据不同重载的构造方法，分别创建Person类的实例
public class Persion {
	private String nameString;
	private int age;
	private String genderString;
	
	public  Persion(int age) {
		this.age = age;
		System.out.println(age);
	}
	
	public Persion(String nameString) {
		System.out.println(nameString);;
	}
	
	public Persion() {
		super();
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGenderString() {
		return genderString;
	}

	public void setGenderString(String genderString) {
		this.genderString = genderString;
	} 
		
	
}