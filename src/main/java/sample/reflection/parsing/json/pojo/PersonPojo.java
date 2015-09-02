package sample.reflection.parsing.json.pojo;

import sample.reflection.parsing.json.annotaions.JsonFieldAnnotation;
import sample.reflection.parsing.json.annotaions.JsonRootAnnotation;

/**
 * Created by kopelevi on 02/09/2015.
 */
@JsonRootAnnotation
public class PersonPojo {

    @JsonFieldAnnotation
    public String id;

    @JsonFieldAnnotation
    public String name;

    @JsonFieldAnnotation
    public String addresses;

    public PersonPojo() {
    }

    public PersonPojo(String id, String name, String addresses) {
        this.id = id;
        this.name = name;
        this.addresses = addresses;
    }

    public String getAddresses() {
        return addresses;
    }

    public void setAddresses(String addresses) {
        this.addresses = addresses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}