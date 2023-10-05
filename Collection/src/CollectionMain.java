import java.util.*;
public class CollectionMain {
	public static void main(String[]args) {
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(10);
		lst.add(5);
		lst.add(23);
		lst.add(32);
		
		System.out.println("Linked List: " + lst);
		System.out.println("Search " + lst.contains(25));
		System.out.println("Index of " + lst.indexOf(lst));
		System.out.println("Index of " + lst.lastIndexOf(10));
		
		lst.remove(0);
		System.out.println("After remove: " + lst);
		System.out.println("Size of list " + lst.size());
		System.out.println("");
	}
}
/*
Collection is a framework which includes 
-interface
-classes
-methods
All the API's are available in the package
called as java.util.
Collection interface is a root interface for 
all other API's of collection Hierarchy 

1)List interface:
List interface is used to store duplicate objects and it is order collection 
There are 2 implementations
i)Linked-List: Insertion & Deletion at the end of the list. Access the data using indexes.
It is recommended to use whenever you want to add or delete the data at any location in the list. 
ArrayList is faster than LinkedList

2)Set Interface:
Set interface is used to store unique objects 
Set is unordered collection. There are 2 
implementations 
i)HashSet: It is an unordered collection and faster than tree set. 
Treeset is sorted is data while Hashset is unsorted. Map is not inheriting collection interface 

*/