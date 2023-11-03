package pluralsight.hotel;

import org.junit.jupiter.api.Test;
import pluralsight.hotel.ui.RoomStatus;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void constructorTest_default() {
        Room r = new Room();
    }

    @Test
    void constructorTest_allValues() {
        RoomType rt = new RoomType();

        Room r1 = new Room(25, rt, RoomStatus.DIRTY);

        // assertEquals(true, r1.isClean());
        assertEquals(false, r1.isClean());
        assertEquals(false, r1.isAvailable());
    }

}