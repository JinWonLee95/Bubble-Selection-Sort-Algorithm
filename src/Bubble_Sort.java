import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Bubble_Sort {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("data04.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("data04_Sort_Bub.txt"));

		String content = br.readLine();

		String[] numbers = content.split(",");
		int[] array = new int[numbers.length];

		for (int i = 0; i < numbers.length; i++) {
			array[i] = Integer.parseInt(numbers[i]);
		}

		long startTime = System.nanoTime();
		BubbleSort(array);
		long endTime = System.nanoTime();

		long time = endTime - startTime;
		System.out.println("걸린 시간: " + time);

		for (int i = 0; i < array.length; i++) {
			bw.write(array[i] + ",");
		}
		bw.close();

	}

	public static void BubbleSort(int[] array) {
		int temp;
		int done = 0; // 완료된 끝자리 갯수

		while (done <= array.length-1) {
			int Current_Index = 0;
			for (int i = Current_Index+1; i < (array.length) - done; i++) {
				if (array[Current_Index] > array[i]) {
					temp = array[i];
					array[i] = array[Current_Index];
					array[Current_Index] = temp;
					Current_Index++;
				} else {
					Current_Index++;
				}
			}
			done++;
		}
	}
}
