package assignmtnt;

public class Laptop {
    // properties
    String keyboard;
    String screen;
    String mouse;
    String harddrive;
    String colour;

    // constructor
    public Laptop(String keyboard, String screen, String mouse, String harddrive, String colour){
        this.screen = screen;
        this.mouse = mouse;
        this.harddrive = harddrive;
        this.colour = colour;
        this.keyboard = keyboard;
    }

    // behaviour
    public void totype(){
        System.out.println("We build codes");
    }
}

    
