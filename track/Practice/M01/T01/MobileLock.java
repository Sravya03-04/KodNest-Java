class Mobile {
    void password(String s) {
        System.out.println("password is set");
    }

    void pin(int p) {
        System.out.println("pin is set");
    }

    class faceId {

    }

    class fingerPrint {

    }

    class pattern {

    }
}

public class MobileLock {
    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.password("12345678");
        m.pin(1234);
        faceId f = new faceId();
        fingerPrint fp = new fingerPrint();
        pattern pt = new pattern();
        m.faceId();
        m.fingerPrint();
        m.pattern();
    }

}
