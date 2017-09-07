import java.util.Scanner;
public class DeterminingRealFakeTriangle {

    public static class PointOnGraph{
        double XCOOR;
        double YCOOR;

        public PointOnGraph() {
            XCOOR = 0.0;
            YCOOR = 0.0;
        }
    }

    public static void main(String[] args) {

        PointOnGraph pointOne = new PointOnGraph();
        PointOnGraph pointTwo = new PointOnGraph();
        PointOnGraph pointThr = new PointOnGraph();

        double DistOneTwo = 0.0;
        double DistTwoThr = 0.0;
        double DistThrOne = 0.0;

        System.out.print("Please input the X coordinate of point 1: ");
        pointOne.XCOOR = ReadInValues();
        System.out.print("Please input the Y coordinate of point 1: ");
        pointOne.YCOOR = ReadInValues();
        System.out.print("Please input the X coordinate of point 2: ");
        pointTwo.XCOOR = ReadInValues();
        System.out.print("Please input the Y coordinate of point 2: ");
        pointTwo.YCOOR = ReadInValues();
        System.out.print("Please input the X coordinate of point 3: ");
        pointThr.XCOOR = ReadInValues();
        System.out.print("Please input the Y coordinate of point 3: ");
        pointThr.YCOOR = ReadInValues();

        System.out.print("The distance between point 1 and point 2 is ");
        DistOneTwo = DetermineDistance(pointOne, pointTwo);
        System.out.printf("%3f\n", DistOneTwo);
        System.out.print("The distance between point 2 and point 3 is ");
        DistTwoThr = DetermineDistance(pointTwo, pointThr);
        System.out.printf("%3f\n", DistTwoThr);
        System.out.print("The distance between point 3 and point 1 is ");
        DistThrOne = DetermineDistance(pointThr, pointOne);
        System.out.printf("%3f\n", DistThrOne);

        System.out.print("Is this a triangle? " + isTriangle(DistOneTwo, DistTwoThr, DistThrOne));
    }

    static double ReadInValues(){
        Scanner reader = new Scanner(System.in);
        if (reader.hasNextDouble()) { return reader.nextDouble(); }
        else {
            System.out.println("Error, value not allowed. Using 0.0 instead. ");
            return 0;
        }
    }

    static double DetermineDistance (PointOnGraph pointone, PointOnGraph pointtwo){
        double distance = 0.0;
        distance = Math.sqrt( Math.pow( pointtwo.XCOOR - pointone.XCOOR , 2) + Math.pow( pointtwo.YCOOR - pointone.YCOOR , 2) );
        return distance;
    }

    static boolean isTriangle (double distanceOne, double distanceTwo, double distanceThr) {
        if ( (distanceOne + distanceTwo) > distanceThr ){ return true; }
        if ( (distanceTwo + distanceThr) > distanceOne ){ return true; }
        if ( (distanceThr + distanceOne) > distanceTwo ){ return true; }
        return false;
    }
}


