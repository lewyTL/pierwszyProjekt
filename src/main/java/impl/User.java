package impl;

public class User {
    private String imie;
    private String nazwisko;


    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public User(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;

    }


}

