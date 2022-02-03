package bg.tu_varna.sit.group25.ticketcenter.Application.common;

public class Constants
{
    public static class View
    {
        public static final String HELLO_VIEW="/bg/tu_varna/sit/group25/ticketcenter/presentation.views/hello-view.fxml";
    }

    public static class Login
    {
        public static final String LOGIN_VIEW="/bg/tu_varna/sit/group25/ticketcenter/presentation.views/LoginForm-view.fxml";
    }

    public static class Configurations
    {
        public static final String LOG4J_PROPERTIES="/bg/tu_varna/sit/group25/ticketcenter/configuration/log4j.properties";
    }

    public static class Organizer
    {
        public static final String ORGANIZER_LOGIN="/bg/tu_varna/sit/group25/ticketcenter/presentation.views/OrganizerLogin-view.fxml";
        public static final String Org_Options="/bg/tu_varna/sit/group25/ticketcenter/presentation.views/OrganizerOptions-view.fxml";
    }

    public static class Admin
    {
        public static final String LOGIN_VIEW="/bg/tu_varna/sit/group25/ticketcenter/presentation.views/AdminLogin-view.fxml";
        public static final String OPTIONS="/bg/tu_varna/sit/group25/ticketcenter/presentation.views/AdminOptions-view.fxml";
        public static final String ORG_EVENTS="/bg/tu_varna/sit/group25/ticketcenter/presentation.views/AdminOrgEvents-view.fxml";
        public static final String DIS_EVENTS="/bg/tu_varna/sit/group25/ticketcenter/presentation.views/AdminDisEvents-view.fxml";
    }
    public static class DBInfo
    {
        public static final String DATABASE_URL="jdbc:mysql://127.0.0.1:3306/TicketCenter";
        public static final String DATABASE_USERNAME="root";
        public static final String DATABASE_PASSWORD="Kyuubi279";
    }
    public static class Distributor
    {
        public static final String DISTRIBUTOR_LOGIN="/bg/tu_varna/sit/group25/ticketcenter/presentation.views/DistributorLogin-view.fxml";
        public static final String DISTRIBUTOR_QUERY_VIEW="/bg/tu_varna/sit/group25/ticketcenter/presentation.views/DistributorQuery-view.fxml";
    }

    public static class TicketForm
    {
        public static final String TICKET_FORM_VIEW="/bg/tu_varna/sit/group25/ticketcenter/presentation.views/TicketForm-view.fxml";
    }

    public static class RateingForm
    {
        public static final String RATING_FORM_VIEW="/bg/tu_varna/sit/group25/ticketcenter/presentation.views/DistributorRateing-view.fxml";
    }


    public static class EventForm
    {
        public static final String EVENT_FORM_VIEW="/bg/tu_varna/sit/group25/ticketcenter/presentation.views/EventForm-view.fxml";
        public static final String EVENT_QUERY_VIEW="/bg/tu_varna/sit/group25/ticketcenter/presentation.views/EventQuery-View.fxml";
    }

    public static class Warning
    {
        public static final String EMPTY_FIELDS_MESSAGE="Please fill all the fields";
        public static final String INVALID_DATA_MESSAGE="Entered data is incorrect";
    }

    public static class Values
    {
        public static final String TITTLE="Hello there user";
    }
}
