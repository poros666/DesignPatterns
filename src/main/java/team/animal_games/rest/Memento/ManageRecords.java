package animal_games.rest.Memento;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

/**
 * @author dabao
 * @version 1.0
 * @description ManageRecords:create the list of booking records
 * @date 2020/11/24 23:28
 */
public class ManageRecords {

    //A linked list that stores booking records
    List<BookingRecords> bookingRecordsList = new ArrayList<>();
    /**
     * @methodName: addRecords
     * @description: use the bookingRecords to add bookingRecordsList
     * @param: [bookingRecords]
     * @return: void
     * @throws:
     */
    public void addRecords(BookingRecords bookingRecords) {
        bookingRecordsList.add(bookingRecords);
    }
    /**
     * @methodName: printRecords
     * @description: print records
     * @param: []
     * @return: void
     * @throws:
     */
    public void printRecords() {
        int i = 0;
        for (BookingRecords bookingRecords : bookingRecordsList) {
            System.out.println("ORDER_ID：" + i);
            i++;
            bookingRecords.printRecordsInfo();
            ;
            System.out.println("");
        }
    }
    /**
     * @methodName: getBookingRecords
     * @description: get booking records
     * @param: []
     * @return: java.util.List<animal_games.rest.Memento.BookingRecords>
     * @throws:
     */
    public List<BookingRecords> getBookingRecords() {
        return bookingRecordsList;
    }

    /**
     * @methodName: setBookingRecords
     * @description: set booking records using the bookingRecords
     * @param: [bookingRecords]
     * @return: void
     * @throws:
     */
    public void setBookingRecords(List<BookingRecords> bookingRecords) {
        this.bookingRecordsList = bookingRecords;
    }

    /**
     * @methodName: toString
     * @description: override the toString method to return "class ManageRecords"
     * @param: []
     * @return: java.lang.String
     * @throws:
     */
    @Override
    public String toString() {
        return "class ManageRecords";
    }
}

