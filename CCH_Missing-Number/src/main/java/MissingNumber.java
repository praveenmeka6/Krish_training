public class MissingNumber {
	
	public int[] findMissingNo(String str) {
		String[] strArr = str.split(" ");
		int[] intArr = new int[strArr.length];
		
		for (int i = 0; i < strArr.length; i++) {
			intArr[i] = Integer.parseInt(strArr[i]);
		}
		
		int n = intArr.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (intArr[j - 1] > intArr[j]) {
					// swap elements
					temp = intArr[j - 1];
					intArr[j - 1] = intArr[j];
					intArr[j] = temp;
				}

			}
		}
		
		int missing = 0;
		int count = 0;
		int firstNo = intArr[0];
		for (int i=0;i<intArr.length;i++) {
			if(firstNo == intArr[i]) {
				firstNo++;
			}
			else
			{
				missing = firstNo;
				count++;
				firstNo = firstNo+2;
				
			}
			
		}
		
		int[] res = {count, missing};
		return res;
	}
}
