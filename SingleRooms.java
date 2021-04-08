public class SingleRooms extends Rooms
{
	void increase(int d)
	{
		if(d%2==0)
		{
			numberOfSingleRooms=numberOfSingleRooms+d;
			numberOfDoubleRooms=numberOfDoubleRooms-(d/2);
		}
		else
		{
			numberOfSingleRooms=numberOfSingleRooms+d;
			numberOfDoubleRooms=numberOfDoubleRooms-((d-1)/2);
		}
		System.out.println("You have "+numberOfDoubleRooms+" double rooms and "+numberOfSingleRooms+" single rooms");
	}
	void decrease(int c)
	{
		if(c%2==0)
		{
			numberOfSingleRooms=numberOfSingleRooms-c;
			numberOfDoubleRooms=numberOfDoubleRooms+(c/2);
		}
		else
		{
			numberOfSingleRooms=numberOfSingleRooms-c;
			numberOfDoubleRooms=numberOfDoubleRooms+((c+1)/2);
		}
		System.out.println("You have "+numberOfDoubleRooms+" double rooms and "+numberOfSingleRooms+" single rooms");
	}
}

	if(numberOfDoubleRooms>0)
	{
		numberOfDoubleRooms=numberOfDoubleRooms+(2*c);
	}








