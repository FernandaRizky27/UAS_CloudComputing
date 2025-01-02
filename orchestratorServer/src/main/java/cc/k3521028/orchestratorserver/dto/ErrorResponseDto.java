package cc.k3521028.orchestratorserver.dto;

public class ErrorResponseDto {
    private String error;
    private String details;

    public ErrorResponseDto(String error, String details) {
        this.error = error;
        this.details = details;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}

