package zuhriddinscode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zuhriddinscode.category.RoomCategory;
import zuhriddinscode.entity.Room;
import zuhriddinscode.service.RoomService;
import java.util.List;

@RestController
@RequestMapping("/api/rooms")
public class RoomController {

    @Autowired
    private RoomService roomService;

    @GetMapping("/category/{category}")
    public List<Room> getRoomsByCategory(@PathVariable RoomCategory category) {
        return roomService.getRoomsByCategory(category);
    }

    @PostMapping
    public Room createRoom(@RequestBody Room room) {
        return roomService.createRoom(room);
    }

    // Boshqa CRUD operatsiyalar
}