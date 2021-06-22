package generateemail;

import java.util.ArrayList;

public class EmailGenerate {
	// ["mani","sahar","david","maria","anthon"];

	private String[] firstName;
	private String[] lastName;
	private String[] emailProvider;
	private String[] emailSuffixe;
	private ArrayList<String> myRandomeEmailStore = new ArrayList<String>();

	public EmailGenerate(ArrayList<String> myRandomeEmailStore) {
		super();
		this.myRandomeEmailStore = myRandomeEmailStore;
	}

	public EmailGenerate(String[] firstName, String[] lastName, String[] emailProvider, String[] emailSuffixe) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailProvider = emailProvider;
		this.emailSuffixe = emailSuffixe;
	}

	/**
	 * *@author Mani define my own Methods here
	 * 
	 * @return retuen a constructed email
	 */

	public void printOurGeneratedEmails() {
		for (int i = 0; i < firstName.length; i++) {
			for (int m = 0; m < lastName.length; m++) {
				// System.out.println(this.firstName[i]+this.lastName[m]);
				for (int p = 0; p < emailProvider.length; p++) {
					// System.out.println(this.firstName[i]+this.lastName[m]);
					for (int s = 0; s < emailSuffixe.length; s++) {
						System.out.println(firstName[i] + "." + lastName[m] + "@" + emailProvider[p] + "." + emailSuffixe[s]);

					}
				}
			}
		}
	}

	public void printFirstNames() {
		for (int i = 0; i < firstName.length; i++) {
			System.out.println(firstName[i]);
		}

	}

	public void printLastName() {
		for (int i = 0; i < lastName.length; i++) {
			System.out.println(lastName[i]);
		}

	}

	public void printEmailProvider() {
		for (int i = 0; i < emailProvider.length; i++) {
			System.out.println(emailProvider[i]);
		}

	}

	public void printEmailSuffixe() {
		for (int i = 0; i < emailSuffixe.length; i++) {
			System.out.println(emailSuffixe[i]);
		}

	}

	/**
	 * write 30 diffrent emails in an array
	 */

	public String[] myRandomeEmailStoreRetrn() {
		for (int i = 0; i < firstName.length; i++) {
			for (int m = 0; m < lastName.length; m++) {
				// System.out.println(this.firstName[i]+this.lastName[m]);
				for (int p = 0; p < emailProvider.length; p++) {
					// System.out.println(this.firstName[i]+this.lastName[m]);
					for (int s = 0; s < emailSuffixe.length; s++) {
						if (myRandomeEmailStore.size() < 30) {
							myRandomeEmailStore
									.add(firstName[i] + "." + lastName[m] + "@" + emailProvider[p] + "." + emailSuffixe[s]);
						}

					}
				}
			}
		}

		for (int i = 0; i < myRandomeEmailStore.size(); i++) {
			System.out.println(myRandomeEmailStore.get(i));
		}

		return emailProvider;

	}

	/**
	 * Getter and Setters Area
	 * 
	 * @return
	 */

	public String[] getFirstName() {
		return firstName;
	}

	public void setFirstName(String[] firstName) {
		this.firstName = firstName;
	}

	public String[] getLastName() {
		return lastName;
	}

	public void setLastName(String[] lastName) {
		this.lastName = lastName;
	}

	public String[] getEmailProvider() {
		return emailProvider;
	}

	public void setEmailProvider(String[] emailProvider) {
		this.emailProvider = emailProvider;
	}

	public String[] getEmailSuffixe() {
		return emailSuffixe;
	}

	public void setEmailSuffixe(String[] emailSuffixe) {
		this.emailSuffixe = emailSuffixe;
	}

	public ArrayList<String> getMyRandomeEmailStore() {
		return myRandomeEmailStore;
	}

	public void setMyRandomeEmailStore(ArrayList<String> myRandomeEmailStore) {
		this.myRandomeEmailStore = myRandomeEmailStore;
	}
	// done and commit
}
