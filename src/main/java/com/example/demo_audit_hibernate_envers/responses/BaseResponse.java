package com.example.demo_audit_hibernate_envers.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseResponse {
    @JsonProperty("status")
    private Integer status;

    @JsonProperty("messenger")
    private String messenger;
}
