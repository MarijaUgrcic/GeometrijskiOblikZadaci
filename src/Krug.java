import java.text.DecimalFormat;

public class Krug extends Shape {
    private double r;
    private final static double PI = Math.PI;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public void povrsina() {
        super.povrsina();
        DecimalFormat df = new DecimalFormat("0.00");
        double rezultat = Math.pow(r, 2) * PI;
        System.out.println("krug je " + df.format(rezultat) + " cm²");
    }

    public void povrsina(double r) {
        super.povrsina();
        DecimalFormat df = new DecimalFormat("0.00");
        double rezultat = Math.pow(r, 2) * PI;
        System.out.println("krug je " + df.format(rezultat) + " cm²");
    }
}