package com.fsb.greeting.web.models.requests;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PersonForm {
   // @NotBlank (message="Veuillez saisir votre nom")
    @NotBlank ()
    @Size(min=3, max=30)
    String name;

    @Min(2)@Max(99)
    short age;
    String photo;
}