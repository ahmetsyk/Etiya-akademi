package com.etiya.kodlamaiodevs.business.requests;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateSubLanguageResponse {
    private String name;
    private int languageId;
}
