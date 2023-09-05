package com.r00ta.maas.api.models.responses.base;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import java.math.BigInteger;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(name = "ObjectReference")
public abstract class BaseResponse {

    @JsonProperty("kind")
    @Schema(
            description = "The kind (type) of this resource")
    private final String kind;

    @JsonProperty("id")
    @Schema(
            description = "The unique identifier of this resource")
    protected Long id;


    @JsonProperty("href")
    @Schema(
            description = "The URL of this resource, without the protocol",
            example = "example.com/resource")
    protected String href;

    protected BaseResponse(String kind) {
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    public Long getId() {
        return id;
    }

    public String getHref() {
        return href;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setHref(String href) {
        this.href = href;
    }
}