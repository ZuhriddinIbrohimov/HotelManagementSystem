package zuhriddinscode.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import zuhriddinscode.category.RoomCategory;
import zuhriddinscode.entity.Room;

import java.util.List;

public interface RoomRepository extends JpaRepository<Room,Long> {

    List<Room> findByCategory(RoomCategory category);
}