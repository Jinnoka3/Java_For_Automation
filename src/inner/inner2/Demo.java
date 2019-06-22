package inner.inner2;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {


        inner.inner2.MovableRectangle movableRectangle = new MovableRectangle();
        movableRectangle.inputPoint();
        movableRectangle.inputSpeed();
        System.out.println(movableRectangle);

        System.out.println("Enter \"wasd\" for move point or \"e\" for exit");
        Scanner in = new Scanner(System.in);

        while(true) {
            String key = in.nextLine();
            if (key.equals("w")) {
                movableRectangle.moveUp();
            }
            else if (key.equals("s")) {
                movableRectangle.moveDown();
            }
            else if (key.equals("a")) {
                movableRectangle.moveLeft();
            }
            else if (key.equals("d")) {
                movableRectangle.moveRight();
            }
            else if (key.equals("e")){
                break;
            }
            else
                System.out.println("You press the wrong key");
            System.out.println(movableRectangle);
        }
    }
}
