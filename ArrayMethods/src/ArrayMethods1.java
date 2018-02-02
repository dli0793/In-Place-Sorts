
public class ArrayMethods1 {

	public static void main(String[] args) 
	{
		//Testing arrays
		int[] list1 = {1, 4, 4, 5, 2, 4, 3, 17, 0};
		double[] list2 = {1.1, 4.1, 4.2, 5.0, 2.0, 4.0, 3.0, 17.0, 0.0};
		String[] list3 = {"zebra", "tortilla", "abba", "foo", "bar", "aba"};
		
		//Insertion Sort Test
		long start = System.nanoTime();
		insertionSort(list1);
		long end = System.nanoTime();
		long time = end-start;
		System.out.println("Test1 took: " + time + "nanoseconds.");
		System.out.println(java.util.Arrays.toString(list1));
		
		//Selection Sort Test
		start = System.nanoTime();
		selectionSort(list2);
		end = System.nanoTime();
		time = end-start;
		System.out.println("Test2 took: " + time + "nanoseconds.");
		System.out.println(java.util.Arrays.toString(list2));
		
		//Bubble Sort Test
		start = System.nanoTime();
		bubbleSort(list3);
		end = System.nanoTime();
		time = end-start;
		System.out.println("Test3 took: " + time + "nanoseconds.");
		System.out.println(java.util.Arrays.toString(list3));
	}
	
	
	public static void insertionSort(int[] list1)
	{
		for(int i=1;i<list1.length;i++)
		{
			for(int j=i;j>0;j--)
			{
				if(list1[j]<list1[j-1])
				{
					swapIndex(j,j-1,list1);
				}
			}
		}
	}
	
	
	public static void selectionSort(double[] list1)
	{
		for(int i=0;i<list1.length;i++)
		{
			for(int j=i;j<list1.length-1;j++)
			{
				if(list1[i]>list1[j+1])
				{
					double temp = list1[i];
					list1[i] = list1[j+1];
					list1[j+1] = temp;
				}
			}
		}
	}
	
	public static void bubbleSort(String[] list1)
	{
		String tempStr;
		int counter = 1;
		while(counter>0)
		{
			counter = 0;
			for(int i=0;i<list1.length-1;i++)
			{	
				if(list1[i].compareTo(list1[i+1])>0)
				{
					tempStr = list1[i];
					list1[i] = list1[i+1];
					list1[i+1] = tempStr;
					counter = 1;
				}
			}
		}
		
	}
	
	public static void swapIndex(int index1, int index2, int[] list1)
	{
		int temp = list1[index1];
		list1[index1] = list1[index2];
		list1[index2] = temp;
	}
}
