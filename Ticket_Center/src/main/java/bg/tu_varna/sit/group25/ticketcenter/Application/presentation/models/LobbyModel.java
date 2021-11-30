package bg.tu_varna.sit.group25.ticketcenter.Application.presentation.models;

public class LobbyModel
{
    private final String welcomeMessage;

    public LobbyModel()
    {
        this.welcomeMessage="Hello User, let us get to work";
    }

    public String getWelcomeMessage()
    {
        return welcomeMessage;
    }
}

