package teamsapp;

public class Students extends Person {
    private String name;

    @Override
    public void sayClass() {
        System.out.println("I'm a student");
    }
}
