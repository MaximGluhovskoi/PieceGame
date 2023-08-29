import java.util.Scanner;
public class PieceGame{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to start first? (type 1 for yes and 0 for no)");
        boolean userStartFirst = scan.nextInt() == 1;
        int num = 11;
        boolean userWinner = false;
        if  (userStartFirst) {
            while (num > 0)
            {
                System.out.println("Current number of pieces left is " + num);
                System.out.println("Would you like to remove 1 or 2 pieces? (Type 1 or 2)");
                num -= scan.nextInt();
                System.out.println("Current number before computer: " + num);
                if (num == 0)
                {
                    userWinner = true;
                    break;
                }
                num -= computerRun(num);
            }
        }
        else{
            userWinner = true;
            while (num > 0)
            {
                num -= computerRun(num);

                if (num == 0)
                {
                    userWinner = false;
                    break;
                }
                
                System.out.println("Current number of pieces left is " + num);
                System.out.println("Would you like to remove 1 or 2 pieces? (Type 1 or 2)");
                num -= scan.nextInt();
                System.out.println("Current number before computer: " + num);


            }
        }
        if (userWinner){
            System.out.println("Congratulations on Winning!");
        }
        else{
            System.out.println("You Lose!");
        }
    }


    public static int computerRun(int num){
        if (num%3==2){
            return 2;
        }
        else if(num%3==1){
            return 1;
        }
        return (int)(Math.random()*2+1);
    }
    
}