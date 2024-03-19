package projektAspiration.bookingService.model;

import java.time.LocalDate;

public interface UserInterface {

    String getFirstNameUser();

    void setFirstNameUser(String firstNameUser);


    String getLastNameUser();

    void setLastNameUser(String lastNameUser);


    String getEmailUser();

    void setEmailUser(String emailUser);


    String getUserPassword();

    void setUserPassword(String UserPassword);


    LocalDate getDateOfBirthUser();

    void setDateOfBirthUser(LocalDate DateOfBirthUser);


    int getIdUser();

    void setIdUser(int idUser);
}

