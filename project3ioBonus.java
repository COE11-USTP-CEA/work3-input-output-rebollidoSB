import java.io.*;
class project3ioBonus{
	public static void main(String[]args){
		System.out.println("Hello Everyone!");
		InputStreamReader s = new InputStreamReader(System.in);
		BufferedReader r = new BufferedReader(s);
		System.out.println("Enter height of the triangle:");
		double height =0
		try{
			height=Integer.valueof(r.readLine());
		}
		catch(Exception p){
			System.out.println("Invalid number!")
		}
		for(int a=1; a<=height; a++){
			for(int b=1; b<height -(a-1); b++){
				System.out.print(" ");
			}
			for(int c=1; c<=a; c++){
				System.out.print("*");
				for(int s1=1; s1<c; s1+=c){
				System.out.print("*");
				}
			}
			System.out.println("");
			
		}
	}
}
