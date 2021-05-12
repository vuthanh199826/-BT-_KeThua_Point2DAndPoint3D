package pack01;

import java.lang.reflect.Array;

public class Point2D {
    private float x;
    private float y;

    public Point2D() {
        this.x =1f;
        this.y =1f;
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        return new float[]{this.x,this.y};
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                " getXY[0]= " + getXY()[0] +
                " getXY[1] =" + getXY()[1] +
                '}';
    }
}

class Point3D extends Point2D{
    private float z = 0.0f;

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D(){
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y, float z){
        super.setX(x);
        super.setY(y);
        this.z = z;
    }
    public float[] getXYZ(){
        return new float[]{this.getX(),this.getY(),this.z};
    }

    @Override
    public String toString() {
        return " x = " +getXYZ()[0]+
                " y = " +getXYZ()[1]+
                " z = " +getXYZ()[2];
    }
}

class Test{
    public static void main(String[] args) {
        Point3D obj = new Point3D();
        obj.setXYZ(5,8,10);
        System.out.println(obj);

    }
}
