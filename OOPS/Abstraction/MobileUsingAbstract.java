package OOPS.Abstraction;

abstract class Features {

    public abstract void call(int number);

    public abstract void takePicture();
}

class Mobile extends Features{

    @Override
    public void call(int number) {
        System.out.println("calling>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }

    @Override
    public void takePicture(){
        System.out.println("Taking pictures>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }
}

class AndroidMobile{
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        mobile.call(12345678);
        mobile.takePicture();
    }
}