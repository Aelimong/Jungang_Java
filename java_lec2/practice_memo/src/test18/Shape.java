package test18;
/*
+Shape(x:int)  --> ���ǳ��̸� ���ؼ� ���(���ǳ���=������*������*3.14)
+Shape(x:int, y:int)  --> �簢���� ���̸� ���ؼ� ���(�簢���ǳ���=����*����)
+Shape(x:int, y:int, z:int)
 --> ��ٸ����� ���̸� ���ؼ� ���(��ٸ����� ����=(�غ� + ���� )*����/2)
 */
public class Shape {
	
//	int x,y,z;
	
	
	public Shape(int x) {
//	     this.x=x;
	     System.out.println("���� ���� : "+(double)(x*x*3.14));		
	}
	
	public Shape(int x, int y) {
//		this.x=x;
//		this.y=y;
		System.out.println("�簢���� ���� : "+(double)(x*y));		
	}
	
    public Shape(int x, int y, int z) {
//    	this.x=x;
//      this.y=y;
//      this.z=z;
        System.out.println("��ٸ����� ���� : "+(double)((x+y)*z/2.0));
	}
	
 
	
	

}
