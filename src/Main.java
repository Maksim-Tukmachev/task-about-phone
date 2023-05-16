public class Main {
    public static void main(String[] args) {
        int x = 100;
        int y = 400;
        int z = x + y;
        if (y > 1000) {
            int q = y / 100;
            System.out.println(q);
            System.out.println(z + q);
        } else {
            int t = 1200;
            int a = x + y + t;
            if (t > 1000) {
                int s = t / 100;
                System.out.println(s);
                System.out.println(a + s);
            }
        }
    }
}

