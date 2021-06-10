package ubung;

/**
 * 
 * @author Mani first get name from user and say wellcome then get the number
 *         from user and check it and give results then say godbye to use and
 *         wish luck !! all of above defined in three methods
 *
 */
public class practiceMethods {

	public static void main(String[] args) {
		String user = sayWellcome();

		String evaluatedResult = getNumberFromUser(user);
		System.out.println(evaluatedResult);
		sayGoodByeToUser();
	}

	/**
	 * define a function to say wellcome to user then get the use name and say more
	 * friendly wellcome introduce the service
	 */
	public static String sayWellcome() {
		System.out.println("Wellcome to Score evalouation Center");
		System.out.println("may i have your name Please?");
		@SuppressWarnings("resource")
		String userName = new java.util.Scanner(System.in).nextLine();
		System.out.println("Hello " + userName);
		String ScoreCalculatorName = "Wellcome to Score evalouation Center";
		System.out.println(ScoreCalculatorName + " " + userName);
		System.out.println("Please Give me your Score " + userName);
		return userName;
	}

	/**
	 * define a function to get number from user evaluate the score and return the
	 * result
	 *
	 */
	public static String getNumberFromUser(String user) {
		@SuppressWarnings("resource")
		int userGivenScore = new java.util.Scanner(System.in).nextInt();
		if (userGivenScore > 80) {
			return user + " You got more than 80 and it means that you are in Sehr Gut Area!!";
		}
		if (userGivenScore < 80 && userGivenScore > 60) {
			return "You got between 60 and 80" + user + " and it is Ok !! Dont forget No Pain No Gain !!";
		}
		if (userGivenScore < 60 && userGivenScore > 50) {
			return "You are not so good. Plese make more Effort" + user;
		}
		if (userGivenScore < 50) {
			return "Hey " + user + " Did you Study At All !!!!!!???  ";
		}

		return null;
	}

	/**
	 * say goodbye to user and wish luck!
	 * 
	 */
	public static void sayGoodByeToUser() {
		System.out.println("Thank you for using our service , GoodLuck by Study and see you soon");

	}
}