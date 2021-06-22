package tester;

import generateemail.EmailGenerate;

public class TestMain {

	public static void main(String[] args) {

		String[] firstNameCollection = { "mani", "sahar", "david", "maria", "anthon" };
		String[] lasNameCollection = { "Movassagh", "morattab", "titchfiled", "croos", "muller" };
		String[] emailProviderCollection = { "gmail", "yahoo", "hotmail", "box", "mega" };
		String[] emailSuffixeCollection = { "de", "com", "net", "io", "ir" };

		EmailGenerate myEmailObject = new EmailGenerate(firstNameCollection, lasNameCollection, emailProviderCollection,
				emailSuffixeCollection);

		myEmailObject.printOurGeneratedEmails();
		// myEmailObject.printFirstNames();
		// myEmailObject.printLastName();
		// myEmailObject.printEmailProvider();
		// myEmailObject.printEmailSuffixe();

		myEmailObject.myRandomeEmailStoreRetrn();

	}

}
