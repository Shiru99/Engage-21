package ms.engage.myauthenticationservice.Model;

public class CCResponse {
    boolean status;
    String statusMessage;
    
    public CCResponse() { }

    public CCResponse(boolean status, String statusMessage) {
        this.status = status;
        this.statusMessage = statusMessage;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

}
