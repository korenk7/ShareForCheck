package Classwork1405;

public class Person implements Perconint {

    private String firstName;
    private String lastName;
    private String surName;
    private String city;
    private String login;

    public Person() {

    }

    public Person(String firstName, String lastName, String surName, String city, String login) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.surName = surName;
        this.city = city;
        this.login = login;
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

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String changeLogin() {
        return "new"+getLogin();
    }

    @Override
    public String changeName() {
        return null;
    }

    public class Account extends Person {
        private String password;

        public Account(){
        }

        public Account(String password) {
            this.password = password;
        }

        public Account(String firstName, String lastName, String surName, String city, String login, String password) {
            super(firstName, lastName, surName, city, login);
            this.password = password;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }


        @Override
        public String toString() {
            return "Account{" +
                    "firstname='" + getFirstName() + '\'' +
                    ", login='" + getLogin() + '\'' +
                    ", password='" + password + '\'' +
                    '}';
        }




    }

    public static class Account2 extends Person {

        private String longPassword;

        public Account2() {

        }

        public Account2(String longPassword) {
            this.longPassword = longPassword;
        }

        public Account2(String firstName, String lastName, String surName, String city, String login, String longPassword) {
            super(firstName, lastName, surName, city, login);
            this.longPassword = longPassword;
        }

        public String getLongPassword() {
            return longPassword;
        }

        public void setLongPassword(String longPassword) {
            this.longPassword = longPassword;
        }

        @Override
        public String toString() {
            return "Account{" +
                    "firstname='" + getFirstName() + '\'' +
                    ", login='" + getLogin() + '\'' +
                    ", longpassword='" + longPassword + '\'' +
                    '}';
        }

    }

    public static void main(String[] args) {


        class Account3 extends Person {
            private String newPassword;
            public Account3() {
            }
            public Account3(String newPassword) {
                this.newPassword = newPassword;
            }
            public Account3(String firstName, String lastName, String surName, String city, String login, String newPassword) {
                super(firstName, lastName, surName, city, login);
                this.newPassword = newPassword;
            }
            public String getNewPassword() {
                return newPassword;
            }
            public void setNewPassword(String newPassword) {
                this.newPassword = newPassword;
            }

            public String showAccountInfo() {
                return "Account{" +
                        "firstname='" + getFirstName() + '\'' +
                        ", login='" + getLogin() + '\'' +
                        ", newpassword='" + newPassword + '\'' +
                        '}';
            }
        }
        Account3 account3 = new Account3();
        System.out.println(account3.showAccountInfo());

    }
}
abstract class NewPercon implements Perconint{



}
