class BinarySearch{
	public static int find(String first[], int p, int q, String search){
    	int mid=0;
        while (p<=q) {
            mid=(p+q)/2;
            if (first[mid].compareTo(search)==0) { 
                return mid;
            } 
            else if (first[mid].compareTo(search)>0) {
                q=mid-1;
            } 
            else if(first[mid].compareTo(search)<0){
                q=mid+	1;
            }
        }
    	 return -1;
    }
	public static void main(String[] args) { 
		String[] s={"Ali","Ahmed","Zain","Raja","Altamash","Jamshoro","Larkana"};
		String search="Ali";
		for (int i=0;i<s.length;i++) 
        {
            for (int j=0;j<s.length-1;j++) 
            {
                if (s[j].compareTo(s[j+1])>0)
                {
                    String temp=s[j];
                    s[j]=s[j+1];
                    s[j+1]=temp;
                }
            }
        }

		if ((find(s,0,s.length-1,search))!=-1) {
			System.out.println("Key Found");	
		}
		else 
			System.out.println("null");
	}
	/*public static void main(String ar[]){
    	String str[] = {"aki","aaaccount","angel","apple","application","black"};
    	String search= "apple";
    	int length = str.length-1;
    	BinarySearchString findStrin = new BinarySearchString();
    	if((findStrin.find(str, 0, length, search))!=-1)
    		System.out.println("found");
    	else
    		System.out.println("null");
	}

  	public int find(String first[], int start, int end, String searchString){
    	int mid = start + (end-start)/2;
    	if(first[mid].compareTo(searchString)==0){
    		return mid;
    	}
    	if(first[mid].compareTo(searchString)> 0){
    		return find(first, start, mid-1, searchString);
    	}else if(first[mid].compareTo(searchString)< 0){
    		return find(first, mid+1, end, searchString);
    	}
    	return -1;
  	}*/
}