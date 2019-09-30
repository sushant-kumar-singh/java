import java.util.scanner;
class complex{
    private double re;
    private double im;
    private String id;

    private Scanner  sc = new scanner (system.in);

    //Constructors
    public Complex () {
        this.real = 0.0;
        this.im = 0.0;
    }
    public Complex (double re, double im) {
           this.re = re;
           this.im = im;
           this.id = "";
    }
    // Setters
    public void setReal (double re) {
        this.re = re;
    }
    public void setImaginary (double im) {
        this.im = im;
    }
    public void setId (string id) {
        this.id = id;
    }

    public void input () {
        System.out.print("\n\tEnter Real (" + this.id + ") : ");
        this.re = sc.nextDouble();
        System.out.print("\n\tEnter Imaginary (" + this.id + ") : ");
        this.im = sc.nextDouble();
    }

    //Display (Override the toString() method)
    @Override
    public String toString () {
        return ("\t" + this.id + " = " + this.re + ((this.im<0)?" ":" +") + this.im + "i.\n");
    }

    //add and subtract
    public static Complex add (Complex a, Complex b) {
        Complex s = new Complex (a.re + b.re, a.im + b.im);
        return s;
    }

    public static Complex subtract (Complex a, Complex b) {
        Complex d = new Complex (a.re - b.re, a.im - b.im);
        return d;
    }

    public class ComplexTest {
        public static void main (String [] args) {
            Complex a = new Complex ("A");
            Complex b = new Complex ("B");
            a.input();
            b.input();

            Complex s = Complex.add (a, b);
            s.setID ("A + B");

            Complex d = Complex.subtract (a, b);
            d.setID ("A - B");

            System.out.println ("" + a + b + s + d );
        }
    }
