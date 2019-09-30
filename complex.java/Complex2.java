 class Complex2 {
        double real;
        double imag;
        public Complex(double real, double imag) {
            this.real = real;
            this.imag = imag;
        }
        public static void main(String[] args) {
            Complex c1 = new Complex(2.3, 4.5),
                    c2 = new Complex(3.4, 5.0),
                    temp;
                    temp = sub(c1,c2);
                    system.out.println("sub= %f + %fi", temp.real, temp.imag);
                }
                public static complex sub(complex c1,complex c2)
                {
                    complex temp = new complex(0.0, 0.0);
                    temp.real = c1.real - c2.real;
                    temp.imag = c1.imag - c2.imag;
                    return(temp);
                }
            }