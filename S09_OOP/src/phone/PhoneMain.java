package phone;

public class PhoneMain {

    public static void main (String[] args){
        Phone phone = new Phone("Nokia 3310");
        System.out.println(phone.getModel());
        phone.features();
        Samsung samsungNote8 = new Samsung("Note 8");
        System.out.println(samsungNote8.getModel());
        samsungNote8.features();

        //Phone 은 SamsungNote8을 자식으로 갖고 있기 떄문에 아래와 같이 초기화 해줄 수 있다.
        Phone note8 = new Samsung("Note 8");
        System.out.println(note8.getModel());
        //이 경우 SamsungNote8 의 feature method 를 calling
        note8.features();

        Phone nokia3310 = new Nokia("Nokia 3310");
        //Nokia3310 은 getModel 과 features method가 없지만 부모가 가지고 있기 떄문에 자동으로 이 메소드를 calling 한다.
        System.out.println(nokia3310.getModel());
        nokia3310.features();

        Phone nokia3320 = new PhoneMain().phone(1);
        System.out.println(nokia3320.getModel());
        nokia3320.features();

        Phone note5 = new PhoneMain().phone(2);
        System.out.println(note5.getModel());
        note5.features();

    }

    static public Phone phone (int dailyDriver){
        switch (dailyDriver){
            case 1 :
                return new Nokia("3320");
            case 2 :
                return new Samsung("Note 5");
        }
        return null;
    }
}
