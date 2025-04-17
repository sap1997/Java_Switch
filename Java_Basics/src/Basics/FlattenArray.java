package Basics;

import java.util.ArrayList;
import java.util.List;

public class FlattenArray {
    public static void main(String[] args) {
        Object[] array = {1, 2, new Object[]{3, 4, new Object[]{5}, 6, 7}, 8, 9, 10};

        Integer[] flattenedArray = flatten(array);

        // Print the flattened array
        for (Integer num : flattenedArray) {
            System.out.print(num + " ");
        }
    }

	private static Integer[] flatten(Object[] array) {
		// TODO Auto-generated method stub
		List<Integer> result = new ArrayList<>();
		
		for(Object element : array)
		{
			if(element instanceof Object[])
			{
				Integer[] nestedArray = flatten((Object[]) element);
				for(Integer num:nestedArray)
				{
					result.add(num);
				}
			}
				else if(element instanceof Integer)
				{
					result.add((Integer) element);
				}
			}
		
		return result.toArray(new Integer[0]);
	}
}