package bg.tu_varna.sit.group25.ticketcenter.Application.data.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DistributorTest {

    @Test
    void setPhone_Number_D() {
    }

    @Test
    void getRating() {
    }

    @Test
    void getPhone_Number_D() {
        Distributor dis= new Distributor();
        dis.setPhone_Number_D("0898999560");
        int leng=dis.getPhone_Number_D().length();
        assertEquals(10,leng);
    }
}