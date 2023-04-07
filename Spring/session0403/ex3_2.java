public class ex3_2 {
    public static void main(String[] args){
        int i = 1;
        int sum = 0;
        while(i<=100){
            sum += i;
            i++;
        }
        System.out.printf("1~%d까지의 합 : %d", i-1, sum);
    }
}
