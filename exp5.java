// 5. Define a MyRectangle class with four public data members representing the x- and ycoordinates of the bottom-left vertex and top-right vertex of a rectangle, whose sides are parallel to 
// the x- or y-axis.
// For example, the statement new MyRectangle(20,80,30,90) creates a rectangle with bottom-left 
// vertex at position (20,80), and top-right vertex at (30,90). 
// (a) Write an area() method, which computes the area of a rectangle.
// (b) Write the overlap(MyRectanglerect) method. This method returns a rectangle which is the 
// overlapped region of two rectangles. In the event that there is no overlap, it should return a 
// rectangle with both bottom-left vertex and top-right vertex at position (0,0).
// (c) Using the overlap(MyRectanglerect) method written above, write the 
// overlapAll(MyRectangle[] rectangles) method which returns the overlapped region of all the 
// rectangles in the array. You may assume that there is at least one element in the array. Your 
// method should be efficient in that the moment it finds that the overlapped region is empty, it 
// should return a rectangle with both vertices at (0,0) immediately. 
// (d) Write MySqaure.java, MySquare extends MyRectangle.
// A square is defined by its bottom-left vertex and the length of its side. Complete the super( . . . ) 
// statement in the constructor.
// (e)Below is output of MySquare.java program when the user enters: 10 30 5.
// Class MySquare: [(10,30); (15,35)] 
// Area = 25
// Override the toString() method in MyRectangle in order to get such output
import java.util.Scanner;

class MyRectangle {
    public int v1x, v1y, v2x, v2y;

    public MyRectangle(int verx1, int very1, int verx2, int very2) {
        v1x = verx1;
        v1y = very1;
        v2x = verx2;
        v2y = very2;
    }

    public int area() {
        return Math.abs((v2x - v1x) * (v2y - v1y));
    }

    public MyRectangle overlap(MyRectangle rect) {
        int x1 = Math.max(v1x, rect.v1x);
        int y1 = Math.max(v1y, rect.v1y);
        int x2 = Math.min(v2x, rect.v2x);
        int y2 = Math.min(v2y, rect.v2y);
        if (x1 >= x2 || y1 >= y2) {
            System.out.println("No overlap");
            return new MyRectangle(0, 0, 0, 0);
        }
        return new MyRectangle(x1, y1, x2, y2);
    }

    public static MyRectangle overlapAll(MyRectangle[] rects) {
        MyRectangle res = rects[0];
        for (int i = 1; i < rects.length; i++) {
            res = res.overlap(rects[i]);
            if (res.area() == 0) {
                return new MyRectangle(0, 0, 0, 0);
            }
        }
        return res;
    }
}

class MySquare extends MyRectangle {
    public int xc, yc, length;

    public MySquare(int x, int y, int l) {
        super(x, y, x + l, y + l);
        xc = x;
        yc = y;
        length = l;
    }

    public int area() {
        return length * length;
    }

    public String toString() {
        return "Class MySquare: [(" + (xc) + "," + (yc) + "); (" + (xc + length) + "," + (yc + length) + ")]";
    }
}

public class exp5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int l = sc.nextInt();
        MySquare s = new MySquare(x, y, l);
        System.out.println(s);
        System.out.println("Area = " + s.area());

        MyRectangle m = new MyRectangle(10, 30, 20, 50);
        MyRectangle p = new MyRectangle(15, 30, 30, 50);

        MyRectangle newrect = m.overlap(p);
        System.out.println("Overlap Rectangle Coordinates: ");
        System.out.println("Bottom-left: (" + newrect.v1x + ", " + newrect.v1y + ")");
        System.out.println("Top-right: (" + newrect.v2x + ", " + newrect.v2y + ")");

        MyRectangle[] rects = { m, p };
        MyRectangle overrect = MyRectangle.overlapAll(rects);
        System.out.println("OverlapAll Rectangle Coordinates: ");
        System.out.println("Bottom-left: (" + overrect.v1x + ", " + overrect.v1y + ")");
        System.out.println("Top-right: (" + overrect.v2x + ", " + overrect.v2y + ")");

        sc.close();
    }
}