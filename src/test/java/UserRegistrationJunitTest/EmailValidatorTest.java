package UserRegistrationJunitTest;

import org.junit.Assert;
import org.junit.Test;

public class EmailValidatorTest {
	private EmailValidation emailValidation=new EmailValidation();

	@Test
	public void givenValidEmail_WhenValid_ReturnsTrue() {
		String[] validEmail= {"abc@yahoo.com","abc-100@yahoo.com","abc.100@yahoo.com","abc111@abc.com","abc-100@abc.net"
				,"abc.100@abc.com.au","abc@1.com","abc@gmail.com.co","abc+100@gmail.com"};
		for(int i=0;i<validEmail.length;i++) {	
		boolean valid=emailValidation.Validate("abc@yahoo.com");
			System.out.println("Email is Valid : "+validEmail[i]+"    "+valid);
			Assert.assertEquals(true,valid);	
		}}
	@Test
	public void givenInvalidEmail_WhenValid_ReturnsFalse() {
		String inValidEmail[]= {"abc","abc@.com.my","abc123@gmail.a","abc123@.com","abc123@.com.com",".abc@abc.com","abc()*@gmail.com",
				"abc@%*.com","abc..2002@gmail.com","abc.@gmail.com","abc@abc@gmail.com","abc@gmail.com.1a","abc@gmail.com.aa.au"};
		for(String temp : inValidEmail) {
			boolean valid=emailValidation.Validate(temp);
			System.out.println("Email is Valid : "+temp+"    "+valid);
			Assert.assertEquals(false,valid);	
		}
	}

}
