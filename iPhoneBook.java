
public interface iPhoneBook{
	boolean Add(Integer phonenumber, Person person);
	boolean delete(Integer phoneNumber);
	Person looksUp(Integer phoneNumber);
}