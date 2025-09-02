 class Complex {
    double real;
    double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }

    public Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imaginary - other.imaginary);
    }

    public Complex multiply(Complex other) {
        double realPart = this.real * other.real - this.imaginary * other.imaginary;
        double imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(realPart, imaginaryPart);
    }

    public Complex divide(Complex other) {
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        double realPart = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
        double imaginaryPart = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
        return new Complex(realPart, imaginaryPart);
    }
    
    public double magnitudeSq() {
        return real * real + imaginary * imaginary;
    }

    public Complex conjugate() {
        return new Complex(this.real, -this.imaginary);
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}

class QuantumPotential {
    // Calculates the quantum potential
    public static double calculate(Complex[] waveFunction, double[] x, double mass) {
        if (waveFunction.length != x.length) {
            throw new IllegalArgumentException("Wave function and x array must have the same length");
        }

        if (waveFunction.length < 2) {
             throw new IllegalArgumentException("Wave function and x array must have at least two points");
        }
      
        double dx = x[1] - x[0]; // Assuming uniform spacing
        
        // Calculate the second derivative of the wave function numerically
        Complex[] secondDerivative = new Complex[waveFunction.length];
        for (int i = 1; i < waveFunction.length - 1; i++) {
            Complex term1 = waveFunction[i-1];
            Complex term2 = waveFunction[i].multiply(new Complex(-2,0));
            Complex term3 = waveFunction[i+1];
            secondDerivative[i] = term1.add(term2).add(term3).divide(new Complex(dx * dx, 0));
        }
        
       // Handle boundary points using one-sided differences
        secondDerivative[0] = waveFunction[1].subtract(waveFunction[0]).multiply(new Complex(2,0)).divide(new Complex(dx * dx,0));
        secondDerivative[waveFunction.length - 1] = waveFunction[waveFunction.length - 2].subtract(waveFunction[waveFunction.length - 1]).multiply(new Complex(2,0)).divide(new Complex(dx * dx,0));
        
        // Calculate quantum potential
        double quantumPotential = 0;
        for (int i = 0; i < waveFunction.length; i++) {
            Complex numerator = secondDerivative[i].multiply(new Complex(-1, 0));
            Complex denominator = waveFunction[i];
          
            if (denominator.magnitudeSq() != 0) {
              quantumPotential = -(1.0 / (2 * mass)) * (numerator.divide(denominator)).real;
            } else {
              quantumPotential = 0;
            }
            System.out.println("Quantum Potential at x = " + x[i] + " is: " + quantumPotential);
        }
        return quantumPotential;
    }

    public static void main(String[] args) {
        // Example usage
        double mass = 1.0;
        double[] x = {0.0, 0.1, 0.2, 0.3, 0.4, 0.5};
        Complex[] waveFunction = {
                new Complex(1.0, 0.0),
                new Complex(1.2, 0.2),
                new Complex(1.5, 0.5),
                new Complex(1.2, 0.2),
                new Complex(1.0, 0.0),
                new Complex(0.8, -0.2)
        };

        calculate(waveFunction, x, mass);
    }
}