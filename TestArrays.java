package tw.aaa.myproject.OOPArray;

//xxx.java右鍵>>properties>>run/debug settings>>點選右邊xxx名稱>>edit>>
//arguments>>program arguments輸入資料
public class TestArrays {

	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println("ARG[" + i + "]" + args[i]);
		}
	}
}
