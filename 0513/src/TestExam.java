import java.util.Scanner;
public class TestExam {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("500 ������ �ڿ����� �Է��ϼ���.");
		int a=0;
		int b=3;
		int c=7;
		int q=0;
		a=scan.nextInt();
		
		if(a>500){
			System.out.println("����");
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
		System.out.println("1~"+a+"���� "+b+"�� ����̸鼭 "+c+"�� ����� ���� ���� "+q+"�Դϴ�.");
	}
}
