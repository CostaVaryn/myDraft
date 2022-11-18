package stepik.introductory;

public class NumbGame {
    public static void main(String[] args) {
        int x = 1, y = 5, z = 0;
        --y;
        x = 4 + y++;
        z += x--;
        x = y + z;
        System.out.print(++x);
        int xx = 25; int yy = -12;
        xx += yy;
        System.out.print(xx);
    }
}

// result:
// x = 14;