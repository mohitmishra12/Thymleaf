package com.Thymleaf;


import lombok.*;

@Data
@Builder
@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@ToString
public class User {

    String name;
    String email;
    Integer mobile;
}
