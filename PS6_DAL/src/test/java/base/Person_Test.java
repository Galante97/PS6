package base;

import static org.junit.Assert.*;

import java.util.UUID;

import org.junit.Test;

public class Person_Test {

	UUID idOne = UUID.randomUUID();
	
	@Test
	public void test_creating_Person() {
		PersonDAL new_person = new PersonDAL();
	}
	
	@Test
	public void update_Person() {
		PersonDAL update_a_person = new PersonDAL().updatePerson(per);
	}
	
	@Test
	public void delete_Person() {
		
		PersonDAL delete_person = new personDAL().deletePerson(idOne);
		}

	
	@Test
	public void get_Person() {
		PersonDAL get_A_person = new PersonDAL().getPerson(idOne);
		}
}
