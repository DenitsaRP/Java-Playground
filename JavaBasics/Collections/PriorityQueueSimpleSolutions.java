package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueSimpleSolutions {

	public static void main(String[] args) {

		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Red");
		queue.add("Green");
		queue.add("Orange");
		queue.add("White");
		queue.add("Black");
		System.out.println("Elements of the Priority Queue: " + queue);

		System.out.println();
		for (String qu : queue) {
			System.out.print(qu + " ");
		}

		// add all the elements of a priority queue to another priority queue
		System.out.println();
		PriorityQueue<String> queue2 = new PriorityQueue<String>();
		queue2.add("Gray");
		queue2.addAll(queue);
		System.out.println(queue2);

		System.out.println();
		// insert a given element into a priority queue
		System.out.println();
		queue2.offer("Pink");
		System.out.println("Original Priority Queue: " + queue2);
		System.out.println("The new Priority Queue after adding \"Pink\": " + queue2);

		// remove all the elements from a priority queue
		System.out.println();
		System.out.println("Original Priority Queue: " + queue2);
		queue2.clear();
		System.out.println("The New Priority Queue: " + queue2);

		// count the number of elements in a priority queue
		System.out.println();
		System.out.println("Size of Priority Queue is: " + queue.size());

		// compare two priority queues
		System.out.println();
		PriorityQueue<String> queue3 = new PriorityQueue<String>();
		queue3.addAll(queue);
		queue3.add("Gray");
		queue3.poll();
		System.out.println(queue);
		System.out.println(queue3);
		for (String elem : queue) {
			System.out.print(queue3.contains(elem) ? "Yes" : "No");
		}
		
		// retrieve the first element of the priority queue
		System.out.println();
		System.out.println("The first element of the Queue: " + queue.peek());
		
		//retrieve and remove the first element.
		System.out.println();
		System.out.println("Original Priority Queue: "+ queue3);
		System.out.println("Removes the first element: " + queue3.poll());
		System.out.println("\"Priority Queue after removing first element: " + queue3);
	
		//convert a priority queue to an array containing all of the elements of the queue.
		System.out.println();
		List<String> list = new ArrayList<String>(queue3);
		System.out.println("All of the elements in the queue to ArrayList" + list);
		
		//convert a Priority Queue elements to a string representation.
		System.out.println();
		String str = queue3.toString();
		System.out.println(str);
		
		//change priorityQueue to maximum priority queue
		PriorityQueue<Integer> queue4 = new PriorityQueue<Integer>();
		queue4.add(1);
		queue4.add(5);
		queue4.add(4);
		queue4.add(0);
		queue4.add(12);
		queue4.add(25);
		
		System.out.println("Original Priority Queue: " + queue4);
		Integer val = null;
		while((val = queue4.poll()) != null ) {
			System.out.print(val + " ");
		}
	}

}
