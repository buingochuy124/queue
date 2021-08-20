package ASM;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class queue {
	
	Queue<Integer> Q = new LinkedList<Integer>();

	int count = 0;
	int size(int count) {
		return count;
	}
	void input() {
		Q.add(5);
		Q.add(6);
		Q.add(7);
		Q.add(8);
		Q.add(9);
	}
	void output() {
		
			System.out.println(Q);
		
	}

	Boolean IsFull(int n) {
        if(n <= size(count)) {
        	System.out.print("queue full");
        	return true;
        }
        else {
        	return false;
        }
    }
	
	Boolean IsEmpty() {
		return (Q.size() == 0);
	}
	void enqueue(int n) {
		if (IsFull(n) == true) {
			System.out.print("queue full can't enqueue more");
		}
		else {
			System.out.println("enter number wanna add to queue");
			Scanner sc = new Scanner(System.in);
			int number = sc.nextInt();
			Q.add(number);
			System.out.println("Enqueue Successfully");
		}
			
		
			
			
	}
	
	void dequeue() {
		if (Q.isEmpty() == true) {
			System.out.print("Queue empty");
		}
		else {
			Q.poll();
		}
	}
	void top() {
		System.out.print(Q.peek()); 
	}

	public static void main(String[] args) {
		
		queue B = new queue();
		
		B.input();
		B.output();
		B.dequeue();
		B.output();
		//B.top();
		B.enqueue(10);
		B.output();
	}

}
