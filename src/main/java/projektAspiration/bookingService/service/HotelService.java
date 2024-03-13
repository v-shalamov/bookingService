package projektAspiration.bookingService.service;

import projektAspiration.bookingService.model.Hotel;

import java.util.List;

public interface HotelService {

  List<Hotel> findAllHotel();

  Hotel saveHotel(Hotel hotel);

  Hotel findById(String id);

  Hotel updateHotel(Hotel hotel);

  void deleteHotel(String id);
}
