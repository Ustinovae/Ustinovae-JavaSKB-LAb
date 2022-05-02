package URFU.EducationProject.TransportService.Contracts;

public class UpgradeEventDto {
    private String message;

    public UpgradeEventDto(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
