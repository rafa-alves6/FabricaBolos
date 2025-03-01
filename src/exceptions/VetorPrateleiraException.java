public class VetorPrateleiraException extends RuntimeException {

  private String message;

  public VetorPrateleiraException(String message) {
        setMessage(message);
  }

  @Override
  public String getMessage() {
      return this.message;
  }

  public void setMessage(String message) {
      this.message = message;
  }

  @Override
  public String toString() {
    return "VetorPrateleiraException[" + getMessage() + "]";
  }
}
