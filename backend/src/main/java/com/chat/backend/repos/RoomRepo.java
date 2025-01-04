package com.chat.backend.repos;

import com.chat.backend.entity.Room;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoomRepo extends MongoRepository<Room, String> {
    Room findRoomId(String roomId);

}
