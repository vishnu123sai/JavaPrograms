
public class MergeSort {
	public static void main(String  args[])
	{
		int a[] = {4,2,1,9,3,7,5,6,0,8};
		mergeSort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

	private static void mergeSort(int[] a) {
		// TODO Auto-generated method stub
		if(a.length<2)
			return;
		int mid =a.length/2;
		int left[] = new int[mid];
		int right[] = new int[a.length-mid];
		for(int i=0;i<mid;i++)
			left[i]=a[i];
		for(int i=mid;i<a.length;i++)
			right[i-mid]=a[i];
		
		mergeSort(left);
		mergeSort(right);
		merge(a,left,right);
	}

	private static void merge(int[] a, int[] left, int[] right) {
		// TODO Auto-generated method stub
		int k=0,i=0,j=0;
		while(i<left.length && j<right.length)
		{
			if(left[i]<=right[j])
			{
				a[k]=left[i];
				i++;
			}
			else
			{
				a[k]=right[j];
				j++;
			}
			k++;
		}
		while(i<left.length)
		{
			a[k]=left[i];
			i++;
			k++;
		}
		while(j<right.length)
		{
			a[k]=right[j];
			j++;
			k++;
		}
	}

}
