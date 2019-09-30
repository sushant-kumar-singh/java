    class Complex {
        double real;
        double imag;
        public Complex(double real, double imag) {
            this.real = real;
            this.imsag = imag;
        }
        public static void main(String[] args) {
            Complex c1 = new Complex(2.3, 4.5),
                    c2 = new Complex(3.4, 5.0),
                    temp;
            temp = add(c1, c2);
            System.out.printf("Sum = %f + %fi", temp.real, temp.imag);
        }
        public static Complex add(Complex c1, Complex c2)
        {
            Complex temp = new Complex(0.0, 0.0);
            temp.real = c1.real + c2.real;
            temp.imag = c1.imag + c2.imag;
            return(temp);
        }
    }