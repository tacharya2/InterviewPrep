import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnswerMeMath {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Do you need us come over for the estimate(cost you flat fee $50.00)? Yes or No: ");
        String isEstimate = br.readLine().trim();

        if(IsConsent(isEstimate)) {

            System.out.print("Enter the length(ft) of the field (l): ");
            double length = Double.parseDouble(br.readLine().trim());

            System.out.print("Enter the width(ft) of the field (b): ");
            double width = Double.parseDouble(br.readLine().trim());

            System.out.print("How many time wiring: ");
            double times = Double.parseDouble(br.readLine().trim());

            System.out.print("Rate(per yard) of the wire: ");
            double rate = Double.parseDouble(br.readLine().trim());

            System.out.println("Thanks, your total cost would be around USD " + costCalculator(length, width, times, rate, isEstimate));
        }else {
            System.out.println("Thanks, we will schedule an estimator at your location.\n" +
                    "An agent will reach out to you at their earliest convenience to schedule an appointment");
        }
    }
    public static double costCalculator(double length, double width, double times, double rate, String isEstimate){
        final double laborCost= 150.5;
        final double convenienceFee = 10.00;
        final double estimateFee = 50.00;

        double circumference = 2*(length + width) /3.0;

        double cost = (times * circumference * rate)+ laborCost + convenienceFee;

        if(IsConsent(isEstimate)){
            return cost;
        }else{
           return estimateFee;
        }
    }
    public static boolean IsConsent(String isEstimate){

        return !isEstimate.equalsIgnoreCase("Yes");
    }
}