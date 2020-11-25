package animal_games.rest.Memento;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;


/**
 * @description BookingRecords:create the request of room booking
 * @version 1.0
 * @author dabao
 * @date 2020/11/24 23:27
 */
public class BookingRecords {
    // record the booking information like dormitory_type time LiveOrLeave dormitory_style(poor or luxurious) and other parameters
    static enum LiveOrLeave{LIVE,LEAVE}
    String animal_type;
    Date date;
    String dormitory_type;
    LiveOrLeave liveorleave;
    String dormitory_style;
    String DormitoryType;
    String StyleType;
    HashMap<String , List<HashMap<String,String >>> roomInfo = new HashMap<>();
    public  LiveOrLeave getLiveOrLeave(){return liveorleave;}
    public  HashMap<String , List<HashMap<String,String >>>getDormitoryInfo()
    {return this.roomInfo;}

    public BookingRecords(String DormitoryType, LiveOrLeave liveOrLeave, String StyleType, HashMap<String , List<HashMap<String,String >>> roomInfo){
        this.date = new Date();
        this.DormitoryType=animal_type;
        this.liveorleave=liveOrLeave;
        this.dormitory_style = StyleType;
        this.dormitory_type = DormitoryType;
        this.roomInfo = roomInfo;
        //this.money = money;
        // this.productInfo = productInfo;
    }
    public void printRecordsInfo(){
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("yyyy-MM-dd HH:mm:ss a");
        System.out.println("Date："+sdf.format(this.date));
        //System.out.println("Animal_bookingroom："+this.animal_type);
        System.out.println("Dormitory Style："+this.dormitory_style);
        System.out.println("Dormitory type："+this.dormitory_type);
        //System.out.println("Transaction_amount："+this.transactionAmount);
        System.out.println("LiveOrLeave："+this.liveorleave.toString());
        //System.out.println("Balance："+this.money);
    }
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    public String getAnimal_type() {
        return animal_type;
    }

    public void setAnimal_type(String animal_type) {
        this.animal_type = animal_type;
    }
    public void setDormitory_type(String dormitory_type) {
        this.dormitory_type = dormitory_type;
    }
    public void setDormitory_style(String dormitory_style) {
        this.dormitory_style = dormitory_style;
    }
    public void setLiveOrLeave(LiveOrLeave liveorleave) {
        this.liveorleave = liveorleave;
    }
    public void setRoomInfo(HashMap<String, List<HashMap<String, String>>> roomInfo) {
        this.roomInfo = roomInfo;
    }
    @Override
    public String toString() {
        return "class BookingRecords";
    }
}
