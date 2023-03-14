public class chavez_ic_marie_PPS04 {
    public static void main(String[] args) {
        String movie1 = "Avatar";
        String movie2 = "Black Panther";
        String movie3 = "Ant Man";

        int length_m = 0;
        int max_m = 0;
        length_m = movie1.length();
        max_m = Math.max(0, length_m);
        length_m = movie2.length();
        max_m = Math.max(0, length_m);
        length_m = movie3.length();
        max_m = Math.max(max_m, length_m);
        String title = "I like watching ";

        System.out.println("HIGHEST VALUE: " + max_m );
        System.out.println("1st movie: " + movie1 );
        System.out.println("2nd movie: " +movie2);
        System.out.println("3rd movie: " +movie3);

        System.out.println(title + "AVATAR" );
        System.out.println(title +"BLACK PANTHER");
        System.out.println(title + "ANT MAN");


    }
    }
