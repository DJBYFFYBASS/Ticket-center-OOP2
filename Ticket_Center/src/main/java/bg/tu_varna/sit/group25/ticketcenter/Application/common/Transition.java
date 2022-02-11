package bg.tu_varna.sit.group25.ticketcenter.Application.common;

public class Transition {
    public  class OrganizerInfo{
        private  String name;
        private  Long ID;
        public  Long getID(){return  ID;}
        public  void setID(Long id){ID=id;}
        public  String getName(){
            return name;
        }
        public  void setName(String Name){
            name=Name;
        }
    }
    public  class DistributorInfo{
        private static String name;
        private static Long ID;
        public  Long getID(){return  ID;}
        public  void setID(Long id){ID=id;}
        public  String getName(){
            return name;
        }
        public  void setName(String Name){
            name=Name;
        }
    }
    public  class AdminInfo{
        private static String name;
        private static Long ID;
        public  Long getID(){return  ID;}
        public  void setID(Long id){ID=id;}
        public  String getName(){
            return name;
        }
        public  void setName(String Name){
            name=Name;
        }
    }
}
