//����ʽ
public class Person {
	private String name;
	public static final Person person=new Person();//����Ϊ����
	private Person() {};//���캯��Ϊ˽�г�Ա�����ܵ��ã�ֻ��ͨ��getPerson���ʵ��
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