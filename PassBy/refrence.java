package in.regno.PassBy;

public class refrence {
    public static void main(String[] args) {
       point p =new point(4,6);
        System.out.println("first" + p);
        move(p);
        System.out.println("first" + p);

    }
    public static void move(point m){
        m.x++;
        m.y++;
        System.out.println(m);
    }
    public static class point{
        public point(int y, int x) {
            this.y = y;
            this.x = x;
        }

        int x;

        @Override
        public String toString() {
            return "point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }

        int y;
    }
}
