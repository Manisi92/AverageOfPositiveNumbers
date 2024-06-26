import java.util.Scanner;
public class AverageOfPositiveNumbers {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double average = 0.0;
        int count = 0;
        int sum = 0;

        while(true) {
            System.out.println("Give a number: ");
            int num = scan.nextInt();

            if(num == 0){
                break;
            }

            if(num > 0) {
                count++;
                sum+=num;
            }
        }

        if(count == 0){
            System.out.println("Cannot calculate the average");
        } else {
            average = sum / count;
            System.out.println(average);
        }
    }
}
