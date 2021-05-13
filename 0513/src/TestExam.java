import java.util.Scanner;
public class TestExam {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("500 이하의 자연수를 입력하세요.");
		int a=0;
		int b=3;
		int c=7;
		int q=0;
		a=scan.nextInt();
		
		if(a>500){
			System.out.println("에러");
		}
		
		for(int i=1; i<a;i++){
			if(a>b*c){
				for(int j=1;j<a;j++){
					if(b*j<a){
					if(b*j == c*i){
					int o=b*j;
					q=q+o;
					System.out.println(o);
					
					}
					}
				}
			}
		}
		System.out.println("1~"+a+"까지 "+b+"의 배수이면서 "+c+"의 배수인 수의 합은 "+q+"입니다.");
	}
}
