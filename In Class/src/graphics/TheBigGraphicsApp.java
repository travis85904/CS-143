package graphics;



public class TheBigGraphicsApp {
	public static void main( String [] args ) {

		Shape[] sArray = {
			new Rectangle(),
			new Rectangle(),
			new Circle(),
			new Circle(), 
			new Rectangle(),
			new Circle()
		};

		//Shape sary =  new Shape();
		
		for( Shape s : sArray ) {
			s.Draw(0.0, 0.0);
		}


	}
}
















