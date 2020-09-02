package com.codecool.builder;

import java.util.Date;

public class Person {

    private Long personalId;
    private int age;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private Date birthday;

    public static class Builder {
        private Long personalId;
        private int age;
        private String name;
        private String email;
        private String phoneNumber;
        private String address;
        private Date birthday;

        public Builder (Long personalId){
            this.personalId = personalId;
        }

        public Builder withName(String name){
            this.name = name;
            return this;
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }

        public Builder email(String email){
            this.email = email;
            return this;
        }

        public Builder phoneNumber(String phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder address(String address){
            this.address = address;
            return this;
        }

        public Builder birthday(Date birthday){
            this.birthday = birthday;
            return this;
        }

        public Person build(){
            Person person = new Person();
            person.personalId = this.personalId;
            person.age = this.age;
            person.address = this.address;
            person.birthday = this.birthday;
            person.name = this.name;
            person.phoneNumber = this.name;
            person.email = this.email;
            return person;
        }


    }

    private Person() {
    }
}
