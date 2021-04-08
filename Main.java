import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		int numberOfPeople,changeInRooms,choice,option,numberOfLuxuryDoubleRooms,number;
		Scanner sc=new Scanner(System.in);
		System.out.println("WELCOME TO HOTEL TRANSLYVANIA!\n");
		System.out.println("How many people would you like rooms for?\n");
		numberOfPeople=sc.nextInt();
		Rooms obj=new Rooms();
		obj.totalRooms(numberOfPeople);
		SingleRooms obj3=new SingleRooms();
		DoubleRooms obj4=new DoubleRooms();
		System.out.println("Would you like to make any changes to the number of rooms?\n1. Yes\n2. No\n");
		choice=sc.nextInt();
		switch(choice)
		{
			case 1:
			{
				System.out.println("Would you like to make a change in the number of\n1. Single Rooms\n2. Double Rooms\n");
				int preference=sc.nextInt();
				switch(preference)
				{
					case 1:
					{
						System.out.println("What would you like to do to the number of Single Rooms?\n1. Increase\n2. Decrease\n");
						int decision=sc.nextInt();
						switch(decision)
						{
							case 1:
							{
								System.out.println("By how much would you like to increase the no of Single Rooms?\n");
								System.out.println("PLEASE DO NOT ENTER A NUMBER GREATER THAN THE NUMBER OF PEOPLE\n");
								changeInRooms=sc.nextInt();
								obj3.increase(changeInRooms);
								break;
							}
							case 2:
							{
								if(obj.numberOfSingleRooms>0)
								{
									System.out.println("By how much would you like to decrease the no of Single Rooms?\n");
									System.out.println("PLEASE DO NOT ENTER A NUMBER GREATER THAN THE NUMBER OF PEOPLE\n");
									changeInRooms=sc.nextInt();
									obj3.decrease(changeInRooms);
								}
								else
								{
									System.out.println("The number of Single Rooms is already zero and hence cannot be decreased further\n");
								}
								break;
							}
							default:
							{
								System.out.println("Please enter a valid response\n");
								break;
							}
							break;
					}
					case 2:
					{
						System.out.println("What would you like to do to the number of double rooms?\n1. Increase\n2. Decrease\n");
						int decision=sc.nextInt();
						switch(decision)
						{
							case 1:
							{
								System.out.println("By how much would you like to increase the no of double rooms?\n");
								System.out.println("PLEAE DO NOT ENTER A NUMBER GREATER THAN THE NUMBER OF PEOPLE\n");
								changeInRooms=sc.nextInt();
								obj4.increase(changeInRooms);
								break;
							}
							case 2:
							{
								if(obj.numberOfDoubleRooms>0)
								{
									System.out.println("By how much would you like to increase the no of double rooms?\n");
									System.out.println("PLEAE DO NOT ENTER A NUMBER GREATER THAN THE NUMBER OF PEOPLE\n");
									changeInRooms=sc.nextInt();
									obj4.decrease(changeInRooms);
								}
								else
								{
									System.out.println("The number of Double Rooms is already zero and hence cannot be decreased further\n");
								}
								break;
							}
							default:
							{
								System.out.println("Please enter a valid response\n");
								break;
							}
						}
							break;
					}
					default:
					{
						System.out.println("Please enter a valid response\n");
						break;
					}
					}
					break;
				}
			}
			case 2:
			{
				System.out.println("Lets Proceeedddd");
				break;
			}
			default:
			{
				System.out.println("Please enter a valid response\n");
			}
		}
		System.out.println("Please provide the following information to continue\n");
		//call class for customer information
		System.out.println("Which room service would you like to choose\n1. Premium(200$)\n2. VIP(150$)\n3. Laundry(100$)\n4. Food(*)\n");
		System.out.println("*THE OPTION FOOD CONSISTS OF A MENU FOR YOU TO CHOOSE FROM\n");
		choice=sc.nextInt();
		RoomService obj1=new RoomService();
		switch(choice)
		{
			case 1:
			{
				obj1.premium();
				break;
			}
			case 2:
			{
				obj1.VIP();
				break;
			}
			case 3:
			{
				obj1.regular();
				break;
			}
			case 4:
			{
				System.out.println("Which menu would you like to select\n1. Breakfast(150$)\n2.Lunch(200$)\n3. Brunch(250$)\n4.Dinner(300$)\n");
				option=sc.nextInt();
				Food obj2=new Food(option);
				break;
			}
			default:
			{
				System.out.println("Please enter a valid response\n");
				break;
			}
		}
	}
}
