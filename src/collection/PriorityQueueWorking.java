package collection;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueWorking {

	public static void main(String[] args) 
	{
		
	}
	
	public static void minHeapPriorityQueue()
	{
		PriorityQueue<Integer> q = new PriorityQueue();
		q.add(20);
		q.add(50);
		q.add(17);
		q.add(24);
		q.add(18);
		q.add(7);
		q.add(40);
		System.out.println(q);
	}
	
	public static void maxHeapPriorityQueue()
	{
		PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
		q.add(20);
		q.add(50);
		q.add(17);
		q.add(24);
		q.add(18);
		q.add(7);
		q.add(40);
		System.out.println(q);  
	}

}
