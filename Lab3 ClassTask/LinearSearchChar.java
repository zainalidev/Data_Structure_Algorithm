class LinearSearchChar {
	public static char linerSearch(char[] arr,char search) {
		for (int i=0;i<arr.length;i++) {
			if (arr[i]==search) {
				return search;
			}
		}
		return '\0';
	}
	public static void main(String[] args) {
		char[] arr={'a','r','c','d','t','u'};
		char search='m';
		if (linerSearch(arr,search)!='\0')
			System.out.println("Character is found");
		else 
			System.out.println("Character is not found");
	}
}