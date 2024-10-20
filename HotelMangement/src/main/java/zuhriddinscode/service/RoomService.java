package zuhriddinscode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zuhriddinscode.category.RoomCategory;
import zuhriddinscode.entity.Room;
import zuhriddinscode.repository.RoomRepository;

import java.util.List;

@Service
public class RoomService {

    @Autowired
    private RoomRepository roomRepository;

    // Xonalarni kategoriya bo'yicha olish
    public List<Room> getRoomsByCategory(RoomCategory category) {
        return roomRepository.findByCategory(category);
    }

    public Room createRoom(Room room) {
        return roomRepository.save(room);
    }

    public Room updateRoom(Long id, Room updatedRoom) {
        Room room = roomRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Room not found"));

        room.setCategory(updatedRoom.getCategory());
        room.setPrice(updatedRoom.getPrice());
        room.setAvailable(updatedRoom.getAvailable());
        return roomRepository.save(room);
    }

    public void deleteRoom(Long id) {
        roomRepository.deleteById(id);
    }
}