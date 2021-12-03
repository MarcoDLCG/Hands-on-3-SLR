package Agente;

public abstract class DataSet {
    public double[] x={1,2,3.5,4,5.5,6,6.5,8,8.5,10}, y={5.8,9,13,15,16.5,17.5,18,19,19.5,20};
    int n=x.length;
    public double[] x2=new double[n],x3=new double[n],x4=new double[n],xy=new double[n],x2y=new double[n];
    public double sx,sy,sx2,sx3,sx4,sxy,sx2y;

    public double[] getX() {
        return x;
    }

    public void setX(double[] x) {
        this.x = x;
    }

    public double[] getY() {
        return y;
    }

    public void setY(double[] y) {
        this.y = y;
    }

    public double[] getX2() {
        for(int i=0; i<n; i++){
            x2[i]=Math.pow(x[i],2);
        }
        return x2;
    }

    public void setX2(double[] x2) {
        this.x2 = x2;
    }

    public double[] getX3() {
        for(int i=0; i<n; i++){
            x3[i]=Math.pow(x[i],3);
        }
        return x3;
    }

    public void setX3(double[] x3) {
        this.x3 = x3;
    }

    public double[] getX4() {
        for(int i=0; i<n; i++){
            x4[i]=Math.pow(x[i],4);
        }
        return x4;
    }

    public void setX4(double[] x4) {
        this.x4 = x4;
    }

    public double[] getXy() {
        for(int i=0; i<n; i++){
            xy[i]=x[i]*y[i];
        }
        return xy;
    }

    public void setXy(double[] xy) {
        this.xy = xy;
    }

    public double[] getX2y() {
        for(int i=0; i<n; i++){
            x2y[i]=(Math.pow(x[i],2))*y[i];
        }
        return x2y;
    }

    public void setX2y(double[] x2y) {
        this.x2y = x2y;
    }

    public double getSx() {
        for(int i=0; i<n; i++){
            sx+=x[i];
        }
        return sx;
    }

    public void setSx(double sx) {
        this.sx = sx;
    }

    public double getSy() {
        for(int i=0; i<n; i++){
            sy+=y[i];
        }
        return sy;
    }

    public void setSy(double sy) {
        this.sy = sy;
    }

    public double getSx2() {
        for(int i=0; i<n; i++){
            sx2+=x2[i];
        }
        return sx2;
    }

    public void setSx2(double sx2) {
        this.sx2 = sx2;
    }

    public double getSx3() {
        for(int i=0; i<n; i++){
            sx3+=x3[i];
        }
        return sx3;
    }

    public void setSx3(double sx3) {
        this.sx3 = sx3;
    }

    public double getSx4() {
        for(int i=0; i<n; i++){
            sx4+=x4[i];
        }
        return sx4;
    }

    public void setSx4(double sx4) {
        this.sx4 = sx4;
    }

    public double getSxy() {
        for(int i=0; i<n; i++){
            sxy+=xy[i];
        }
        return sxy;
    }

    public void setSxy(double sxy) {
        this.sxy = sxy;
    }

    public double getSx2y() {
        for(int i=0; i<n; i++){
            sx2y+=x2y[i];
        }
        return sx2y;
    }

    public void setSx2y(double sx2y) {
        this.sx2y = sx2y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public abstract void Datos();
}