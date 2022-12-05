public class Main {
    public static void main(String[] args) {
        ITelephone timsPhone;
        timsPhone = new DeskPhone(123456);
        timsPhone.callPhone(123456);
        timsPhone.answer();
        timsPhone.dial(123);
        timsPhone.powerOn();


        timsPhone = new MobilePhone(24565);
        // timsPhone.powerOn();
        timsPhone.callPhone(24565);
        timsPhone.answer(); 
    }
}