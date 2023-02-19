public class Pravougaonik extends Shape {
    private double a;
    private double b;

    public Pravougaonik() {};
    public Pravougaonik(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void povrsina() {
        super.povrsina();
        System.out.println("pravougaonik je " + a * b + " cm²");
    }

    //overloading
    public void povrsina(double a, double b) {
        super.povrsina();
        System.out.println("pravougaonik je " + a * b + " cm²");

    }
}

