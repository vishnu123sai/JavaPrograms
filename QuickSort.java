
public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {4,2,1,9,3,7,5,6,0,8};
		quickSort(a,0,a.length-1);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

	private static void quickSort(int[] a, int start, int end) {
		
		// TODO Auto-generated method stub
		
		if(start<end)
		{
			int p = partition(a,start,end);
			quickSort(a,start,p-1);
			quickSort(a,p+1,end);
		}
	
		
	}

	private static int partition(int[] a, int start, int end) {
		// TODO Auto-generated method stub
		int pivot = a[end];
		int pi=start;
		for(int i=start;i<end;i++)
		{
			if(a[i]<=pivot)
			{
				swap(a,i,pi);
				pi++;
			}
		}
		swap(a,pi,end);
		return pi;
	}

	private static void swap(int[] a, int pi, int end) {
		// TODO Auto-generated method stub
		int temp=a[pi];
		a[pi]=a[end];
		a[end]=temp;
		
	}

}
