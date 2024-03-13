package projektAspiration.bookingService.service.Impl;

import projektAspiration.bookingService.model.Hotel;
import projektAspiration.bookingService.service.HotelService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import projektAspiration.bookingService.repository.inMemoryHotelDAO;

@Service
@AllArgsConstructor
public class InMemoryHotelServiceImpl implements HotelService {

  private final inMemoryHotelDAO repository;

  @Override
  public List<Hotel> findAllHotel() {
    return repository.findAllHotel();
  }
  
  @Override
  public  Hotel saveHotel(Hotel hotel) { return repository.saveHotel(hotel); }

  @Override
  public Hotel findById(String id) { return repository.findById(id); }

  @Override
  public Hotel updateHotel(Hotel hotel) {
    return repository.updateHotel(hotel);
  }

  @Override
  public void deleteHotel(String id) {
    repository.deleteHotel(id);
  }
}
