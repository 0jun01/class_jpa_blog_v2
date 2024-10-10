package com.tenco.blog_v1.user;

import lombok.Data;

@Data
public class UserDTO {

    @Data
    // 정적 내부 클래스로 모으자
    public static class LoginDTO {
        private String username;
        private String password;
    }

    // 정적 내부 클래스로 모으자
    @Data
    public static class joinDTO {
        private String username;
        private String password;
        private String email;

        public User toEntity() {
            return User.builder()
                    .username(username)
                    .password(password)
                    .email(email)
                    .build();
        }
    }

    @Data
    public static class updateDTO {
        private String password;
        private String email;
    }
}
