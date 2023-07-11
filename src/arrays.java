import java.util.Arrays;

public class arrays {
	
	
	// Q2 
	static class Node {
		String data;
		Node next;
		Node(String d) {
			data=d;
			next=null;
		}
	}
	
	static Node head=null;
	static Node tail=null;
	
	public static void addNode(String data) {
//		System.out.println("Adding Node for "+data);
		Node newNode =new Node(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
		}
		else {
			tail.next=newNode;
			tail=newNode;
		}
	}
	
	public static void displayList() {
		Node current =head;
		if(head==null) {
			System.out.println("SIngly list is empty");
			return;
		}
		System.out.println("Nodes of the singly linked list: ");
		while(current !=null) {
			System.out.print(current.data+" ");
			current=current.next;
		}
	}
	
	public static void displayListSize() {
		Node current =head;
		int count=0;
		if(head==null) {
			System.out.println("SIngly list is empty");
			return;
		}
		while(current !=null) {
			count++;
			current=current.next;
		}
		
		System.out.println('\n'+"Linked List Size: "+count);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Question 1
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
		
		// Question 2
		String[] arr5 = {"Apple", "Avocado", "Apricot", "Berry", "Banana", "Orange", "Peach", "Kiwi", "Mango", "Plum"};
		for(String element: arr5) {
			addNode(element);
		}
		displayList();
		displayListSize();
		
	}

}
