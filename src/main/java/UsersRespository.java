
import impl.User;

    public interface  UsersRespository {
        User createUser(String imie, String nazwisko);
        User readUser(String imie,String nazwisko);
        boolean deleteUser(User,user);
        boolean updatUser(User,user)

}
