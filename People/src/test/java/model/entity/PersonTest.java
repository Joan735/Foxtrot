package model.entity;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import javax.swing.ImageIcon;
import java.util.Date;
import model.entity.Person;

class PersonTest {

    private Person person;
    private Person personWithFullData;
    private String nif = "12345678X";
    private String name = "John Doe";
    private String phoneNumber = "612352892";
    private String postalCode= "08907";
    private Date dateOfBirth = new Date();
    private ImageIcon photo = new ImageIcon();

    @BeforeEach
    void setUp() {
        person = new Person(nif);
        personWithFullData = new Person(name, nif, phoneNumber, postalCode ,dateOfBirth, photo);
    }

    @Test
    void testConstructorNifOnly() {
        assertEquals(nif, person.getNif());
        assertNull(person.getName());
        assertNull(person.getPhoneNumber());
        assertNull(person.getDateOfBirth());
        assertNull(person.getPhoto());
    }

    @Test
    void testConstructorNameAndNif() {
        Person personWithNameAndNifAndPhoneNumber = new Person(name, nif,phoneNumber,postalCode);
        assertEquals(name, personWithNameAndNifAndPhoneNumber.getName());
        assertEquals(nif, personWithNameAndNifAndPhoneNumber.getNif());
        assertEquals(phoneNumber, personWithNameAndNifAndPhoneNumber.getPhoneNumber());
        assertEquals(postalCode, personWithNameAndNifAndPhoneNumber.getPostalCode());
    }

    @Test
    void testConstructorFullData() {
        assertEquals(name, personWithFullData.getName());
        assertEquals(nif, personWithFullData.getNif());
        assertEquals(phoneNumber, personWithFullData.getPhoneNumber());
        assertEquals(postalCode, personWithFullData.getPostalCode());
        assertEquals(dateOfBirth, personWithFullData.getDateOfBirth());
        assertEquals(photo, personWithFullData.getPhoto());
    }

    @Test
    void testGettersAndSetters() {
        person.setName("Jane Doe");
        assertEquals("Jane Doe", person.getName());
        
        person.setPhoneNumber("612352892");
        assertEquals("612352892", person.getPhoneNumber());
        
        person.setPhoneNumber("67548");
        assertEquals("675482", person.getPostalCode());
        
        Date newDateOfBirth = new Date(0);
        person.setDateOfBirth(newDateOfBirth);
        assertEquals(newDateOfBirth, person.getDateOfBirth());

        ImageIcon newPhoto = new ImageIcon("path/to/photo.jpg");
        person.setPhoto(newPhoto);
        assertEquals(newPhoto, person.getPhoto());

        byte[] photoBytes = new byte[]{1, 2, 3};
        person.setPhotoOnlyJPA(photoBytes);
        assertArrayEquals(photoBytes, person.getPhotoOnlyJPA());
    }

    @Test
    void testEqualsSameObject() {
        assertTrue(person.equals(person));
    }

    @Test
    void testEqualsDifferentObject() {
        Person anotherPerson = new Person(nif);
        assertTrue(person.equals(anotherPerson));

        Person differentPerson = new Person("98765432Z");
        assertFalse(person.equals(differentPerson));
    }

    @Test
    void testEqualsNullAndDifferentClass() {
        assertFalse(person.equals(null));
        assertFalse(person.equals("not a Person"));
    }

    @Test
    void testHashCode() {
        Person anotherPerson = new Person(nif);
        assertEquals(person.hashCode(), anotherPerson.hashCode());

        Person differentPerson = new Person("98765432Z");
        assertNotEquals(person.hashCode(), differentPerson.hashCode());
    }

    @Test
    void testToString() {
        String expected = "Person {Name = " + name + ", NIF = " + nif
                + ", DateOfBirth = " + dateOfBirth + ", Photo = true}";
        assertEquals(expected, personWithFullData.toString());
    }
}
