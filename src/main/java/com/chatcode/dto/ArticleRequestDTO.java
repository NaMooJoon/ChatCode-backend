package com.chatcode.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class ArticleRequestDTO {

@Data
    public static class ArticleCreateRequestDTO {
        //content
        @NotNull
        @NotEmpty
        @Size(max = 10_000)
        private String contentText;

        //article
        @Size(max = 10)
        @NotNull
        @NotEmpty
        private String title;
    }

@Data
    public static class ArticleUpdateRequestDTO {
        //content
        @NotNull
        @NotEmpty
        @Size(max = 10_000)
        private String contentText;
        private int contentId;

        //article
        @Size(max = 100)
        @NotNull
        @NotEmpty
        private String title;

    }

}
