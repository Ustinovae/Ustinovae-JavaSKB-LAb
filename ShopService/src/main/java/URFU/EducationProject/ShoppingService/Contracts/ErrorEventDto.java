package URFU.EducationProject.ShoppingService.Contracts;

public class ErrorEventDto {
    private String errorType;
    private String description;

    public ErrorEventDto(String errorType, String description){
        this.errorType = errorType;
        this.description = description;
    }

    public String getErrorType() {
        return errorType;
    }

    public String getDescription() {
        return description;
    }

    public void setErrorType(String errorType) {
        this.errorType = errorType;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
