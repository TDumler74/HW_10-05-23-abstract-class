public class Многоквартирный extends Dom{
  private int kalichestvoPodezdov;

  public Многоквартирный(String adress,int kalichestvoPodezdov) {
    super(adress);
    this.kalichestvoPodezdov=kalichestvoPodezdov;
  }

  public int getKalichestvoPodezdov() {
    return kalichestvoPodezdov;
  }

  public void setKalichestvoPodezdov(int kalichestvoPodezdov) {
    this.kalichestvoPodezdov = kalichestvoPodezdov;
  }

  @Override
  public String toString() {
    return "\nМногоквартирный dom по адресу " + getAdress()+
        " количество подъездов " + kalichestvoPodezdov ;
  }
}
