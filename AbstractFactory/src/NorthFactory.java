
public class NorthFactory implements Factory {

	@Override
	public Fruit createApple() {
		System.out.println("����ƻ������");
		return new Apple();
	}

	@Override
	public Fruit createBanana() {
		System.out.println("�����㽶����");
		return new Banana();
	}

}
