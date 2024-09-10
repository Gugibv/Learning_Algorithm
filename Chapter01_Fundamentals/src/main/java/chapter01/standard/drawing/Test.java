package chapter01.standard.drawing;

import edu.princeton.cs.algs4.StdDraw;

import java.awt.*;

public class Test {
    public static void main(String []args){
        StdDraw.line(0,0,0.5,0.5);
        StdDraw.square(0,0,0.9);
        StdDraw.circle(0,0,0.5);
        double[]x = {0,0.3,0.6,0.8};  //{x0,x1,x2,x3}
        double[]y = {0,0.2,0.8,0.9};  //{y0,y1,y2,y3}
        StdDraw.polygon(x,y);


        // 绘制函数值
        int N =100;
        StdDraw.setXscale(0,N);
        StdDraw.setYscale(0,N*N);
        StdDraw.setPenRadius(.01);
        StdDraw.setPenColor(Color.BLUE);
        for(int i=1;i<=N;i++){
            StdDraw.point(i,i);
            StdDraw.point(i,i*i);
            StdDraw.point(i,i*Math.log(i));
        }

    }


}
