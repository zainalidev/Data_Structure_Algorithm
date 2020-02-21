class LinearSearch {
	public static String linerSearch(String[] arr,String search) {
		for (int i=0;i<arr.length;i++) {
			if (arr[i].equalsIgnoreCase(search)) {
				return search;
			}
		}
		return null;
	}
	public static void main(String[] args) {
		String[] arr={"Ali","Ahmed","Zain","Altamash","Jamshoro","Larkana"};
		String search="Aliki";
		if (linerSearch(arr,search)!=null)
			System.out.println("String is found");
		else 
			System.out.println("String is not found");
	}
}