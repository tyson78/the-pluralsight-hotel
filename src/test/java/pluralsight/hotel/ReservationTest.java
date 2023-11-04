package pluralsight.hotel;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ReservationTest {
    @Test
    void constructorTest_default() {
        Reservation rs = new Reservation();
    }

    @Test
    void constructorTest_allValues() {
        Guest g = new Guest();
        RoomType rt = new RoomType();
        LocalDate sDate = LocalDate.of(2023, 03, 10);
        LocalDate eDate = LocalDate.of(2023, 04, 10);

        Reservation rs = new Reservation(sDate, eDate, g, rt);

        // works? but why
        assertEquals(sDate, rs.start);

    }
}