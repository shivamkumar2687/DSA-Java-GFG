package HWi;
import java.util.Scanner;

public class hero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of villians ");
        int n = sc.nextInt();
        System.out.println("Enter the total no of Heroes ");
        int hero = sc.nextInt();
        System.out.println("Enter the health of hero");
        int health = sc.nextInt();
        System.out.println("Enter the each villian as in array of integers");
        int[] villians = new int[n];
        for (int i = 0; i < n; i++) {
            villians[i] = sc.nextInt();
    }

     System.out.println(canWin(villians, hero, health));
    

}
 private static int canWin(int[] villains, int heroCount, int heroHealth) {
        int i = villains.length-1; // villain index
        int j = 0; // hero index
        int currHealth = heroHealth;

        while (i >= 0 && j < heroCount) {
            int v = villains[i];
            if (currHealth > v) {
                currHealth -= v; // hero wins, continues with reduced health
                i--;
            } else if (currHealth == v) {
                // both die
                j++;
                i--;
                currHealth = heroHealth;
            } else {
                // villain wins
                j++;
                currHealth = heroHealth;
            }
        }
        if(i<0) return 0;
        return i+1;
        //eturn 1;
    }
}
