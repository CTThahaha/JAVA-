
public class PingfangBulider implements Builder {
	private House house=new House();
	@Override
	public void makefloor() {
		house.setFloor("ƽ���ذ�");
	}

	@Override
	public void makewall() {
		house.setWall("ƽ��ǽ");
	}
	
	public House getHouse()
	{
		return house;
	}

}
