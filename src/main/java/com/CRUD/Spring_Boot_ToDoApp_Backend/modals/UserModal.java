package com.CRUD.Spring_Boot_ToDoApp_Backend.modals;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserModal {

    private Long UserId;
    private String userName;
}
