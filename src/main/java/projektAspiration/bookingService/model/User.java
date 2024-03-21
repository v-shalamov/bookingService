package projektAspiration.bookingService.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
@Entity
@Table(name = "user")
public class User implements UserInterface {

    @NotNull
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private int idUser;

    @NotBlank
    @Column(name = "first_name_user")
    @Pattern(regexp = "[A-Z][a-z]{2,}")
    private String firstNameUser;

    @NotBlank
    @Column(name = "last_name_user")
    @Pattern(regexp = "[A-Z][a-z]{2,}")
    private String lastNameUser;

    @NotBlank
    @Column(name = "email_user")
    @Pattern(regexp = "(?!\\.{2}).+(?<!\\.)@(?!\\.{2}).+(?<!\\.)\\.(?!\\.{2}).+")
    private String emailUser;

    @NotBlank
    @Column(name = "user_password")
    @Pattern(regexp = ".{7,}")
    private String UserPassword;

    @NotNull
    @Column(name = "date_of_birth_user")
    private LocalDate dateOfBirthUser;

    @Column(name = "is_active")
    private boolean isActive;
}

