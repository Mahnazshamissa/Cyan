
public enum CustomHttpStatus {

    SUCCESS(200, "OK"),
    REDIRECTION(301, "Moved Permanently"),
    CLIENT_ERROR(404, "Not Found"),
    SERVER_ERROR(500, "Internal Server Error");



    public static CustomHttpStatus valueOf(int statusCode) {
        for (CustomHttpStatus status : values()) {
            if (status.value == statusCode) {
                return status;
            }
        }
        throw new IllegalArgumentException("This page returned a " + statusCode + " status code.");
    }


    private final int value;
    private final String reasonPhrase;


    private CustomHttpStatus(int value, String reasonPhrase){
        this.value = value;
        this.reasonPhrase = reasonPhrase;
    }

    /**
     * Return the integer value of this status code.
     */
    public int value(){
        return this.value;
    }

    /**
     * Return the reason phrase of this status code.
     */
    public String getReasonPhrase(){
        return reasonPhrase;
    }


    /**
     * Return a string representation of this status code.
     */
    @Override
    public String toString(){
        return Integer.toString(value);
    }

}
