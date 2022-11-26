public class MyException extends Exception{
    public String errMsg;

    public MyException(String errMsg){
        this.errMsg=errMsg;
    }

    public String getErrMsg() {
        return this.errMsg;
    }
}
