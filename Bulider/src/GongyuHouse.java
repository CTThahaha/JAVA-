
public class GongyuHouse implements Builder {
	private House house=new House();
	@Override
	public void makefloor() {
		house.setFloor("��Ԣ�ذ�");
	}

	@Override
	public void makewall() {
		house.setWall("��Ԣǽ");
	}
	
	public House getHouse()
	{
		return house;
	}

}
