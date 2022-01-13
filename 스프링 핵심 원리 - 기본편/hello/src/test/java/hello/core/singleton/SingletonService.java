package hello.core.singleton;

public class SingletonService {

    // static 영역에 객체를 하나만 생성
    private static final SingletonService instance = new SingletonService();

    // public으로 열어서 객체 인스턴스가 필요하면 static 메서드를 통해서 조회 허용
    public static SingletonService getInstance(){
        return instance;
    }

    // 외부에서 new로 객체 생성 못하게 막음
    private SingletonService(){

    }

    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }

    public static void main(String[] args) {
        SingletonService singletonService1 = new SingletonService();
        SingletonService singletonService2 = new SingletonService();
    }
}
