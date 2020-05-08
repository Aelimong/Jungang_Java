package shape;


public class ShapeTest {

	public static void main(String[] args) {

		Shape sh[] = new Shape[6];
		sh[0]=new Triangle(7, 5,"Blue");
		sh[1]=new Rectangle(4,6,"Blue");
		sh[2]=new Triangle(6,7,"Red");
		sh[3]=new Rectangle(8,3,"Red");
		sh[4]=new Triangle(9,8,"White");
		sh[5]=new Rectangle(5,7,"White");
		
		System.out.println("기본정보");
		
		for(int i=0; i<6;i++) {
			if(i%2==0) {
				System.out.println("Triangle"+" "+sh[i].getArea()+" "+sh[i].getColor());
			}else System.out.println("Rectangle"+" "+sh[i].getArea()+" "+sh[i].getColor());
		}
		/*
		System.out.println("\n"+"사이즈를 변경 후 정보");
		for(int i=0; i<6;i++) {
			if(i%2==0) {
				System.out.println("Triangle"+" "+sh[i].sdf+" "+sh[i].getColor());
			}else System.out.println("Rectangle"+" "+sh[i].getArea()+" "+sh[i].getColor());
		}
		*/
		
		
	}

}
