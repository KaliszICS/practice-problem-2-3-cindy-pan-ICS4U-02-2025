public class PracticeProblem {

	public static void bubbleSortString(String[] strings) {
		int len = strings.length;
		for (int num = 0; num<len-1; num++){
			for(int at=0; at<len-num-1; at++){
				if (strings[at].compareToIgnoreCase(strings[at+1])>0){
					String temp = strings[at];
					strings[at]= strings[at+1];
					strings[at+1]=temp;
				}
			}
		}
	}

}
