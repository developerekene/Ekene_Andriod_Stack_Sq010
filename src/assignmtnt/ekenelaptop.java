package assignmtnt;

public class ekenelaptop {

        public static void main(String[] args){
            Laptop ekeneCompany = new Laptop("normal", "rectangle", "wide", "intel", "red");
            System.out.println("This laptop has a " + ekeneCompany.keyboard + " a Screen which is " + ekeneCompany.screen + " a " + ekeneCompany.mouse + " Mouse" +
                    " , a harddrive made by " + ekeneCompany.harddrive + " and a color of " + ekeneCompany.colour);
        }
    }
