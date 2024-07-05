package code.with.vanilson.studentmanagement.common.exception;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * ErrorResponse
 *
 * @author vamuhong
 * @version 1.0
 * @since 2024-07-05
 */
@Getter
@Setter
@JsonPropertyOrder(value = {"message", "errorCode", "zone", "path", "status", "timestamp"})
public class ErrorResponse {
    private String message;
    private String errorCode;
    private String zone;
    private String path;
    private int status;
    private LocalDateTime timestamp;

    private ErrorResponse() {
    }

    public ErrorResponse(String message, String errorCode, String zone, String path, int status,
                         LocalDateTime timestamp) {
        this.message = message;
        this.errorCode = errorCode;
        this.zone = zone;
        this.path = path;
        this.status = status;
        this.timestamp = timestamp;
    }
}