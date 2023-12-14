public class EMailServer {
    private int usersAtm;
    private User usersArray;

    //getters
    public int getUsersAtm() { return this.usersAtm; }

    private class User {
        private String firstName;
        private String lastName;
        private String company;
        private String department;

        //getters
        public String getFirstName() { return this.firstName; }
        public String getLastName() { return this.lastName; }
        public String getCompany() { return this.company; }
        public String getDepartment() { return this.department; }

        //setters
        public void setFirstName(String firstName) { this.firstName = firstName; }
        public void setLastName(String lastName) { this.lastName = lastName; }
        public void setCompany(String company) { this.company = company; }
        public void setDepartment(String department) { this.department = department; }

        private class EMail {
            private String address;
            private int capacity;

        }
    }
}
