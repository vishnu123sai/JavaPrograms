import java.io.*;
import java.util.*;
public class BinaryHexaOctaConv {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		int num = Integer.parseInt(br.readLine());
		System.out.println("Number is :");
		System.out.println(num);
		System.out.println("Binary of the  num is :");
		System.out.println(Integer.toBinaryString(num));
		System.out.println("Hexa of a num : ");
		System.out.println(Integer.toHexString(num));
		System.out.println("Ocatl of the num is ;");
		System.out.println(Integer.toOctalString(num));
		
		
	}

}
