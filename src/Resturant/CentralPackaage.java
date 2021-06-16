
package Resturant;
public class CentralPackaage {
	/**
	 * This is a resturant management package to practice classes and maybe http
	 * request in java
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("just check");
		System.out.println("Hi Wellcome to our Resturant");
		Koch mani = new Koch("mani", "movasssagh",45, false, "iranisch");
		Koch david = new Koch("david", "titchfield",55, true, "english");
		System.out.println("our koch name is " + mani.getName() +" "+ mani.getFamily()+" and he is " + mani.getAge() + " years old" );
		System.out.println("he has a nice " + mani.getCookingMethod() + " cooking method" );
		System.out.println("our koch name is " + david.getName() +" "+ david.getFamily()+" and he is " + david.getAge() + " years old" );
		System.out.println("he has a nice " + david.getCookingMethod() + " cooking method" );
	}

}
