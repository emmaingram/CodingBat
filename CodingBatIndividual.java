public class CodingBatIndividual {
	// Author: Emma Ingram
	// tenRun exercise
	public int[] tenRun(int[] nums) {
		for(int i=0; i<nums.length; i++) {
			if(nums[i] % 10 == 0) {
				for(int j=i+1; j<nums.length && nums[j] % 10 != 0; j++) {
					nums[j] = nums[i];
				}
			}
		}
		
		return nums;
	}
	/*
	 	Expected This Run
	 	tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]	[2, 10, 10, 10, 20, 20]	OK	
		tenRun([10, 1, 20, 2]) → [10, 10, 20, 20]	[10, 10, 20, 20]	OK	
		tenRun([10, 1, 9, 20]) → [10, 10, 10, 20]	[10, 10, 10, 20]	OK	
		tenRun([1, 2, 50, 1]) → [1, 2, 50, 50]	[1, 2, 50, 50]	OK	
		tenRun([1, 20, 50, 1]) → [1, 20, 50, 50]	[1, 20, 50, 50]	OK	
		tenRun([10, 10]) → [10, 10]	[10, 10]	OK	
		tenRun([10, 2]) → [10, 10]	[10, 10]	OK	
		tenRun([0, 2]) → [0, 0]	[0, 0]	OK	
		tenRun([1, 2]) → [1, 2]	[1, 2]	OK	
		tenRun([1]) → [1]	[1]	OK	
		tenRun([]) → []	[]	OK
	*/
	
	// Author: Emma Ingram
	// scoresIncreasing exercise
	public boolean scoresIncreasing(int[] scores) {
		for(int i=1; i<scores.length; i++) {
			if(scores[i] < scores[i-1]) {
				return false;
			}
		}
		
		return true;
	}
	/*
		Expected This Run
		scoresIncreasing([1, 3, 4]) → true	true	OK	
		scoresIncreasing([1, 3, 2]) → false	false	OK	
		scoresIncreasing([1, 1, 4]) → true	true	OK	
		scoresIncreasing([1, 1, 2, 4, 4, 7]) → true	true	OK	
		scoresIncreasing([1, 1, 2, 4, 3, 7]) → false	false	OK	
		scoresIncreasing([-5, 4, 11]) → true	true	OK
	*/
	
	// Author: Emma Ingram
	// repeatEnd exercise
	public String repeatEnd(String str, int n) {
		String lastCharacters = str.substring(str.length()-n);
		String newStr = "";
		for(int i=0; i<n; i++) {
			newStr = newStr + lastCharacters;
		}
		
		return newStr;
	}
	/*
		Expected This Run
	  	repeatEnd("Hello", 3) → "llollollo"	"llollollo"	OK	
		repeatEnd("Hello", 2) → "lolo"	"lolo"	OK	
		repeatEnd("Hello", 1) → "o"	"o"	OK	
		repeatEnd("Hello", 0) → ""	""	OK	
		repeatEnd("abc", 3) → "abcabcabc"	"abcabcabc"	OK	
		repeatEnd("1234", 2) → "3434"	"3434"	OK	
		repeatEnd("1234", 3) → "234234234"	"234234234"	OK	
		repeatEnd("", 0) → ""	""	OK	
	*/
	
	// Author: Emma Ingram
	// canBalance exercise
	public boolean canBalance(int[] nums) {
		int left = 0;
		int right = nums[nums.length-1];
		for(int i=0; i<nums.length-1; i++) {
			left += nums[i];
		}
		
		for(int i=nums.length-2; i>0; i--) {
			if(left == right) {
				return true;
			}
			
			left -= nums[i];
			right += nums[i];
		}
		
		return (left == right);
	}
	/*
		Expected This Run
		canBalance([1, 1, 1, 2, 1]) → true	true	OK	
		canBalance([2, 1, 1, 2, 1]) → false	false	OK	
		canBalance([10, 10]) → true	true	OK	
		canBalance([10, 0, 1, -1, 10]) → true	true	OK	
		canBalance([1, 1, 1, 1, 4]) → true	true	OK	
		canBalance([2, 1, 1, 1, 4]) → false	false	OK	
		canBalance([2, 3, 4, 1, 2]) → false	false	OK	
		canBalance([1, 2, 3, 1, 0, 2, 3]) → true	true	OK	
		canBalance([1, 2, 3, 1, 0, 1, 3]) → false	false	OK	
		canBalance([1]) → false	false	OK	
		canBalance([1, 1, 1, 2, 1]) → true	true	OK
	*/
}
