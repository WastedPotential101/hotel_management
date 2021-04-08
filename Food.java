public class Food extends RoomService
{
    Food(int foodOption)
    {
        switch(foodOption)
        {
            case 1:
            {
                System.out.println("The menu for option 1 is:\n 1.Maple syrup\n 2.Berries\n 3.Waffles(2 whole pieces)\n 4.Chocolate syrup\n");
                System.out.println("The price for this menu is 150$");
                break;
            }
            case 2:
            {
               System.out.println("The menu for option 2 is:\n 1.Paneer Butter Masala\n 2.Roti(2 rotis)\n 3.Papad\n 4.Dal Tadka\n 5.Jeera Rice\n 6.Mixed Pickle\n 7.Salad\n");
               System.out.println("The price for this menu is 200$");
               break;
            }
            case 3:
            {
               System.out.println("The menu for option  is:\n 1.Tea/Coffee\n 2.Bread Jam/Bread Butter\n 3.Fruits(only seasonal fruits available)\n");
               System.out.println("The price for this menu is 250$");
               break;
            }
            case 4:
            {
               System.out.println("The menu for option 4 is:\n 1.Shahi Paneer\n 2.Roti(2 rotis)\n 3.Papad\n 4.Dal Makani\n 5.Rice\n 6.Mixed Pickle\n 7.Salad\n 8.Soup(only in winters");
               System.out.println("The price for this menu is 300$");
               break;
            }
            default:
            {
            System.out.println("The option you entered is wrong, Please enter the option from 1 to 4.\nThank you");
            }
        }
    }
}

