package UTS1;

public class User {
    private UserProfile profile;
    private boolean loggedIn;

    public User(int userId, String password, String name,
                int age, String emailId, String doc) {
        this.profile = new UserProfile(userId, password, name, age, emailId, doc);
        this.loggedIn = false;
    }

    public UserProfile getProfile() {
        return profile;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public boolean logIn(int userId, String password) {
        if (profile.getUserId() == userId && profile.getPassword().equals(password)) {
            loggedIn = true;
            System.out.println("Login berhasil. Selamat datang, " + profile.getName());
            return true;
        }
        System.out.println("Login gagal. User ID atau password salah");
        return false;
    }

    public void recoverPassword() {
        System.out.println("Link pemulihan password dikirim ke " + profile.getEmail());
    }

    public void logOut() {
        loggedIn = false;
        System.out.println(profile.getName() + " telah logout");
    }
}
