class LinkedList {
	int data;
	LinkedList linked;
	LinkedList(int data) {
		this.data=data;
	}
	public static void main(String[] args) {
		LinkedList list1;
		LinkedList list=new LinkedList(5);
		list1=list;
		list1=list1.linked=new LinkedList(10);
		list1=list1.linked=new LinkedList(15);
		list1=list1.linked=new LinkedList(20);
		list1=list1.linked=new LinkedList(25);
		list1=list1.linked=new LinkedList(30);
		for (LinkedList a=list;a!=null;a=a.linked) {
			System.out.println(a.data);
		}
	}
}