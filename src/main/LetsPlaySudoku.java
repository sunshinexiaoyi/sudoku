package main;

import java.util.Scanner;

/**
 * @program: sudoku
 * @description: uses a menu to allow the user to make moves, erase moves, and undo moves, among other things.
 * @author: wuxy
 * @create: 2019-02-21 22:24
 **/
public class LetsPlaySudoku {
	private boolean writeNumber(){return false;};
	private boolean erase(){return false;};
	private void undo(){};
	private void showGrid(){};
	private void showOriginal(){};
	private void eraseAll(){};

	/**
	 * quit sudoku
	 */
	private void quit(){};

	/**
	 * print help info
	 */
	private void helpInfo(){};

	private void input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入命令：");
		String command = sc.nextLine();
		System.out.println("请输入行：");
		int row = sc.nextInt();
		System.out.println("请输入列：");
		int col = sc.nextInt();
		System.out.println("请输入值：");
		int key = sc.nextInt();

		System.out.println("命令:"+command+";行："+row+";列:"+col+";值:"+key);
	}


	/**
	 * start sudoku
	 */
	public void startPlay(){};

	public static void main(String[] args) {
		LetsPlaySudoku sudoku=new LetsPlaySudoku();
		sudoku.input();
	}

}
