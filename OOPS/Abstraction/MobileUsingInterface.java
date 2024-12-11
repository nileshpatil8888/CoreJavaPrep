package OOPS.Abstraction;

public interface MobileUsingInterface {

    void call(int number);
    void takePictures();
}

class RealMeMobile implements MobileUsingInterface{

    @Override
    public void call(int number) {
        System.out.println("calling from real me___________");
    }

    @Override
    public void takePictures() {
        System.out.println("taking pictures from real me_____________");
    }
}

class SamsungMobile implements MobileUsingInterface{

    @Override
    public void call(int number) {
        System.out.println("calling from samsung___________");
    }

    @Override
    public void takePictures() {
        System.out.println("taking pictures from samsung_____________");
    }
}

class Samsung {
    public static void main(String[] args) {
        SamsungMobile samsungMobile = new SamsungMobile();
        samsungMobile.call(1234567890);
        samsungMobile.takePictures();

        RealMeMobile realMeMobile = new RealMeMobile();
        realMeMobile.call(231236543);
        realMeMobile.takePictures();
    }
}
