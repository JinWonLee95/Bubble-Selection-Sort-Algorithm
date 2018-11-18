import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Selection_Sort {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("data04.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("data04_Sort_Sel.txt"));

		String content = br.readLine();

		String[] numbers = content.split(",");
		int[] array = new int[numbers.length];

		for (int i = 0; i < numbers.length; i++) {
			array[i] = Integer.parseInt(numbers[i]);
		}

		long startTime = System.nanoTime();
		SelectionSort(array);
		long endTime = System.nanoTime();

		long time = endTime - startTime;
		System.out.println("걸린 시간: " + time);

		for (int i = 0; i < array.length; i++) {
			bw.write(array[i] + ",");
		}
		bw.close();

	}

	public static void SelectionSort(int[] array) {
		int start = 0;
		int temp;
		
		while (start < array.length - 1) {
			for (int i = start+1; i <= array.length - 1; i++) {
				if (array[i] < array[start]) {
					temp = array[start];
					array[start] = array[i];
					array[i] = temp;
				}
			}
			start++;
		}
	}

}
