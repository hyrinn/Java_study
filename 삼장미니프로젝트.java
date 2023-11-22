import java.util.Scanner;
public class 삼장미니프로젝트 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = 99;
        int count =0;
        int enter;
        do {
            System.out.print("정답을 추측하여 보시오 :");
            enter = sc.nextInt();
            count++;
            if(enter > num)
                System.out.println("제시한 점수가 높습니다.");
            else if(enter < num)
                    System.out.println("제시한 점수가 낮습니다.");

            else
                break;
        }while(enter != num);
        System.out.print("축하합니다. 시도횟수 =" + count);
    }
}
