//饿汉式
public class Person {
	private String name;
	public static final Person person=new Person();//声明为常量
	private Person() {};//构造函数为私有成员，不能调用，只能通过getPerson获得实例
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public static Person getPerson() {
		return person;
	}
}
