package inner2;

import tryrerer.Movable;

import java.util.Scanner;

public class MovableRectangle implements Movable{

   private MovablePoint topLeft;
   private MovablePoint bottomRight;

   public MovableRectangle() {
       topLeft = new MovablePoint();
       bottomRight = new MovablePoint();
   }

   public MovablePoint getTopLeft() {
       return topLeft;
   }

   public void setTopLeft(MovablePoint topLeft) {
       this.topLeft = topLeft;
   }

   public MovablePoint getBottomRight() {
       return bottomRight;
   }

   public void setBottomRight(MovablePoint bottomRight) {
       this.bottomRight = bottomRight;
   }

   public void moveUp() {
       topLeft.y += topLeft.getYSpeed();
       bottomRight.y += bottomRight.getYSpeed();
   }


   public void moveDown() {
       topLeft.y -= topLeft.getYSpeed();
       bottomRight.y -= bottomRight.getYSpeed();
   }

   public void moveLeft() {
       topLeft.x -= topLeft.getXSpeed();
       bottomRight.x -= bottomRight.getXSpeed();
   }


   public void moveRight() {
       topLeft.x += topLeft.getXSpeed();
       bottomRight.x += bottomRight.getXSpeed();
   }

   @Override
   public String toString(){
       return "Rectangle point's (" + getTopLeft() + ";" + getBottomRight() + ")";
   }

    public void inputPoint() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Top Left X:");
        int x1 = in.nextInt();
        topLeft.x = x1;

        System.out.println("Enter Top Left Y:");
        int y1 = in.nextInt();
        topLeft.y = y1;

        System.out.println("Enter Bottom Right X:");
        int x2 = in.nextInt();
        bottomRight.x = x2;

        System.out.println("Enter Bottom Right Y:");
        int y2 = in.nextInt();
        bottomRight.y = y2;
    }

    public void inputSpeed(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter X Speed:");
        int xSpeed = in.nextInt();
        topLeft.setXSpeed(xSpeed);
        bottomRight.setXSpeed(xSpeed);

        System.out.println("Enter Y Speed:");
        int ySpeed = in.nextInt();
        topLeft.setYSpeed(ySpeed);
        bottomRight.setYSpeed(ySpeed);
    }

    public class MovablePoint implements Movable{

        private int x;
        private int y;
        private int xSpeed;
        private int ySpeed;

        MovablePoint(){
            this.x = 0;
            this.y = 0;
            this.xSpeed = 1;
            this.ySpeed = 1;
        }

        MovablePoint(int x, int y){
            this.x = x;
            this.y = y;
        }

        MovablePoint(int x, int y, int xSpeed, int ySpeed){
            this.x = x;
            this.y = y;
            setXSpeed(xSpeed);
            setYSpeed(ySpeed);
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public int getXSpeed() {
            return xSpeed;
        }

        public void setXSpeed(int xSpeed) {
            if (xSpeed < 0) {
                System.out.println("Wrong Speed");
            }
            else {
                this.xSpeed = xSpeed;
            }
        }

        public int getYSpeed() {
            return ySpeed;
        }

        public void setYSpeed(int ySpeed) {
            if (ySpeed < 0) {
                System.out.println("Wrong Speed");
            }
            else {
                this.ySpeed = ySpeed;
            }
        }

        public void moveUp() {
            y += getYSpeed();
        }


        public void moveDown() {
            y -= getYSpeed();
        }


        public void moveLeft() {
            x -= getXSpeed();
        }


        public void moveRight() {
            x += getXSpeed();
        }

        @Override
        public String toString(){
            return "(" + getX() + ";" + getY() + ")";

        }
    }
}

