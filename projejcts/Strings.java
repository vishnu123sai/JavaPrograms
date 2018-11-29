package projejcts;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abcdefghijklmnopqrst";
		System.out.println(a.charAt(0));
		System.out.println(a.length());
		System.out.println(a.substring(2)+"\n"+a.substring(2, 10));
		System.out.println(a.codePointAt(3)+"\t " +a.codePointBefore(3));// code points at returns the ascii value of the letter a t the particular index
		System.out.println("qwdqweqqwqqwwqwqwqwqqwqqq".length());
		System.out.println(a.concat("uvwxyz"));
		System.out.println(a.startsWith("abc"));
		System.out.println(a.substring(3)+"\n"+a.substring(1,5));
		System.out.println(a.equals("abcdefghijklmnopqrst"));
		char [] b=a.toCharArray();
		for (char l:b)
		{
			System.out.println(l);
		}
		System.out.println(a.contains("abc"));//true
		System.out.println(a.equalsIgnoreCase("abcdefghijklmnOpqrsT"));//true
		System.out.println(a.matches("abcdefghijklmnopqrst"));//true
		System.out.println(a.replace("abc", "xyz"));//xyzdefghijklmnopqrst
		System.out.println(a.toString()== a);//true
		System.out.println(String.valueOf(1.0002));// return the all the objects as string use to convert to string from any other DT
		System.out.println(a.split(" "));
		String [] c= a.split("-");
		System.out.println(c);
		for(String l:c)
		{
			System.out.println(l);
		}

		System.out.println(b.getClass().getClassLoader()+" \t "+a.getClass().getClassLoader());
		System.out.println(a.getBytes().length);
		byte[] d =a.getBytes();
		for(byte l:d)
		{
			System.out.println(l);
		}
		StringBuffer sb = new StringBuffer(a);
		System.out.println(sb);
		System.out.println(sb.append("uvwxyz12345678901"));
		System.out.println(sb.capacity()+"\n"+sb.length());
		System.out.println(sb.insert(1, "vishnu")+"            "+sb.length() );
		System.out.println(sb.reverse());
		sb.trimToSize(); // trim the capacity of a string to  length o the string
		sb.reverse();
		System.out.println(sb.length()+"      "+sb.capacity());
		sb.delete(1, 7);
		System.out.println(sb);
		System.out.println(sb.deleteCharAt(sb.length()-1));
		sb.setCharAt(sb.length()-1, 'Q');
		System.out.println(sb);
		
		
		
	}

}
