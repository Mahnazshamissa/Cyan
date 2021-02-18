
public class CustomServerErrorException {
    private int code;
    private CustomHttpStatus status;


    public CustomServerErrorException(int code, CustomHttpStatus status){

        this.code = code;
        this.status = status;
    }


    public int getCode(){
        return code;
    }

    public CustomHttpStatus getStatus(){
        return status;
    }

}

