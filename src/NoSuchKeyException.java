public class NoSuchKeyException extends Exception {
    public String errMsg;

    public NoSuchKeyException(String errMsg) {
        this.errMsg = errMsg;
    }

    public String getErrMsg() {
        return this.errMsg;
    }
}
