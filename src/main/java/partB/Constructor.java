package partB;

public class Constructor {

    static String name = "";

    public Constructor(){
        System.out.println("The constructor is being called:");
        name = "Francis";
    }

    public static String Constructor() {
        String response = "";

        Constructor myClass = new Constructor();
        response = "The constructor is being called:\nThe name is " + myClass.name;
        return response;
    }



    public static void main(String[] args) {
        String output = Constructor();
        System.out.print(output);
    }
}
