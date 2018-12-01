import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
	public static void main(String args[])
	{
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		List l = Arrays.asList(a);
		ArrayList l1 = (ArrayList) l.stream().distinct().collect(Collectors.toList());
		l1.forEach(x->System.out.println(x));
	}

}
