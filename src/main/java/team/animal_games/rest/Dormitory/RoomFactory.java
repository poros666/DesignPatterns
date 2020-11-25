package animal_games.rest.Dormitory;
/**
 * @description The room factory class
 * @version 1.0
 * @author dabao
 * @date 2020/11/24 23:37
 */
public class RoomFactory {
    public Room createRoom(int i){
        System.out.println("\nRoom of number " + i + " created");
        return new Room(i);
    }
}