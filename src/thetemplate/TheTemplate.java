package thetemplate;

public class TheTemplate {
    public class decagonStack {
        // properties
        int android;
        int ios;
        int java;
        int golang;
        int dotnet;
        int node;
        int phyton;
        // constructor
        public decagonStack(int android, int ios, int java, int golang, int dotnet, int node, int phyton){
            this.android = android;
            this.ios = ios;
            this.java = java;
            this.golang = golang;
            this.dotnet = dotnet;
            this.node = node;
            this.phyton = phyton;
        }
        // method or behaviour
        public void toCode(){
            System.out.println("We build codes");
        }
    }
}
