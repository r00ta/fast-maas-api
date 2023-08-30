package maas.r00ta.com.api.models.responses.base;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import maas.r00ta.com.models.ListResult;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import java.util.function.Function;
import java.util.stream.Collectors;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Schema(name = "List",
        allOf = { PagedListResponse.class, ListResponse.class })
public abstract class PagedListResponse<T> extends ListResponse<T> {

    protected PagedListResponse(String kind) {
        super(kind);
    }

    @JsonProperty("page")
    private long page;

    @JsonProperty("size")
    private long size;

    @JsonProperty("total")
    private long total;

    public long getPage() {
        return page;
    }

    public void setPage(long page) {
        this.page = page;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }
}