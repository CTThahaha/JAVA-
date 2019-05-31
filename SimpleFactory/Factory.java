
public class Factory {
	public static Fruit getFruit(String fruit) {
		if(fruit.equalsIgnoreCase("apple"))
		{
			return new Apple();
		}
		else if(fruit.equalsIgnoreCase("banana"))
		{
			return new Banana();
		}
		else {
			System.out.println("�Ҳ�������");
			return null;
		}
	}
}
