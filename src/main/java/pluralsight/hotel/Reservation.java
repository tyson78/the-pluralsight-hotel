package pluralsight.hotel;

import java.time.LocalDate;
import java.util.List;

public class Reservation {
    LocalDate start;
    LocalDate end;
    Guest guest;
    RoomType requestedType;

    // <---CONSTRUCTOR--->
    public Reservation() {
    }

    public Reservation(LocalDate start, LocalDate end, Guest guest, RoomType roomType) {
        this.start = start;
        this.end = end;
        this.requestedType = roomType;
        this.guest = guest;

        LocalDate a = LocalDate.of(2023,03,10);
        LocalDate b = LocalDate.of(2023, 04, 10);
        if (start.isEqual(a) && end.isEqual(b)) {
            System.out.println("Booked 1 month");
        }
    }

    // The following fields are assigned when the guest checks in
    Room room = null;
    Folio folio = null;
    List<RoomKey> keys = null;
}
