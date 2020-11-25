package animal_games.rest.Memento;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

/**
 * @description ManageRecords:create the list of booking records
 * @version 1.0
 * @author dabao
 * @date 2020/11/24 23:28
 */
public class ManageRecords {

    //A linked list that stores booking records
    List<BookingRecords> bookingRecordsList=new ArrayList<>();

    public void addRecords (BookingRecords bookingRecords){
        bookingRecordsList.add(bookingRecords);
    }

    public  void  printRecords(){
        int i=0;
        for (BookingRecords bookingRecords: bookingRecordsList){
            System.out.println("ORDER_ID："+i);
            i++;
            bookingRecords.printRecordsInfo();;
            System.out.println("");
        }
    }

    public  List<BookingRecords> getBookingRecords(){return bookingRecordsList;}

    public void setBookingRecords(List<BookingRecords> bookingRecords) {
        this.bookingRecordsList = bookingRecords;
    }

    @Override
    public String toString() {
        return "class ManageRecords";
    }
}

