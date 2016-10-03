
 import java.util.*;

// NOTE: Do not change the name of this class or make it public!
//       If you do, automated grading might fail, and you will not get full credit!
//
class Person {
   private String firstName, lastName;
   public Person(String first, String last) {
       if (first == null || last == null) {
           throw new NullPointerException();
       }
       firstName = first;
       lastName = last;
   }
   public String getFirstName() {
       return firstName;
   }
   public String getLastName() {
       return lastName;
   }
   // Add additional code, if necessary, here. Do not remove existing methods!
}

// NOTE: Do not change the name of this class or make it public!
//       If you do, automated grading might fail, and you will not get full credit!
//
class PhoneBook implements iPhoneBook{
	HashMap<Integer, Person> PhoneMap = new HashMap<Integer, Person>();

	@Override
	public boolean Add(Integer phonenumber, Person person) {
		if(!PhoneMap.containsKey(phonenumber)){
			PhoneMap.put(phonenumber, person);
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(Integer phoneNumber) {
		// TODO Auto-generated method stub
		if(!PhoneMap.containsKey(phoneNumber)){
			PhoneMap.remove(phoneNumber);
			return true;
		}
		return false;
	}

	@Override
	public Person looksUp(Integer phoneNumber) {
		if(PhoneMap.containsKey(phoneNumber)){
			return PhoneMap.get(phoneNumber);
		}
			
		return null;
	}
	
	
}



