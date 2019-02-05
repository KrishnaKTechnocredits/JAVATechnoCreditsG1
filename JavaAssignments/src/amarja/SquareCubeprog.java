package amarja;
//WAP to find square and cube of a number.
public class SquareCubeprog {
	public static void main(String [] args){
		SquareCubeprog a =new SquareCubeprog();
		System.out.println("Square of Number "+(Integer.parseInt(args[0]))+" = " + a.findsquare(Integer.parseInt(args[0])));
		System.out.println("Cube of Number "+(Integer.parseInt(args[0]))+" = " + a.findcube(Integer.parseInt(args[0])));
	}
	int findsquare(int num){
		return num*num;
		}
	int findcube(int num){
		return num*num*num;
		}
}
