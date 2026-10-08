import java.util.Random;
public class DieRollar {
    static void main(){
        int die1, die2, die3, roll, sum;


        Random rnd = new Random();
        die1 = rnd.nextInt(6)+1;
        die2 = rnd.nextInt(6)+1;
        die3 = rnd.nextInt(6)+1;
        roll = 0;

        System.out.printf("%6s\t%6s\t%6s\t%6s\t%6s\n", "roll", "die1", "die2", "die3", "sum" );

        while( die1 != die2 || die2 != die3){

            die1 = rnd.nextInt(6)+1;
            die2 = rnd.nextInt(6)+1;
            die3 = rnd.nextInt(6)+1;

            roll ++;

            sum = die1 + die2 + die3;

            System.out.printf("%6d\t%6d\t%6d\t%6d\t%6d\n", roll, die1, die2, die3, sum );

        }
    }

}
