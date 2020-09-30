package UserRegistrationJunitTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	private String firstName;
	private String firstNamePattern="^[A-Z][a-z]{2,}";
	private String lastName;
	private String lastNamePattern="^[A-Z][a-z]{2,}";
	private String email;
	private String emailPattern="(^[a-zA-Z0-9]+)"+"([. + _ -]?[a-zA-Z0-9]*)"+"[^. + _ -]@[a-zA-Z0-9]+"+"(\\.[a-zA-Z]{2,4})"+"(\\.[a-zA-Z]{2})?";
	private String mobileNo;
	private String mobileNoPattern="(^\\+)([0-9]{2,3})(\\s)"+"[0-9]{10}$";
	private String password;
	private String passwordPatternRule1="(?=.{8,})(?=.*[A-Z])(?=.*\\d)(?=.*\\W).*$";
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		try {
			if(this.validatePassword(password))
				this.password=password;
				else
					System.out.println("Password is Invalid !");
		} catch (InvalidPassword e) {
		System.out.println(e.getMessage());
		}
	}
	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		try {
			if(this.validateMobileNo(mobileNo))
				this.mobileNo = mobileNo;
				else
					System.out.println("Mobile Number is Invalid !");
		} catch (InvalidMobileNoException e) {
			System.out.println(e.getMessage());
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		try {
			if(this.validateEmail(email))
				this.email = email;
				else
					System.out.println("Email is Invalid !");
		} catch (InvalidEamil e) {
			System.out.println(e.getMessage());
		}
	}
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		try {
			if(this.validateLastName(lastName))
				this.lastName = lastName;
				else
					System.out.println("Last Name is Invalid !");
		} catch (InvalidLastName e) {
			System.out.println(e.getMessage());
		}
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		try {
			if(this.validateFirstName(firstName))
			this.firstName = firstName;
			else
				System.out.println("First Name is Invalid !");
		} catch (InvalidFirstName e) {
			System.out.println(e.getMessage());
		}
	}
	public boolean validateMobileNo(String Mob) throws InvalidMobileNoException {
		try {
			Pattern pattern1=Pattern.compile(mobileNoPattern);
			ValidateField fn= (String string,Pattern pattern)->{
			Matcher matcher=pattern.matcher(string);
			 return matcher.matches();
				};
			return fn.isValid(Mob, pattern1);
			}
			catch(Exception e){
				throw new InvalidMobileNoException("Enter A Valid Mobile No !");
			}
	}
	public boolean validateEmail(String email) throws InvalidEamil {
		try {
			Pattern pattern1=Pattern.compile(emailPattern);
			ValidateField fn= (String string,Pattern pattern)->{
			Matcher matcher=pattern.matcher(string);
			 return matcher.matches();
				};
			return fn.isValid(email, pattern1);
			}
			catch(Exception e){
				throw new InvalidEamil("Enter A Valid Email !");
			}
	}
	public boolean validateFirstName(String firstname) throws InvalidFirstName {
		try {
		Pattern pattern1=Pattern.compile(firstNamePattern);
		ValidateField fn= (String string,Pattern pattern)->{
		Matcher matcher=pattern.matcher(string);
		 return matcher.matches();
			};
		return fn.isValid(firstname, pattern1);
		}
		catch(Exception e){
			throw new InvalidFirstName("Enter A Valid First Name !");
		}
	}
	public boolean validateLastName(String lastname) throws InvalidLastName {
		try {
			Pattern pattern1=Pattern.compile(lastNamePattern);
			ValidateField fn= (String string,Pattern pattern)->{
			Matcher matcher=pattern.matcher(string);
			 return matcher.matches();
				};
			return fn.isValid(lastname, pattern1);
			}
			catch(Exception e){
				throw new InvalidLastName("Enter A Valid Last Name !");
			}
	}
	public boolean validatePassword(String password) throws InvalidPassword {
		try {
			Pattern pattern1=Pattern.compile(passwordPatternRule1);
			ValidateField fn= (String string,Pattern pattern)->{
			Matcher matcher=pattern.matcher(string);
			 return matcher.matches();
				};
			return fn.isValid(password, pattern1);
			}
			catch(Exception e){
				throw new InvalidPassword("Enter A Valid PassWord !");
			}
		}
	@Override
	public String toString() {
		return "FirstName = " + firstName+" LastName = "+lastName+" Email = "+email+" Mobile No = "+mobileNo+" Password = "+password;
	}
}
