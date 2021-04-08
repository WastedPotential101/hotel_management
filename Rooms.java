public class Rooms
{
	public int numberOfDoubleRooms,numberOfSingleRooms,totalRooms;
	void totalRooms(int n)
	{
		if(n%2==0)
		{
			numberOfDoubleRooms=n/2;
			System.out.println("You have been assigned "+numberOfDoubleRooms+" Double Rooms");
		}
		else
		{
			numberOfSingleRooms=1;
			numberOfDoubleRooms=(n-1)/2;
			System.out.println("You have been assigned "+numberOfDoubleRooms+" Double Rooms and 1 Single Room");
		}
	}
}
