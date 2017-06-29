package tw.aaa.myproject.OOPArray;
//未完成
public class arrayTest {
	int[] count =new int[42];
	int[] num =new int[42];
public void random(){
	for(int i=0;i<=10000;i++)
	{int a=(int) (Math.random()*42)+1;
	count[42-1]++;
	}
}
public void sort()
{while(true)
{int a=0;
	for(int i=0;i<count.length-1;i++)
	{
		if(count[i]<count[i+1])
		{
			int temp=0;int temp1=0;
			temp=count[i];
			count[i]=count[i+1];
			count[i+1]=temp;
			
			temp1=num[i];
			num[i]=num[i+1];
			num[i+1]=temp1;
			
		a++;	
		}
		
	}
if(a==0)
	{break;}}
	}

	public static void main(String[] args) {
		arrayTest a=new arrayTest();
	}

}
