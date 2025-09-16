package demo.git;

interface Calculate{
	int add(int i,int j);
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate calculate = (int i,int j)->{
			return i+j;
		};
		System.out.println(calculate.add(10, 11));
	}

}
