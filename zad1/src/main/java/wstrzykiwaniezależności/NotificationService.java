package wstrzykiwaniezależności;

public class NotificationService {

    private TxtFileService fileService = new TxtFileService();

    public String getNotification(){
        String s = fileService.readFileContent();

        return "notyfication".concat(s);
    }
}
