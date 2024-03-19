package projektAspiration.bookingService.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.time.LocalDate;

@Data
@Builder
@Entity
@Table(name = "user")
public class User implements UserInterface {

    @Column(name = "first_name_user")
    private String firstNameUser;

    @Column(name = "last_name_user")
    private String lastNameUser;

    @Column(name = "email_user")
    private String emailUser;

    @Column(name = "user_password")
    private String UserPassword;

    @Column(name = "date_of_birth_user")
    private LocalDate dateOfBirthUser;

    @NonNull
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private int idUser;
}

