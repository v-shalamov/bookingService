package projektAspiration.bookingService.repository;

import projektAspiration.bookingService.model.Hotel;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import org.springframework.stereotype.Repository;

@Repository
public class inMemoryHotelDAO {

  private final List<Hotel> HOTELS = new ArrayList<>();

  public List<Hotel> findAllHotel() { // показать все отели
    return HOTELS;
  }

  public Hotel saveHotel(Hotel hotel) { // Добавление отеля
    HOTELS.add(hotel);
    return hotel;
  }

  public Hotel findById(String id) { // Поиск отеля по Айди через поток
    return HOTELS.stream()
        .filter(element -> element.getId().equals(id))
        .findFirst()
        .orElse(null);
  }

  public Hotel updateHotel(Hotel hotel) { //Редактирование отеля
    var hotelIndex = IntStream.range(0, HOTELS.size())
        .filter(index -> HOTELS.get(index).getId().equals(hotel.getId()))
        .findFirst()
        .orElse(-1);

    if (hotelIndex > -1) {
      HOTELS.set(hotelIndex, hotel);
      return hotel;
    }
    return null;
  }

  public void deleteHotel(String id) { // Удаление отеля
    var hotel = findById(id);
    if (hotel!=null) {
      HOTELS.remove(hotel);
    }
  }
}
