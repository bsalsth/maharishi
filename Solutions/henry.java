
	static int henry (int i, int j){
		int max =0, min = 0 , first = 0, second = 0, counter = 0;
		if(i > j){
			max = i;
			min = j;
		}
		else {
			max = j;
			min = i;
		}
		int k = 5;
		while(counter != max){
			if(isPerfectNo(k)){
				counter++;
				if(counter == min)
					first = k;
			}
			k++;
		}
		second = k-1;
		return first+second;

	}
	static boolean isPerfectNo(int n){
		int sum = 0;
		for(int i = 1; i <= n/2; i++){
			if(n % i == 0)
				sum += i;
		}
		if(sum == n) return true;
		return false;
	}
