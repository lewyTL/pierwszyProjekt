package api;

public class UserRepositoryImpl implements UsersRespository {
    public User createUser(String imie,String nazwisko) {
        User user = new User(imie, nazwisko);

    }


}
