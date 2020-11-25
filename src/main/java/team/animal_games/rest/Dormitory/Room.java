package animal_games.rest.Dormitory;
import animal_games.rest.Dormitory.furniture.*;
/**
 * @description The room class
 * @version 1.0
 * @author dabao
 * @date 2020/11/24 23:37
 */
public class Room {
    private Desk desk;
    private Bed bed;
    private Chair chair;
    private int roomId;

    public Room(){
    }

    public Room(int i){
        roomId = i;
        FurnitureFactory furnitureFactory = FurnitureFactory.getInstance();
        bed = (Bed)furnitureFactory.getFurnitureByKind(FurnitureKind.Bed);
        chair = (Chair)furnitureFactory.getFurnitureByKind(FurnitureKind.Chair);
        desk = (Desk)furnitureFactory.getFurnitureByKind(FurnitureKind.Desk);
    }

    public void moveFurniture(FurnitureKind kind){
        switch (kind){
            case Bed:
                if(bed.isSharable()) {
                    int count = bed.getReferenceCount() - 1;
                    System.out.println(kind.toString() + " reference count - 1 = " + count);
                    bed.minusReferenceCount();
                    bed = new Bed();
                }
                bed.move();
                break;
            case Desk:
                if(desk.isSharable()) {
                    int count = desk.getReferenceCount() - 1;
                    System.out.println(kind.toString() + " reference count - 1 = " + count);
                    desk.minusReferenceCount();
                    desk = new Desk();
                }
                desk.move();
                break;
            case Chair:
                if(chair.isSharable()) {
                    int count = chair.getReferenceCount() - 1;
                    System.out.println(kind.toString() + " reference count - 1 = " + count);
                    chair.minusReferenceCount();
                    chair = new Chair();
                }
                chair.move();
                break;
        }
    }

    public Desk getDesk() {
        return desk;
    }

    public Bed getBed() {
        return bed;
    }

    public Chair getChair() {
        return chair;
    }

    public int getRoomId() {
        return roomId;
    }
}