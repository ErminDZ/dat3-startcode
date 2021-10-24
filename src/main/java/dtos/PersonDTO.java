package dtos;

import entities.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonDTO {
    private Long id;
    private String email;
    private String firstName;
    private String lastName;
    private List<PersonDTO> all = new ArrayList<PersonDTO>();

    public PersonDTO(Long id, String email, String firstName, String lastName) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }



    public static List<PersonDTO> getDtos(List< Person> rms){
        List<PersonDTO> rmdtos = new ArrayList();
        rms.forEach(rm->rmdtos.add(new PersonDTO(rm)));
        return rmdtos;
    }

    public PersonDTO(Person rm) {
        if(rm.getId() != 1) // change to null
            this.id = rm.getId();
        this.email = rm.getEmail();
        this.firstName = rm.getFirstName();
        this.lastName = rm.getLastName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<PersonDTO> getAll() {
        return all;
    }

    public void setAll(List<PersonDTO> all) {
        this.all = all;
    }
}
