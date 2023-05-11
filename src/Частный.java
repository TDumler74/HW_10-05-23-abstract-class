public class Частный extends Dom {

  public Частный(String adress) {
    super(adress);
  }

  @Override
  public String toString() {
    return "\nЧастный дом по адресу "+getAdress();
  }
}
