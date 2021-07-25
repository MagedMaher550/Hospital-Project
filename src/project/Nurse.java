package project;

public class Nurse extends Employee{

    private Room [] myRooms ;

    
    
    
    public Nurse( Room[] myRooms, int myKey, String firstName, String lastName, String id, Gender gender, String dateOfBirth, int age, String address, String phoneNumber, String email, double salary) {
        super(myKey, firstName, lastName, id, gender, dateOfBirth, age, address, phoneNumber, email, salary);
        this.myRooms = myRooms;
    }


    
  
    public Room[] getMyRooms() {
        return myRooms;
    }

    public void setMyRooms(Room[] myRooms) {
        this.myRooms = myRooms;
    }



    
}
