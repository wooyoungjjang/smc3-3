import java.util.Scanner;
public class number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("10개의 랜덤 숫자 중 하나를 맞춰보세요(1~50까지):");
		int c=0;
		int a=sc.nextInt();
		System.out.println();
		for(int i=0;i<10;i++){
			int b= (int) (Math.random()*50+1);
			System.out.println(b+" ");
			if(a==b){
				c=1;
			}
		}
		if(c==1){
			System.out.println("\n정답");
		}
		else System.out.println("\n꽝");
	}

}
