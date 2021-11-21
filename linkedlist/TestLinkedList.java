package linkedlist;
import linkedlist.Node;
import linkedlist.LinkedList;
import linkedlist.*;

public class TestLinkedList 
{

	public static void main(String[] args) 
	{
		LinkedList myList=new LinkedList();
		
		Node aNode=new Node();
		aNode.setData("Element 1");
		myList.addNode(aNode);
		aNode = new Node();
		aNode.setData("Element 2");
		myList.addNode(aNode);
		
		Node tempnode=myList.getList();
		do 
		{
			System.out.println(tempnode.getData());
			tempnode=tempnode.getNextNode();
		} while (tempnode!=null);
		
		//**************************************
		//String instance of GenericLinkedList
		//**************************************
		
		//Instantiating a String instance of GenericNode to add Strings in my list collection
		GenericNode<String> stringNode = new GenericNode<>();
		stringNode.setData("Carl");
		
		//Instantiating a String instance of GenericLinkedList
		GenericLinkedList<String> string = new GenericLinkedList<>();
		//Adding a String in my GenericLinkedList<String> object
		string.addNode(stringNode);
		
		stringNode = new GenericNode<>();
		stringNode.setData(", Rose");
		
		//Adding another String in my GenericLinkedList<String> object
		string.addNode(stringNode);
		
		stringNode = new GenericNode<>();
		stringNode.setData(" and Archemetre.");
		
		//Adding another String in my GenericLinkedList<String> object
		string.addNode(stringNode);
		
		System.out.println();
		System.out.print("The names in my collection are ");
		for(String name : string)
			System.out.print(name);
		System.out.println("\n");
		
		//**************************************
		//Integer instance of GenericLinkedList
		//**************************************
		
		//Using an initializer list to instantiate and filling an array of Integer objects
		Integer[] num = {6, 2, 1992};
		GenericNode<Integer> intNode = new GenericNode<>();
		GenericLinkedList<Integer> integer = new GenericLinkedList<>();
		
		/*Using GenericNode<Integer> objects and setting their data to elements of the Integer array, and adding those node objects into
		 * the Integer instance of GenericLinkedList*/
		intNode.setData(num[0]);
		integer.addNode(intNode);
		
		intNode = new GenericNode<>();
		intNode.setData(num[1]);
		integer.addNode(intNode);
		
		intNode = new GenericNode<>();
		intNode.setData(num[2]);
		integer.addNode(intNode);
		
		System.out.print("Using a for each loop to print a collection of Integers representing my birthday");
		for (Integer integers : integer)
			System.out.print(" "+integers);
		System.out.println(".");
		System.out.print("\n");
		
		//**************************************
		//Double instance of GenericLinkedList
		//**************************************
		
		//Instantiating a Double instance of GenericNode and a Double instance of GenericLinkedList to add nodes
		GenericNode<Double> doubleNode = new GenericNode<>();
		GenericLinkedList<Double> doubleList = new GenericLinkedList<>();
		
		//setting the data of each node and adding the node in the collection
		doubleNode.setData(Math.PI);
		doubleList.addNode(doubleNode);
		
		doubleNode = new GenericNode<>();
		doubleNode.setData(Math.E);
		doubleList.addNode(doubleNode);
		
		doubleNode = new GenericNode<>();
		doubleNode.setData(Math.sqrt(2));
		doubleList.addNode(doubleNode);
		
		System.out.print("My list of doubles is:");
		//Using a for each loop to print my collection
		for(Double doubles : doubleList)
			System.out.print(" "+doubles);
		System.out.println(".");
	}//end main

}//end class
