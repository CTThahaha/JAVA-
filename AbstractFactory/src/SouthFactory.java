
public class SouthFactory implements Factory {

	@Override
	public Fruit createApple() {
		System.out.println("�Ϸ�ƻ������");
		return new Apple();
	}

	@Override
	public Fruit createBanana() {
		System.out.println("�Ϸ��㽶����");
		return new Banana();
	}

}
