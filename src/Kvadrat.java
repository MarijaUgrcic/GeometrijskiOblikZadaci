

public class Kvadrat extends Shape {

    private double a;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }


    @Override
    public void povrsina() {
        super.povrsina();
        System.out.println("kvadrat je " + Math.pow(a, 2) + " cm²");
    }

}
