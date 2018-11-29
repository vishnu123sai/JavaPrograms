package projejct1;

public class Bin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=250;
		Integer i = new Integer(a);
		String s =Integer.toBinaryString(a);
		System.out.println(s);
		System.out.println(Integer.reverse(i));
		s =Integer.toHexString(a);
		System.out.println(s);
		 s =Integer.toOctalString(a);
		System.out.println(s);
		int v= Integer.bitCount(a);
		System.out.println(i.byteValue());// it gives byte value
		System.out.println(i.highestOneBit(i));// keeps first left one as it is and makes all bits to zeros
		System.out.println(i.lowestOneBit(i));// keeps first right one as it is and makes all bits to zeros
		System.out.println(i.numberOfTrailingZeros(i));// actually int is 4 bit that means if input is 8 its binary is 1000 then remaining 28 bits are called leading zeros and right most zeros after '1' in binary representation are trailing zeros 
		System.out.println(i.numberOfLeadingZeros(i));
		System.out.println(i.numberOfTrailingZeros(i));
		
	}

}
