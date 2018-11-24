package com.example.postgresdemo.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Table(name = "teachers")
public class Teacher extends AuditModel {
    @Id
    @GeneratedValue(generator = "teacher_generator")
    @SequenceGenerator(
            name = "teacher_generator",
            sequenceName = "teacher_sequence",
            initialValue = 1000
    )
    private Long id;

    @NotBlank
    private String pesel;

    @NotBlank
    private String name;

    @NotBlank
    private String surname;

    @NotBlank
    private String address;

//    public Boolean getActive() {
//        return active;
//    }
//
//    public void setActive(Boolean active) {
//        active = active;
//    }

//    @NotNull
//    private Boolean active;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Register> getRegisters() {
        return registers;
    }

    public void setRegisters(List<Register> registers) {
        this.registers = registers;
    }

    @OneToMany(mappedBy = "teacher")
    private List<Register> registers;
}
