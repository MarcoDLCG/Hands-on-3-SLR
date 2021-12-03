package Agente;

public class Cramer extends DataSet {

    public double[][] getMatriz1() {
        matriz1[0][0]=sx2; matriz1[0][1]=sx; matriz1[0][2]=n;

        matriz1[1][0]=sx3; matriz1[1][1]=sx2; matriz1[1][2]=sx;

        matriz1[2][0]=sx4; matriz1[2][1]=sx3; matriz1[2][2]=sx2;

        System.out.println("Sistema 3x3\n ");
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print(matriz1[i][j] + "  \t   ");
            }
            if (i==0)
                System.out.println("= "+sy+" \t\n");
            else if(i==1)
                System.out.println("= "+sxy+" \t\n");
            else if(i==2)
                System.out.println("= "+sx2y+" \t\n");
        }
        return matriz1;
    }

    public void setMatriz1(double[][] matriz1) {
        this.matriz1 = matriz1;
    }
    public double getDetgen() {
        detgen=(matriz1[0][0]*matriz1[1][1]*matriz1[2][2])+(matriz1[0][1]*matriz1[1][2]*matriz1[2][0])+(matriz1[0][2]*matriz1[1][0]*matriz1[2][1])-(matriz1[2][0]*matriz1[1][1]*matriz1[0][2])-(matriz1[2][1]*matriz1[1][2]*matriz1[0][0])-(matriz1[2][2]*matriz1[1][0]*matriz1[0][1]);
        return detgen;
    }

    public void setDetgen(double detgen) {
        this.detgen = detgen;
    }

    public double getDet1() {
        det1=(sy*matriz1[1][1]*matriz1[2][2])+(matriz1[0][1]*matriz1[1][2]*sx2y)+(matriz1[0][2]*sxy*matriz1[2][1])-(sx2y*matriz1[1][1]*matriz1[0][2])-(matriz1[2][1]*matriz1[1][2]*sy)-(matriz1[2][2]*sxy*matriz1[0][1]);
        return det1;
    }

    public void setDet1(double det1) {
        this.det1 = det1;
    }

    public double getDet2() {
        det2=(matriz1[0][0]*sxy*matriz1[2][2])+(sy*matriz1[1][2]*matriz1[2][0])+(matriz1[0][2]*matriz1[1][0]*sx2y)-(matriz1[2][0]*sxy*matriz1[0][2])-(sx2y*matriz1[1][2]*matriz1[0][0])-(matriz1[2][2]*matriz1[1][0]*sy);
        return det2;
    }

    public void setDet2(double det2) {
        this.det2 = det2;
    }

    public double getDet3() {
        det3=(matriz1[0][0]*matriz1[1][1]*sx2y)+(matriz1[0][1]*sxy*matriz1[2][0])+(sy*matriz1[1][0]*matriz1[2][1])-(matriz1[2][0]*matriz1[1][1]*sy)-(matriz1[2][1]*sxy*matriz1[0][0])-(sx2y*matriz1[1][0]*matriz1[0][1]);
        return det3;
    }

    public void setDet3(double det3) {
        this.det3 = det3;
    }

    public double getB0() {
        b0=det1/detgen;
        return b0;
    }

    public void setB0(double b0) {
        this.b0 = b0;
    }

    public double getB1() {
        b1=det2/detgen;
        return b1;
    }

    public void setB1(double b1) {
        this.b1 = b1;
    }

    public double getB2() {
        b2=det3/detgen;
        return b2;
    }

    public void setB2(double b2) {
        this.b2 = b2;
    }
    public double[] getResultadoy() {
        for (int i=0; i<n; i++){
            resultadoy[i] = (b0*x2[i])+(b1*x[i])+b2;
            System.out.println(y[i]+" ≈ "+resultadoy[i]);
        }
        return resultadoy;
    }

    public void setResultadoy(double[] resultadoy) {
        this.resultadoy = resultadoy;
    }

    @Override
    public void Datos() {
        getX();getY();getX2();getX3();getX4();getXy();getX2y();

        getSx();getSy();getSx2();getSx3();getSx4();getSxy();getSx2y();

        getMatriz1();
        System.out.println("El determinante General es: "+ getDetgen()+"\n");
        System.out.println("El determinante 1 es: "+ getDet1()+"\n");
        System.out.println("El determinante 2 es: "+ getDet2()+"\n");
        System.out.println("El determinante 3 es:  "+ getDet3()+"\n");
        System.out.println("La B0 es: "+ getB0()+"\n");
        System.out.println("La B1 es: "+ getB1()+"\n");
        System.out.println("La B2 es: "+ getB2()+"\n");

        System.out.println("Los resultados de Y son: ");
        getResultadoy();

    }
    private double[][] matriz1=new double[3][3];
    private double[] resultadoy=new double[n];
    private double detgen, det1, det2, det3, b0,b1,b2;
}