import java.util.Scanner;

public class DislikeofThrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int k = sc.nextInt();
            int i=1, s=0;
            while(k != 0){
              if(i%3 != 0 && i%10 != 3){
                s=i;
                k--;
              }
             i++;
            }
            System.out.println(s);
        }
    }
}
