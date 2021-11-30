package bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LobbyModelTest {

    private LobbyModel lobbyModel;

    @BeforeEach
    void setUp()
    {
        lobbyModel=new LobbyModel();
    }

    @Test
    void getWelcomeMessage()
    {
        assertEquals("Hello User, let us get to work",lobbyModel.getWelcomeMessage());
    }
}