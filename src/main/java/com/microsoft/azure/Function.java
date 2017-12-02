package com.microsoft.azure;

import java.util.*;
import com.microsoft.azure.serverless.functions.annotation.*;
import com.microsoft.azure.serverless.functions.*;

/**
 * Azure Functions with HTTP Trigger.
 */
public class Function {
    /**
     * This function listens at endpoint "/api/sort". Two ways to invoke it using "curl" command in bash:
     * 1. curl -d "HTTP Body" {your host}/api/sort
     * 2. curl {your host}/api/hello?name=HTTP%20Query
     */
    @FunctionName("sort")
    public HttpResponseMessage<String> sort(
            @HttpTrigger(name = "req", methods = { "get",
                    "post" }, authLevel = AuthorizationLevel.ANONYMOUS) HttpRequestMessage<Optional<String>> request,
            final ExecutionContext context) {
        context.getLogger().info("Java HTTP trigger processed a request.");

        // Parse query parameter
        String query = request.getQueryParameters().get("lists");
        String list = request.getBody().orElse(query);

        if (list == null) {
            return request.createResponse(400, "Please pass a list on the query string or in the request body");
        } else {
            return request.createResponse(200, "Sorted List: " + Sorted(list));
        }
    }

    /**
     * Bubble sort function
     * @param   numbers a string of numbers e.g. "3,1,6"
     * @return          a sorted string e.g. "[1,2,6]"
     */
    public String ort(String numbers) {
        int[] intArray = Arrays.stream(numbers.split(",")).mapToInt(Integer::parseInt).toArray();
        int n = intArray.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (intArray[j - 1] > intArray[j]) {
                    // swap the elements!
                    temp = intArray[j - 1];
                    intArray[j - 1] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
        return Arrays.toString(intArray);
    }

}
