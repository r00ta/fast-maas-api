package maas.r00ta.com.api.models.requests;

import jakarta.validation.constraints.Max;
import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.QueryParam;
import jakarta.validation.constraints.Min;

import static maas.r00ta.com.api.APIConstants.*;

public class QueryPageInfo {

    @DefaultValue(PAGE_DEFAULT)
    @Min(PAGE_MIN)
    @QueryParam(PAGE)
    private int pageNumber;
    @DefaultValue(SIZE_DEFAULT)
    @Min(SIZE_MIN)
    @Max(SIZE_MAX)
    @QueryParam(PAGE_SIZE)
    private int pageSize;

    public QueryPageInfo() {
    }

    public QueryPageInfo(int pageNumber, int pageSize) {
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public int getPageSize() {
        return pageSize;
    }

    @Override
    public String toString() {
        return "QueryInfo [pageNumber=" + pageNumber + ", pageSize=" + pageSize + "]";
    }

}