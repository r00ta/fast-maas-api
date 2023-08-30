package maas.r00ta.com.api;

import jakarta.inject.Inject;
import jakarta.validation.Valid;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import maas.r00ta.com.Constants;

import maas.r00ta.com.api.models.requests.QueryPageInfo;
import maas.r00ta.com.api.models.responses.MachineListResponse;
import maas.r00ta.com.api.models.responses.MachineSummaryResponse;
import maas.r00ta.com.models.ListResult;
import maas.r00ta.com.services.MachineService;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;

import java.util.stream.Collectors;


@Tag(name = "Machines", description = "The API that allow the user to retrieve Machine instances.")
@Path(Constants.V3_API_BASE_PATH + "/machines")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class MachinesAPI {

    @Inject
    MachineService machineService;

    @APIResponses(value = {
            @APIResponse(description = "Success.", responseCode = "200",
                    content = @Content(mediaType = MediaType.APPLICATION_JSON, schema = @Schema(implementation = MachineListResponse.class))),
            @APIResponse(description = "Bad request.", responseCode = "400", content = @Content(mediaType = MediaType.APPLICATION_JSON)),
            @APIResponse(description = "Unauthorized.", responseCode = "401", content = @Content(mediaType = MediaType.APPLICATION_JSON)),
            @APIResponse(description = "Forbidden.", responseCode = "403", content = @Content(mediaType = MediaType.APPLICATION_JSON)),
            @APIResponse(description = "Not found.", responseCode = "404", content = @Content(mediaType = MediaType.APPLICATION_JSON)),
            @APIResponse(description = "Internal error.", responseCode = "500", content = @Content(mediaType = MediaType.APPLICATION_JSON))
    })
    @Operation(summary = "Get the list of Machine instances", description = "Get the list of Machine instances.")
    @GET
    public Response list(@Valid @BeanParam QueryPageInfo queryPageInfo) {
        ListResult<MachineSummaryResponse> machines = machineService.list(queryPageInfo);
        return Response.ok(machines).build();
    }
}
