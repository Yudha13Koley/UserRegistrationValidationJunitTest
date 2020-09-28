package UserRegistrationJunitTest;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTests {
  //InvalidFirstName
	@Test
	public void givenInvalidFirstName_WhenInvalid_ShouldReturnexception() {
		UserRegistration UR= new UserRegistration();
		try {
			boolean result = UR.validateFirstName(null);
			Assert.assertEquals(true,result);
		} catch (InvalidFirstName e) {
			Assert.assertEquals("Enter A Valid First Name !",e.getMessage());
			System.out.println(e.getMessage());
		}		
	}
	   //Happy	
		@Test
		public void givenFirstName_WhenValid_ShouldReturnTrue() {
			UserRegistration UR= new UserRegistration();
			try {
				boolean result;
				result = UR.validateFirstName("Yudhajit");
				Assert.assertEquals(true,result);
			} catch (InvalidFirstName e) {
				Assert.assertEquals("Enter A Valid First Name !",e.getMessage());
			}
		}
   //Sad	
	@Test
	public void givenFirstName_WhenInvalid_ShouldReturnFalse() {
		UserRegistration UR= new UserRegistration();
		try {
			boolean result;
			result = UR.validateFirstName("Yu");
			Assert.assertEquals(false,result);
		} catch (InvalidFirstName e) {
			Assert.assertEquals("Enter A Valid First Name !",e.getMessage());
		}
	}
	  //InvalidLastName
		@Test
		public void givenInvalidLastName_WhenInvalid_ShouldReturnexception() {
			UserRegistration UR= new UserRegistration();
			try {
				boolean result = UR.validateLastName(null);
				Assert.assertEquals(true,result);
			} catch (InvalidLastName e) {
				Assert.assertEquals("Enter A Valid Last Name !",e.getMessage());
				System.out.println(e.getMessage());
			}		
		}
	//Happy
		@Test
		public void givenLastName_WhenValid_ShouldReturnTrue() {
			UserRegistration UR= new UserRegistration();
			try {
				boolean result = UR.validateLastName("Koley");
				Assert.assertEquals(true,result);	
			} catch (InvalidLastName e) {
				Assert.assertEquals("Enter A Valid Last Name !",e.getMessage());
				System.out.println(e.getMessage());
			}	
		}
	//Sad	
		@Test
		public void givenLastName_WhenInvalid_ShouldReturnFalse() {
			UserRegistration UR= new UserRegistration();
			
			try {boolean result;
				result = UR.validateLastName("Ko");
				Assert.assertEquals(false,result);
			} catch (InvalidLastName e) {
				Assert.assertEquals("Enter A Valid Last Name !",e.getMessage());
				System.out.println(e.getMessage());
			}		
		}
		 //InvalidEmail
		@Test
		public void givenInvalidEmail_WhenInvalid_ShouldReturnexception() {
			UserRegistration UR= new UserRegistration();
			try {
				boolean result = UR.validateEmail(null);
				Assert.assertEquals(true,result);
			} catch (InvalidEamil e) {
				Assert.assertEquals("Enter A Valid Email !",e.getMessage());
				System.out.println(e.getMessage());
			}		
		}
	//Happy
		@Test
		public void givenEmail_WhenValid_ShouldReturnTrue() {
		UserRegistration UR= new UserRegistration();
		
		try {boolean result;
			result = UR.validateEmail("Yudhajit1998@gmail.com");
			Assert.assertEquals(true,result);
		} catch (InvalidEamil e) {
			Assert.assertEquals("Enter A Valid Email !",e.getMessage());
			System.out.println(e.getMessage());
		}
			
		}
	//Sad	
		@Test
		public void givenEmail_WhenInvalid_ShouldReturnFalse() {
		UserRegistration UR= new UserRegistration();
		
		try {boolean result;
			result = UR.validateEmail("Yudhajit1998@gmail.com.com");
			Assert.assertEquals(false,result);
		} catch (InvalidEamil e) {
			Assert.assertEquals("Enter A Valid Email !",e.getMessage());
			System.out.println(e.getMessage());
		}
				
		}
		 //InvalidMobileNo
			@Test
			public void givenInvalidMobileNo_WhenInvalid_ShouldReturnexception() {
				UserRegistration UR= new UserRegistration();
				try {
					boolean result = UR.validateMobileNo(null);
					Assert.assertEquals(true,result);
				} catch (InvalidMobileNoException e) {
					Assert.assertEquals("Enter A Valid Mobile No !",e.getMessage());
					System.out.println(e.getMessage());
				}		
			}
		//Happy
				@Test
				public void givenMobileNo_WhenValid_ShouldReturnTrue() {
				UserRegistration UR= new UserRegistration();
				try {
					boolean result;
					result = UR.validateMobileNo("+91 9804809458");
					Assert.assertEquals(true,result);	
				} catch (InvalidMobileNoException e) {
					Assert.assertEquals("Enter A Valid Mobile No !",e.getMessage());
					System.out.println(e.getMessage());
				}		
				}
			//Sad	
				@Test
				public void givenMobileNo_WhenInvalid_ShouldReturnFalse() {
				UserRegistration UR= new UserRegistration();
				try {
					boolean result;
					result = UR.validateMobileNo("+91 9804809");
					Assert.assertEquals(false,result);	
				} catch (InvalidMobileNoException e) {
					Assert.assertEquals("Enter A Valid Mobile No !",e.getMessage());
					System.out.println(e.getMessage());
				}		
				}
				//InvalidPassword
				@Test
				public void givenInvalidPassWord_WhenInvalid_ShouldReturnexception() {
					UserRegistration UR= new UserRegistration();
					try {
						boolean result = UR.validatePassword(null);
						Assert.assertEquals(true,result);
					} catch (InvalidPassword e) {
						Assert.assertEquals("Enter A Valid Password !",e.getMessage());
						System.out.println(e.getMessage());
					}		
				}
				//Happy
				@Test
				public void givenPassword_WhenValid_ShouldReturnTrue() {
					UserRegistration UR= new UserRegistration();
					try {
						boolean result = UR.validatePassword("Yudhajit@123");
						Assert.assertEquals(true,result);
					} catch (InvalidPassword e) {
						Assert.assertEquals("Enter A Valid Password !",e.getMessage());
						System.out.println(e.getMessage());
					}
				}
			//Sad	
				@Test
				public void givenPassword_WhenInvalid_ShouldReturnFalse() {
					UserRegistration UR= new UserRegistration();
					try {
						boolean result = UR.validatePassword("Yudhajit123");
						Assert.assertEquals(false,result);
					} catch (InvalidPassword e) {
						Assert.assertEquals("Enter A Valid Password !",e.getMessage());
						System.out.println(e.getMessage());
					}
				}
}
