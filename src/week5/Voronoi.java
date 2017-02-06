package week5;
import edu.princeton.cs.algs4.StdDraw;

import java.awt.Color;

public class Voronoi {

    public static double pointDist(Point2D point1, Point2D point2) {
        // ADD CODE HERE
        double X1 = point1.getX() - point2.getX();
        double Y1 = point1.getY() - point2.getY();
        return Math.sqrt(X1*X1 + Y1*Y1);

    }

    public static int findClosestPoint(Point2D point, Point2D[] sites) {
        // ADD CODE HERE
        double a = pointDist(point,sites[0]);
        int c = 0;
        for(int p = 0 ; p<sites.length; p++){
            if(a>pointDist(point,sites[p])){
                a = pointDist(point,sites[p]);
                c = p;
            }
        }
        return c;

    }

    public static int[][] buildVoronoiMap(Point2D[] sites, int width, int height) {
        // ADD CODE HERE
        int[][] vor = new int[width][height];
        for(int i=0;i<width;i++){
            for(int j=0;j<height;j++){
                vor[i][j] = findClosestPoint(new Point2D(i,j),sites);
            }
        }
        return vor;


    }

    public static void plotVoronoiMap(Point2D[] sites, Color[] colors, int[][] indexMap) {
        // ADD CODE HERE
        int width = indexMap.length;
        int height = indexMap[0].length;

        StdDraw.setCanvasSize(width,height);
        StdDraw.setXscale(0,width);
        StdDraw.setYscale(0,height);

        for(int i=0;i<width;i++){
            for(int j=0;j<height;j++){
                StdDraw.setPenColor(colors[(indexMap[i][j])]);
                StdDraw.point(i,j);
            }
        }
        for (int i =0;i<sites.length;i++){
            StdDraw.setPenColor(Color.BLACK);
            StdDraw.filledCircle(sites[i].getX(),sites[i].getY(),3);
        }


    }

    public static void main(String[] args) {
        int width = 200;
        int height = 200;

        int nSites = 5;
        Point2D[] sites = new Point2D[nSites];
        sites[0] = new Point2D(50, 50);
        sites[1] = new Point2D(100, 50);
        sites[2] = new Point2D(50, 100);
        sites[3] = new Point2D(125, 50);
        sites[4] = new Point2D(100, 175);

        Color[] colors = new Color[nSites];
        colors[0] = Color.BLUE;
        colors[1] = Color.GREEN;
        colors[2] = Color.YELLOW;
        colors[3] = Color.ORANGE;
        colors[4] = Color.MAGENTA;

        int[][] indexmap = buildVoronoiMap(sites, width, height);
        plotVoronoiMap(sites, colors, indexmap);

    }

}