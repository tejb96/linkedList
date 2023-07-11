import java.util.Arrays;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"Apple", "Avocado", "Apricot", "Berry", "Banana", "Orange", "Peach", "Kiwi", "Mango", "Plum"};
		System.out.println("Original Array: "+Arrays.toString(arr)); 
		System.out.println("Original array size: "+arr.length+ '\n'); 
		
		String[] arr2 = arr.clone();
		String newFruit = "Grape";
		System.out.println("New fruit: "+newFruit+'\n');
		for(int i=arr2.length-1;i>3;i--) {
			arr2[i]=arr2[i-1];
			arr2[3]=newFruit;
		}
		
		System.out.println("After insertion at index 3 array: "+Arrays.toString(arr2)); 
		System.out.println("After insertion at index 3 array size: "+arr2.length+ '\n');
		
		String[] arr3 = Arrays.copyOf(arr, 11);
//		arr3=Arrays.copyOf(arr, 11);
		for(int i=arr3.length-1;i>3;i--) {
			arr3[i]=arr3[i-1];
			arr3[3]=newFruit;
		}
		
		System.out.println("After insertion at index 3 array: "+Arrays.toString(arr3)); 
		System.out.println("After insertion at index 3 array size: "+arr3.length+ '\n');
		
		String delFruit="Peach";
		System.out.println("Deleted fruit: "+delFruit+'\n');
		
		
		for(int i = 7;i<arr.length;i++) {
			arr[i-1]=arr[i];
		}
		
		System.out.println("After deleting from index 6 of array: "+Arrays.toString(arr)); 
		System.out.println("After deleting from index 6 of array size: "+arr.length+ '\n');
		
		String[] arr4 = Arrays.copyOf(arr,9);
		
		System.out.println("After deleting from index 6 of array: "+Arrays.toString(arr4)); 
		System.out.println("After deleting from index 6 of array size: "+arr4.length+ '\n');
	}

}
