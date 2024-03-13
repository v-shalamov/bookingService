package projektAspiration.bookingService.model;

import java.time.LocalDate;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class Hotel {

  private String firstName;

  private String lastName;

  private LocalDate dateOfBirth;

  @NonNull
  private String id;

  private int age;

}
