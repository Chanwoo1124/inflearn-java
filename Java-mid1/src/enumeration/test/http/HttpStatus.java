package enumeration.test.http;

public enum HttpStatus {
    OK(200,"OK","ture"),
    BAD_REQUEST(400,"Bad Request","false"),
    NOT_FOUND(404,"Not Found","false"),
    INTERNAL_SERVER_ERROR(500,"Internal Server Eroor","false");

    private final int code;
    private final String message;
    private final String issuccess;

    HttpStatus(int code, String message,String issuccess) {
        this.code = code;
        this.message = message;
        this.issuccess = issuccess;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
    public String isSuccess(){
        return issuccess;
    }

    public static HttpStatus findByCode(int httpCodeInput){
        if (httpCodeInput == 200){
            return HttpStatus.OK;
        }else if (httpCodeInput == 400){
            return HttpStatus.BAD_REQUEST;
        } else if (httpCodeInput == 404) {
            return HttpStatus.NOT_FOUND;
        }else if (httpCodeInput == 500){
            return HttpStatus.INTERNAL_SERVER_ERROR;
        }else{
            return null;
        }



    }

}
