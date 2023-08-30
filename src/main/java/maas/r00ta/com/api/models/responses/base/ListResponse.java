package maas.r00ta.com.api.models.responses.base;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import maas.r00ta.com.models.ListResult;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class ListResponse<T> {

    protected ListResponse(String kind) {
        this.kind = kind;
    }

    @JsonProperty("kind")
    private final String kind;

    @JsonProperty("items")
    private List<T> items = new ArrayList<>();

    public String getKind() {
        return kind;
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

}