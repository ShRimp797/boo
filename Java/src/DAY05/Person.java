package DAY05;

public class Person {
    // 인스턴스 변수
    String name;
    int age;

    // eat 메소드
    public void eat(String menu) {
        System.out.println(menu + "을 먹었습니다.");
    }

    // work 메소드
    public void work(String jobName, int hour) {
        int menu = 10030; // 예시로 시급 설정
        int salary = menu * hour;
        System.out.println(jobName + " 일을 하여");
        System.out.println(salary + "원을 벌었습니다.");
    }
}
