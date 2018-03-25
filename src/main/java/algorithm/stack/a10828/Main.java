/*******************************************************************************
 * Copyright (c) 2017 ejpark.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU General Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl-3.0.html
 * 
 * Contributors:
 *     eungjun11@gmail.com - initial API and implementation
 ******************************************************************************/

package algorithm.stack.a10828;

import java.util.Scanner;
import java.util.Stack;

/**
 * 
 * 정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
 *
 * 명령은 총 다섯 가지이다.
 *
 * push X: 정수 X를 스택에 넣는 연산이다.
 * pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * size: 스택에 들어있는 정수의 개수를 출력한다.
 * empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
 * top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 *
 * 첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다.
 * 주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.
 * 
 * 출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.
 * 
 * @author ejpark
 *
 */
public class Main {
	private static Scanner sc = new Scanner(System.in);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int commandCnt = sc.nextInt();
		sc.nextLine();
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i=0; i<commandCnt; i++) {
			String[] commands = sc.nextLine().split(" ");
			String command = commands[0];
			switch(command) {
				// push X: 정수 X를 스택에 넣는 연산이다.
				case "push" :
					int num = Integer.parseInt(commands[1]);
					stack.push(num);
					break;
				//pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
				case "pop" :
					if(stack.isEmpty()) {
						System.out.println(-1);
					}else {
						System.out.println(stack.pop());
					}
					break;
				//size: 스택에 들어있는 정수의 개수를 출력한다.
				case "size" :
					System.out.println(stack.size());
					break;
				//empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
				case "empty" :
					if(stack.isEmpty()) {
						System.out.println(1);
					}else {
						System.out.println(0);
					}
					break;
				//top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
				case "top" :
					if(stack.isEmpty()) {
						System.out.println(-1);
					}else {
						System.out.println(stack.lastElement());
					}
					break;
				default :
			}
		}
//		14           2
//		push 1       2
//		push 2       0
//		top          2
//		size         1
//		empty        -1
//		pop          0
//		pop          1
//		pop          -1
//		size         0
//		empty        3
//		pop
//		push 3
//		empty
//		top
	}
}
