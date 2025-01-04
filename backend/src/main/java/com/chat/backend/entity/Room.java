package com.chat.backend.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import com.chat.backend.entity.Message;
import java.util.ArrayList;
import java.util.List;


@Document( collation = "rooms" )
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Room {
    private String id;
    private String roomId;
    private List<Message> messages = new ArrayList<>();

}
