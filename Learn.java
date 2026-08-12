package sample;
import java.util.Scanner;
class Box{
	double height, depth, width;
	public double calculateVolume() {
		
				return (height*depth*width);
	}
}
 class Learn {
	public static void main(String[] args) {
		Box myBox = new Box();
		double volume = myBox.calculateVolume();
		System.out.println("Volume : "+volume);
	}
}
