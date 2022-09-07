package pra_obsever;

import java.util.Scanner;

public class ObserverMian {
    public static void main(String[] args) {
        Subject sub;
        Subject Subject = sub = new Subject();

        new HexObserver(sub);
        new OctObserver(sub);
        new BinObserver(sub);

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("\nEnter a number");
            sub.setState(sc.nextInt());
        }
    }

    private static class HexObserver {
        public HexObserver(Subject sub) {
        }
    }
}
