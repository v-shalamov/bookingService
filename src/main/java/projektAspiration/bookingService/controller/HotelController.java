package projektAspiration.bookingService.controller;

import lombok.AllArgsConstructor;
import projektAspiration.bookingService.model.Hotel;
import projektAspiration.bookingService.service.HotelService;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hotels")
@AllArgsConstructor
public class HotelController {

  private final HotelService service;

  @GetMapping
  public List<Hotel> findAllHotel() {
    //TODO
    return service.findAllHotel();
  }

  @PostMapping("save_hotel")
  public Hotel saveHotel(@RequestBody Hotel hotel) {
    return service.saveHotel(hotel);
  }

  @GetMapping("/{email}")
  public Hotel findById(@PathVariable("id") String id) {
    return service.findById(id);
  }

  @PutMapping("update_hotel")
  public Hotel updateHotel(Hotel hotel) {
    return service.updateHotel(hotel);
  }

  @DeleteMapping("delete_student/{id}")
  public void deleteHotel(@PathVariable String id) {
    service.deleteHotel(id);
  }
}
