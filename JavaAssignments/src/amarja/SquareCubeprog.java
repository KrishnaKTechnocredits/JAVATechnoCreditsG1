package amarja;
//WAP to find square and cube of a number.
public class SquareCubeprog {
	static int square;
	static int cube;
	public static void main(String [] args){
		SquareCubeprog a =new SquareCubeprog();
		System.out.println("Square of Number "+(Integer.parseInt(args[0]))+" = " + a.findsquare(Integer.parseInt(args[0])));
		System.out.println("Cube of Number "+(Integer.parseInt(args[0]))+" = " + a.findcube(Integer.parseInt(args[0])));
	}
	int findsquare(int num){
		int square;
		square=num*num;
		return square;
		}
	int findcube(int num){
		int cube;
		cube=num*num*num;
		return cube;
		}
}
