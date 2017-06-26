package sort;
import org.junit.Test;

import com.shankar.arrays.sort.BubbleSort;
import com.shankar.arrays.sort.SelectionSort;


public class SortTest {

	@Test
	public void testBubbleSort() {
		int [] array = new int[]{34, 23, 9, 6, 2, 12, 4, 0, 1};
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.sortAscending(array);
	}
	
	@Test
	public void testSelectionSort() {
		int [] array = new int[]{34, 23, 9, 6, 2, 12, 4, 0, 1};
		SelectionSort selectionSort = new SelectionSort();
		selectionSort.sortAscending(array);
	}

}
