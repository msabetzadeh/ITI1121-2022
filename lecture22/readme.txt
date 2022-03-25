
implementations of the iterator as seen in class

00: demo if the problem: from inside and from outside


01: in the class LinkedList, with a new reference variable
=> cannot have more than one iterator
=> LinkedList shouldn't be "seen as" an iterator

02: as a new top level class LinkedListIterator which implements iterator
=> problems with 01 are addressed, but we have to change to  "package" (or "protected" which includes package) 
several items in LinkedList

03: Move LinkedListIterator which implements iterator as a nested class
=> back to private for all the items of LinkedList.
=> It is strange to have an instance of LinkedListIterator without a 
LinkedList, and it is cumbersome to have to have a reference to the 
iterated LinkedList

04: Make  LinkedListIterator an inner class
=> only exists as part of a LinkedList. Doesn't need a reference to that list. Awsome.

05: using java's own interfaces
LinkedListIterator implements java.util.Iterator<E>
and 
LinkedList Implements Iterable<E> :

		public interface Iterable<E> {
			public Iterator<E> iterator();
		}

now LinkedList instances can be iterated with the new for loop:
 for(Type i:list){

 }
 where list is a LinkedList<Type>