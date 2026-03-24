package singleton;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend gf1  = GirlFriend.getInstance();
        GirlFriend gf2  = GirlFriend.getInstance();
        System.out.println(gf1 == gf2);
    }
}
