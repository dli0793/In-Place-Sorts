
public class ArrayMethods1 {

	public static void main(String[] args) 
	{
		int[] list1 = {5, 2, 1, 7, 9, 4};
		double[] list2 = {1.42, 2.5, 5.6, 4.7, 1.3, 3.45};
		String[] list3 = {"a", "E", "b", "z", "u", "d"};
		
		//insertionSort(list1);
		//selectionSort(list2);
		bubbleSort(list3);
		System.out.println(java.util.Arrays.toString(list3));
	}
	
	
	public static void insertionSort(int[] list1)
	{
		
	}
	
	
	public static void selectionSort(double[] list1)
	{
		
	}
	
	public static void bubbleSort(String[] list1)
	{
		String tempStr;
		
		for(int i=0;i<list1.length-1;i++)
		{
			if(list1[i].compareTo(list1[i+1])<0)
			{
				tempStr = list1[i];
				list1[i] = list1[i+1];
				list1[i+1] = tempStr;		 
			}
		}
		
		
	}
	
	public static void swapIndex(int index1, int index2)
	{
		int temp = index1;
		index1 = index2;
		index2 = temp;
	}

}
