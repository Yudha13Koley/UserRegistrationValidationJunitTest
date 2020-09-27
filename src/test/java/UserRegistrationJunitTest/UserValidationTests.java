package UserRegistrationJunitTest;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTests {
  //Happy
	@Test
	public void givenFirstName_WhenValid_ShouldReturnTrue() {
		UserRegistration UR= new UserRegistration();
		boolean result=UR.validateFirstName("Yudhajit");
		Assert.assertEquals(true,result);		
	}
   //Sad	
	@Test
	public void givenFirstName_WhenInvalid_ShouldReturnFalse() {
		UserRegistration UR= new UserRegistration();
		boolean result=UR.validateFirstName("Yudhajit");
		Assert.assertEquals(false,result);		
	}
	//Happy
		@Test
		public void givenLastName_WhenValid_ShouldReturnTrue() {
			UserRegistration UR= new UserRegistration();
			boolean result=UR.validateLastName("Koley");
			Assert.assertEquals(true,result);		
		}
	//Sad	
		@Test
		public void givenLastName_WhenInvalid_ShouldReturnFalse() {
			UserRegistration UR= new UserRegistration();
			boolean result=UR.validateLastName("Koley");
			Assert.assertEquals(false,result);		
		}
	//Happy
		@Test
		public void givenEmail_WhenValid_ShouldReturnTrue() {
		UserRegistration UR= new UserRegistration();
		boolean result=UR.validateEmail("Yudhajit1998@gmail.com");
		Assert.assertEquals(true,result);		
		}
	//Sad	
		@Test
		public void givenEmail_WhenInvalid_ShouldReturnFalse() {
		UserRegistration UR= new UserRegistration();
		boolean result=UR.validateEmail("Yudhajit1998@gmail.com");
		Assert.assertEquals(false,result);		
		}
		//Happy
				@Test
				public void givenMobileNo_WhenValid_ShouldReturnTrue() {
				UserRegistration UR= new UserRegistration();
				boolean result=UR.validateMobileNo("+91 9804809458");
				Assert.assertEquals(true,result);		
				}
			//Sad	
				@Test
				public void givenMobileNo_WhenInvalid_ShouldReturnFalse() {
				UserRegistration UR= new UserRegistration();
				boolean result=UR.validateMobileNo("+91 9804809458");
				Assert.assertEquals(false,result);		
				}
				//Happy
				@Test
				public void givenPassword_WhenValid_ShouldReturnTrue() {
				UserRegistration UR= new UserRegistration();
				boolean result=UR.validatePassword("Yudhajit@123");
				Assert.assertEquals(true,result);		
				}
			//Sad	
				@Test
				public void givenPassword_WhenInvalid_ShouldReturnFalse() {
				UserRegistration UR= new UserRegistration();
				boolean result=UR.validatePassword("Yudhajit@123");
				Assert.assertEquals(false,result);		
				}
}
