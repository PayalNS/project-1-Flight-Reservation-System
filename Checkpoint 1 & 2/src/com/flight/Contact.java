package com.flight;

public class Contact {
        public String name;
        public String phone;
        public String email;

        public String getContactDetails(){
            return  name + " " +  phone + " "  + email;
        }

        public void updateContactDetails(String contactDetails){
            this.phone =contactDetails;
        }

    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

