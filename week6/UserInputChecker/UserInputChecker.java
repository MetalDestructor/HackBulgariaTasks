package UserInputChecker;

interface Validator {
	public boolean validate(String input);
}

public class UserInputChecker {
	
	UserInputChecker checker = new UserInputChecker(){
		Validator var = new Validator(){
			public boolean validate(String input){
				return false;
			}
		};
		
		class PersonNameValidator {
			
		}
		class BulgarianPhoneNumberValidator {
			
		}
		class PersonAgeValidator {
			
		}
		class CreditCardNumberValidator {
			
		}
		class IpVersion4Validator {
			
		}
		class IpVersion6Validator {
			
		}
		class MacAdressValidator {
			
		}
		
	};
}
