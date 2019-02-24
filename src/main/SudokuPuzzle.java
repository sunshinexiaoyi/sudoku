package main;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import  org.hamcrest.SelfDescribing;
/**
 * @program: sudoku
 * @description: main.SudokuPuzzle Data Info
 * @author: wuxy
 * @create: 2019-02-21 22:33
 **/
public class SudokuPuzzle {
	private int[][] originalArray={
			{-1,6,-1,3,5,4,-1,9,-1},
			{9,-1,5,8,-1,-1,6,-1,3},
			{-1,4,-1,-1,-1,-1,-1,8,-1},
			{6,-1,-1,4,-1,-1,-1,1,-1},
			{8,7,2,-1,9,-1,-1,6,-1},
			{-1,-1,-1,-1,3,6,8,-1,9},
			{3,-1,1,7,-1,2,-1,-1,-1},
			{-1,-1,6,-1,-1,-1,9,3,-1},
			{4,-1,-1,9,-1,3,1,-1,6},
	};
	private int[][] currentArray;
	private ArrayList<int[][]> traceList;

	public void displayOriginal(){

		String showStr = "";

		showStr += String.format("    *** CURRENT GRID ***  \n");
		showStr += String.format("    0 1 2   3 4 5   6 7 8  \n");
		showStr += String.format("   =======================  \n");
		showStr += String.format("0 | %d %d %d | %d %d %d | %d %d %d |\n", originalArray[0][0],originalArray[0][1],originalArray[0][2],originalArray[0][3],originalArray[0][4],originalArray[0][5],originalArray[0][6],originalArray[0][7],originalArray[0][8]);
		showStr += String.format("1 | %d %d %d | %d %d %d | %d %d %d |\n", originalArray[1][0],originalArray[1][1],originalArray[1][2],originalArray[1][3],originalArray[1][4],originalArray[1][5],originalArray[1][6],originalArray[1][7],originalArray[1][8]);
		showStr += String.format("2 | %d %d %d | %d %d %d | %d %d %d |\n", originalArray[2][0],originalArray[2][1],originalArray[2][2],originalArray[2][3],originalArray[2][4],originalArray[2][5],originalArray[2][6],originalArray[2][7],originalArray[2][8]);
		showStr += String.format("   =======|=======|=======  \n");
		showStr += String.format("3 | %d %d %d | %d %d %d | %d %d %d |\n", originalArray[3][0],originalArray[3][1],originalArray[3][2],originalArray[3][3],originalArray[3][4],originalArray[3][5],originalArray[3][6],originalArray[3][7],originalArray[3][8]);
		showStr += String.format("4 | %d %d %d | %d %d %d | %d %d %d |\n", originalArray[4][0],originalArray[4][1],originalArray[4][2],originalArray[4][3],originalArray[4][4],originalArray[4][5],originalArray[4][6],originalArray[4][7],originalArray[4][8]);
		showStr += String.format("5 | %d %d %d | %d %d %d | %d %d %d |\n", originalArray[5][0],originalArray[5][1],originalArray[5][2],originalArray[5][3],originalArray[5][4],originalArray[5][5],originalArray[5][6],originalArray[5][7],originalArray[5][8]);
		showStr += String.format("   =======|=======|=======  \n");
		showStr += String.format("6 | %d %d %d | %d %d %d | %d %d %d |\n", originalArray[6][0],originalArray[6][1],originalArray[6][2],originalArray[6][3],originalArray[6][4],originalArray[6][5],originalArray[6][6],originalArray[6][7],originalArray[6][8]);
		showStr += String.format("7 | %d %d %d | %d %d %d | %d %d %d |\n", originalArray[7][0],originalArray[7][1],originalArray[7][2],originalArray[7][3],originalArray[7][4],originalArray[7][5],originalArray[7][6],originalArray[7][7],originalArray[7][8]);
		showStr += String.format("8 | %d %d %d | %d %d %d | %d %d %d |\n", originalArray[8][0],originalArray[8][1],originalArray[8][2],originalArray[8][3],originalArray[8][4],originalArray[8][5],originalArray[8][6],originalArray[8][7],originalArray[8][8]);
		showStr += String.format("   =======================  \n");

		// decide how to handle empty spaces
		String toEmptySpaceStr = showStr.replace("-1"," ");
		System.out.print(toEmptySpaceStr);
		System.err.print("错误信息");
	}

	public void displayGrid(){
	}

	private void formatPrint(int[][] dataArray,String title){

	}

	@Test
	public void test(){
		displayOriginal();
	}

	@Override
	public String toString() {
		return "SudokuPuzzle{" +
				"originalArray=" + Arrays.toString(originalArray) +
				", currentArray=" + Arrays.toString(currentArray) +
				", traceList=" + traceList +
				'}';
	}
}
