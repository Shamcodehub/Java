Collections FrameWork
	--A collection is a object that represents a group of object ex- dress bag
	
		

Array disadvantage

1)It occupies continous memory
2)In advance we know size
3)unused memory is wasted
4)Data Manipulation bkt difficult

above difficulties are overcome by collections.

1)Reduces Programming effort-->providing data structure and algorithms.
2)Increases Performance
3)Reduces the effort required to learn APIs

Collections FrameWork consists of

1)Collection Interface in different types of collection 
	set
	list
	maps
2)General purpose implementation
3)Special-purpose implementation
4)Legacy implementation---> collection classes from earlier release such as Stack,Vector
5)Concurrent-->Simultaneous-Parallel excution -- Multi-threading

interface Collection-->java.util.Collection,java.util.Map
java.util.Collection		
	--The root interface in the collection hierarchy. A collection represents a group of objects, 
	  known as its elements.
	--Some collections allow duplicate elements and others do not. Some are ordered and others unordered.
	--The JDK does not provide any direct implementations of this interface:
	--it provides implementations of more specific subinterfaces like Set and List. 
	   This interface is typically used to pass collections around and 
	   manipulate them where maximum generality is desired.

List-->Array List,LinkedList

   -Insertion Order is maintained
   -Duplicate values are allowed
   -An ordered collection (also known as a sequence)
   -The user of this interface has precise control over where in the list each element is inserted.
   -The user can access elements by their integer index (position in the list), and search for elements in the list.

Set-->HashSet,LinkedHashSet,TreeSet
   -No duplicates are allowed
   -No order is maintained

java.util.Map
Map-->HashMap,LinkedHashMap,TreeMap
Before map Dictionary - Abstract Class

    -It is collection of pair of object
    -Collection of key value pair
    -An object that maps keys to values. A map cannot contain duplicate keys; each key can map to at most one value.
    -Key does not allow duplicate
    -Values allows duplicate

-------------------------------------------------------------------------------------------------------------
Array-->collection of similar data types

public class Looping
{
public static void main(String[] args)
{

int arr[] = new int[3];
arr[0]=1;
arr[1]=1;
arr[2]=1;// add string
arr[3]=1;

Object i=arr;
System.out.println(arr[3]);

}
}
---------------------------
-->Insertion and deletion purpose we use "LinkedList"
  

-->fetching and getting purpose we use "ArrayList"
-->Growable Array-->dyanamic Array
-->Data Retrieval Faster

public class Looping
{
public static void main(String[] args)
{
	
	ArrayList al = new ArrayList();

		al.add("trisha");
		al.add("samantha");
		al.add(5);
		al.add(true);
		al.add(5.4f);
		al.add('s');
	System.out.println(al +  " ");
	    al.add(2, "nayanthara");
	System.out.println(al);
	System.out.println(al.contains("samantha"));
	System.out.println(al.get(5));
	//al.clear();
	System.out.println(al);
	
	ArrayList al2 = new ArrayList();
	al2.add(al);
	System.out.println(al2);
	al2.add(55);
	al2.add("regina");
	al2.add(6.9f);
	System.out.println(al2);
	
	System.out.println(al2.isEmpty());
	System.out.println(al2.size());
	System.out.println(al2.containsAll(al));
	
}
} 
-------------------------

	Vector List
	
	--Vector implements a dynamic array which means it can grow or shrink as required
	--Vector is synchronized and has some legacy methods that the collection framework does not contain.

public class Looping
{
public static void main(String[] args)
{
	
	Vector vr = new Vector(8);
	vr.add(1);
	vr.add(3);
	vr.add(2);
	vr.add(1);
	vr.add(3);
	vr.add(2);
	vr.add(1);
	vr.add(3);
	vr.add(2);
	vr.add(2);
	vr.add(1);
	vr.add(3);
	vr.add(2);
	

	for(Object item : vr)
	{
		System.out.println(item+ " ");
	}
	System.out.println(vr.capacity());
}
}

----------------------------------------------------------------

set-->hashset,Treeset

	
	public class CollectionDemo
	{
	public static void main(String[] args)
	{
	
	TreeSet tr = new TreeSet();
	tr.add(1);
	tr.add(24);
	tr.add(3);
	tr.add(10);
	tr.add(1);
	tr.add(2);
	tr.add(15);
	
	System.out.println(tr);
	}

}
------------------------------------------------------

public class Looping
{
public static void main(String[] args)
{
	
	HashSet tr = new HashSet();
	tr.add(2);
	tr.add(72);
	tr.add(1);
	tr.add(22);
	tr.add(1);
	tr.add(52);
	tr.add(3);
	tr.add(2);
	tr.add(21);
	tr.add(1);
	tr.add(15);
	
	System.out.println(tr);
	}

}
--------------------------------------------------------------------
Map

HashMap-->It allows null

public class Looping
{
public static void main(String[] args)
{
	HashMap<String,String> list = new HashMap<String,String>();
	
	list.put("shinchan","9943333720");
	list.put("trisha","9943387654");	
	list.put("samu","9943338764");
	list.put("deepika","9943338764");

		list.forEach((k,v) -> System.out.println("Name = " + k + "number " + v));
		System.out.println(list.get("samu"));
}
}
---------------------------------------------

public class Looping
{
public static void main(String[] args)
{
	Hashtable<String,String> list = new Hashtable<String,String>();
	
	list.put("shinchan","9943333720");
	list.put("trisha","9943387654");	
	list.put(null,"9943338764");
	list.put("deepika","9943338764");

		list.forEach((k,v) -> System.out.println("Name = " + k + "number " + v));
		System.out.println(list.get("samu"));
}
}
