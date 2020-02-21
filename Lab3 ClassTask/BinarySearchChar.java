class BinarySearchChar {
	public static void main(String ar[]){
    	char str[]={'a','r','c','d','t','u'};
        for(int i=0;i<str.length;i++)
        {
            for(int j=0;j<str.length-1;j++){
            if((int)str[j]>(int)str[j+1])
                {
                    char temp=str[j];
                    str[j]=str[j+1];
                    str[j+1]=temp;
                }
            }
        }   
        System.out.println("After sorting Array is");
        for(int i=0;i<str.length;i++)
        {
            System.out.print(str[i]+" ");
        }
            System.out.println();
    	    char search='0';
            int index=find(str,0,str.length-1,search);
            if(index>=0)
                System.out.println("Element found at index: "+index);
            else
                System.out.println("Element not found");
    	
	}

  	public static int find(char first[], int p, int q, char search){
    	int mid=0;
        while (p<=q) {
            mid=(p+q)/2;
            if ((int)first[mid]<(int)search) { 
                p=mid+1; 
            } 
            else if ((int)first[mid]>(int)search) {
                q=mid-1;
            } 
            else if((int)first[mid]==(int)search){
                return mid;
            }
        }
    	 return -1;
        }

  	}
