package animal_games.test.DesignPatternTest;
import java.util.Scanner;
import  animal_games.rest.Memento.Manager;
import animal_games.rest.Memento.BookingRecords;
import animal_games.rest.Memento.ManageRecords;
import animal_games.rest.Dormitory.Dormitory;
import animal_games.rest.Dormitory.LuxuriousStyle;
import animal_games.rest.Dormitory.CommonStyle;
import animal_games.rest.Dormitory.LuxuriousRoomList;
import animal_games.rest.Dormitory.CommonRoomList;
public class MementoTest {
    public Manager manager = new Manager();
    public ManageRecords manageRecords = new ManageRecords();
    private Object NullPointerException;


    public static void main(String[] args) {
        System.out.println("—————————————-------------------------------------———— Test[Memento]Pattern —————————————-------------------------------------————");
        System.out.println("Traders : buyProduct() : Trader buys products and creates an order as a memento");
        System.out.println("Traders : sellProduct() : Trader buys products and creates an order as a memento");
        System.out.println("Traders : restoreRecords() : Restores to the specified history state");
        System.out.println("ManageRecords : addRecords() : Add memento to linked lists for administration.");
        System.out.println("");

        MementoTest mementoTest = new MementoTest();
        //mementoTest.traders.setFarmOwner(FarmOwner.getInstance());
        System.out.println("------------------------Command List-----------------------");
        System.out.println("**              1 --- Buy the product                    **");
        System.out.println("**              2 --- Buy the product                    **");
        System.out.println("**              3 --- View order list                    **");
        System.out.println("**              4 --- View product information           **");
        System.out.println("**              5 --- A key mature                       **");
        System.out.println("**              6 --- Restore historical state           **");
        System.out.println("**              7 --- Exit test                          **");
        System.out.println("-----------------------------------------------------------");
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Please enter command：");
            int command = 0;
            try {
                command = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException nfe) {
                System.out.println("The command does 233 not exist. Please retype it！\n");
                continue;
            }
            switch (command){
                case 1:{
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("Dormitory:[AIR,AQUATIC,LAND]");
                    System.out.print("Please enter the dormitoryType of the dormitory you want to book：");
                    String dormitoryType = sc1.nextLine();
                    dormitoryType=dormitoryType.toUpperCase();
                    if(!(dormitoryType.equals("AIR")||dormitoryType.equals("AQUATIC")||dormitoryType.equals("LAND")))
                    {System.out.println("The  dormitoryType does not exist!");break;}
                    System.out.print("Please enter the Style：");
                    String style = sc1.nextLine();
                    if(!(style.equals("Common")||dormitoryType.equals("Luxurious")))
                    {System.out.println("The Style does not exist!");break;}
                    mementoTest.live(dormitoryType,style);
                }
                case 2:{
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("Dormitory:[AIR,AQUATIC,LAND]");
                    System.out.print("Please enter the dormitoryType of the dormitory you want to cancel：");
                    String dormitoryType = sc1.nextLine();
                    dormitoryType=dormitoryType.toUpperCase();
                    if(!(dormitoryType.equals("AIR")||dormitoryType.equals("AQUATIC")||dormitoryType.equals("LAND")))
                    {System.out.println("The  dormitoryType does not exist!");break;}
                    System.out.print("Please enter the Style：");
                    String style = sc1.nextLine();
                    if(!(style.equals("Common")||dormitoryType.equals("Luxurious")))
                    {System.out.println("The Style does not exist!");break;}
                    mementoTest.leave(dormitoryType,style);
                    break;
                }
                case 3:{
                    mementoTest.viewBookingRecords();
                    break;
                }
               /* case 4:{
                    mementoTest.viewProductInfo();
                    break;
                }
                case 5:{
                    mementoTest.grow();
                    System.out.println("All living things are now mature！\n");
                    break;
                }*/
                case 6:{
                    Scanner sc1 = new Scanner(System.in);
                    mementoTest.viewBookingRecords();
                    System.out.print("Please enter the ORDER_ID you want to restore：");
                    int number = sc1.nextInt();
                    mementoTest.restoreHistoryState(number);
                    System.out.println("Restore success！\n");
                    break;
                }
                case 7:{
                    System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");
                    return;
                }
                default:{
                    System.out.println("The command does not exist. Please retype it！\n");
                }
            }
        }
    }
    public  void viewBookingRecords(){
        manageRecords.printRecords();
    }

    public void live(String dormitoryType, String style){
        BookingRecords bookingRecords = manager.bookRoom(dormitoryType,style);
        if (bookingRecords !=NullPointerException) {
            System.out.println("Dormitory: " + dormitoryType + "  Style：" + style);
            manageRecords.addRecords(bookingRecords);
            System.out.println("Order created successfully！");
            bookingRecords.printRecordsInfo();
            System.out.println("");
        }
    }

    public void leave(String dormitoryType, String style){
        BookingRecords bookingRecords = manager.cancelRoom(dormitoryType,style);
        if (bookingRecords !=NullPointerException) {
            System.out.println("Dormitory: " + dormitoryType + "  Style：" + style);
            manageRecords.addRecords(bookingRecords);
            System.out.println("Order canceled successfully！");
            bookingRecords.printRecordsInfo();
            System.out.println("");
        }
    }
    public  void  restoreHistoryState(int number){
        manager.restoreRecords(manageRecords, number);
    }
}
