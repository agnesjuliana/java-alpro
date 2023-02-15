public class App {
    public static void main(String[] args) throws Exception {
        String name = "Agnes Juliana";
        int x = 3;
        double y = 3;
        

        System.out.println("nama saya si "+ name);
        System.out.println(name+" berkuliah di SI ITS");

        x += 3;
        System.out.println(x);
        System.out.println(y);

        String hai = "hello";
        String hello = "world";
        System.out.println(hai + ' ' + hello);

        String numString = "1";
        int stringToNumb = Integer.valueOf(numString);
        int stringToNumb2 = Integer.parseInt(numString);
        String numbToString = Integer.toString(stringToNumb);
    }
}
