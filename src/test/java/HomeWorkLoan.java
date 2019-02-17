import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

public class HomeWorkLoan {
    @Test
    public void HomeWorkLoan () {
float a = 30; //Loan years//
float b = 1000; // Loan sum //
float c = b / a; // sum in a year //
float z = c * 10; // Sum in 10 Years without fee //;
double e = z * 1.1; // sum with fee 10% //;
        System.out.println("Sum in first 10 years: " + e);
        double d = z * 1.08; // sum with fee 8% //
        System.out.println("Sum in second 10 years is: " + d);
        double f = z * 1.06; // sum with fee 6% //
        System.out.println("Sum in third 10 Years is: " + f);
        double g = e + d + f; // total sum /

System.out.println ("Total loan sum: " + g);






    }
}
