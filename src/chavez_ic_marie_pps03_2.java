public class chavez_ic_marie_pps03_2 {
    public static void main(String[] args) {
        int i = 7;
        int c = 36;
        int m = 15;
        int a = 25;
        //15 > 36 || 3 < 7
        int r = 3;
        //14 > 7 && 5 <= 5
        int w = 14;
        int x = 5;
        //4 > 3 && 17 <= 7
        int y = 4;
        int s = 17;
        //!false
        int n = 10;
        //! (13 != 7)
        int o = 13;
        //5 > 1 && 7 >= 7
        int b = 1;
        boolean result = a < i || m > c;
        boolean $result = m > c || r < i;
        boolean $result1 = w > i && x <= x;
        boolean $result2 = y > r && s <= i;
        boolean $a = ! (o != i);
        boolean $result3 = x > b && i >= i;



        System.out.println(result);
        System.out.println($result);
        System.out.println($result1);
        System.out.println($result2);
        System.out.println($a);
        System.out.println($result3);

    }

}
