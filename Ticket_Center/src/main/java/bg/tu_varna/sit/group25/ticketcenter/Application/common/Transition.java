package bg.tu_varna.sit.group25.ticketcenter.Application.common;

public class Transition {
    public static class OrganizerInfo{
        private static String name;
        private static Long ID;
        public static Long getID(){return  ID;}
        public static void setID(Long id){ID=id;}
        public static String getName(){
            return name;
        }
        public static void setName(String Name){
            name=Name;
        }
    }
    public static class DistributorInfo{
        private static String name;
        private static Long ID;
        public static Long getID(){return  ID;}
        public static void setID(Long id){ID=id;}
        public static String getName(){
            return name;
        }
        public static void setName(String Name){
            name=Name;
        }
    }
    public static class AdminInfo{
        private static String name;
        private static Long ID;
        public static Long getID(){return  ID;}
        public static void setID(Long id){ID=id;}
        public static String getName(){
            return name;
        }
        public static void setName(String Name){
            name=Name;
        }
    }
}
