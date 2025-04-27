package com.designpattern.creational.builder;

public class BuilderExample {
   private int id;
   private String firstName;
    private String middleName;
    private String lastName;
   private int age;

   private String schoolName;

    public BuilderExample(BuilderPattern builderPattern) {
        this.id = builderPattern.id;
        this.firstName = builderPattern.firstName;
        this.middleName = builderPattern.middleName;
        this.lastName = builderPattern.lastName;
        this.age = builderPattern.age;
        this.schoolName = builderPattern.schoolName;
    }

    public static class BuilderPattern {
        private int id;
        private String firstName;
        private String middleName;
        private String lastName;
        private int age;
        private String schoolName;

        public void setId(int id) {
            this.id = id;
        }

        public BuilderPattern setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public BuilderPattern setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public BuilderPattern setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public BuilderPattern setAge(int age) {
            this.age = age;
            return this;
        }

        public BuilderPattern setSchoolName(String schoolName) {
            this.schoolName = schoolName;
            return this;
        }

        public BuilderExample build() {
            return new BuilderExample(this);
        }
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getSchoolName() {
        return schoolName;
    }
}
