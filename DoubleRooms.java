public class DoubleRooms extends Rooms
{
		void increase(int c)
		{
			if(c<=numberOfSingleRooms)
			{
				numberOfDoubleRooms=numberOfDoubleRooms+c;
				numberOfSingleRooms=numberOfSingleRooms-(2*c);
			}
			else
			{
				System.out.println("The number you entered is greater than the number of Single Rooms and hence your request was denied");
			}
			System.out.println("You have "+numberOfDoubleRooms+" double rooms and "+numberOfSingleRooms+" single rooms");
		}
		void decrease(int d)
		{
			numberOfDoubleRooms=numberOfDoubleRooms-d;
			numberOfSingleRooms=numberOfSingleRooms+(2*d);
			System.out.println("You have "+numberOfDoubleRooms+" double rooms and "+numberOfSingleRooms+" single rooms");
		}
}
