package chapter2;

import java.util.Arrays;

/**
 * 二维数组中的查找
 * @author wuzijian
 *
 */
public class T4 {
//	public static boolean Find(int target, int [][] array) {
//		if(array == null)
//			return false;
//		boolean result = false;
//		int i = 0;
//		int j = array[i].length-1;
//		while(i < array.length -1 && j > 0) {
//			while(j > 0 && array[i][j] > target)
//				--j;
//			while(i < array.length-1 && array[i][j] < target)
//				++i;
//			if(array[i][j] == target){
//				result = true;
//				System.out.println("["+(i+1)+"]["+(j+1)+"]");
//				break;
//			}
//		}
//		return result;
//    }
	public static boolean Find2(int target, int [][] array) {
		boolean result = false;
		if(array == null) return false;
		int rows = array.length;
		int row = 0;
		int columns = array[row].length;
		int column = columns - 1;
		int current;
		while(row < rows && column >= 0) {
			if((current = array[row][column]) == target) {
				result = true;
				break;
			} else if(current > target) 
				column--;
			else
				row++;
		}
		return result;
	}
	public static void main(String[] args) {
		int[][] a = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		for(int i = 0; i < 4; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
		boolean result = Find2(7, a);
		System.out.println(result);
	}
}
