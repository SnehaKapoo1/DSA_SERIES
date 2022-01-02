package questions.stack;

import java.util.Arrays;

public class TwoStacks_InOneArray {

	int stackArray[];
	int cap, top1, top2;

	TwoStacks_InOneArray(int n) {
		cap = n;
		top1 = -1;
		top2 = cap;
		stackArray = new int[n];
	}

	void push1(int item) {
		if (top1 < top2 - 1) {
			top1++;
			stackArray[top1] = item;
		} else {
			System.out.println("Stack Overflow");
			System.exit(1);
		}
	}

	void push2(int item) {
		if (top1 < top2 - 1) {
			top2--;
			stackArray[top2] = item;
		} else {
			System.out.println("Stack Overflow");
			System.exit(1);
		}
	}

	int pop1() {

		if (top1 >= 0) {
			int popItem = stackArray[top1];
			top1--;

			return popItem;
		} else {
			System.out.println("Stack Underflow");
			System.exit(1);
		}
		return 0;
	}

	int pop2() {

		if (top2 < cap) {
			int popItem = stackArray[top2];
			top2++;

			return popItem;
		} else {
			System.out.println("Stack Underflow");
			System.exit(1);
		}
		return 0;
	}

	int size1() {
		return top1 + 1;
	}

	int size2() {
		return (cap - (top1 + 1));
	}

	void display() {
		for (int i = 0; i < cap; i++) {
			System.out.print(stackArray[i] + " ");
		}
	}

	public static void main(String[] args) {

		TwoStacks_InOneArray ts = new TwoStacks_InOneArray(5);
		ts.push1(5);
		ts.push2(10);
		ts.push2(15);
		ts.push1(11);
		ts.push2(7);
		ts.display();
		
		System.out.println();

		System.out.println(ts.size1());
		System.out.println(ts.size2());
		
		System.out.println("Popped element from stack1 is: " + ts.pop1());
		ts.push2(40); System.out.println("Popped element from stack2 is: " +
		ts.pop2()); System.out.println("Popped element from stack1 is: " +
		ts.pop1());
		 
		ts.display();
		

	}

}
