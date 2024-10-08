package com.tenco.blog_v1.board;

import com.tenco.blog_v1.user.User;
import lombok.Data;

@Data
public class BoardDTO {

    @Data
    public static class SaveDTO {
        private String title;
        private String content;

        public Board toEntity(User user) {
            return Board.builder()
                    .title(title)
                    .content(content)
                    .user(user)
                    .build();
        }
    }

    @Data
    public static class UpdateDTO {
        private String username;
        private String title;
        private String content;

        public Board toEntity(UpdateDTO UpdateDTO) {
            return Board.builder()
                    .title(title)
                    .content(content)
                    .build();
        }
    }

}
