package MetodosJavaDIO;

public class SobreCarga {
    public void calculoQuadrilateros(int num1){
        double area;
        area = num1^2;
    }
    public void calculoQuadrilateros(int num1, int num3){
        double area;
        area = num1*num3;
    }

    public void calculoQuadrilateros(int num1, int num3, int h){
        double area;
        area = num1*num3/h;
    }
}
