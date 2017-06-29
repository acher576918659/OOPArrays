package tw.aaa.myproject.OOPArray;

public class ArrayVariable {
	public void sum(int... a){
		int i=0;
		for(int b:a)
		{
			i=i+b;
			
		}
		System.out.println(i);
	}

	public static void main(String[] args) {
		ArrayVariable a=new ArrayVariable();
		a.sum(1,5);

	}

}
