package enum_exer.exer3;

public enum Season1 implements Info {
    //枚举类的对象声明在枚举类当中，而且必须放在第一行
    SPRING("春天","春暖花开"){
        public void show(){
            System.out.println("春天在哪里？");
        }
    },
    SUMMER("夏天","夏日炎炎"){
        public void show(){
            System.out.println("夏天在哪里？");
        }
    },
    AUTUMN("秋天","秋高气爽"){
        public void show(){
            System.out.println("秋天在哪里？");
        }
    },
    WINTER("冬天","冰天雪地"){
        public void show(){
            System.out.println("冬天在哪里？");
        }
    };
    //声明每个对象拥有的属性：private final修饰
    private final String SEASON_NAME;
    private final String SEASON_DESC;

   private Season1(String SEASON_NAME, String SEASON_DESC) {
        this.SEASON_NAME = SEASON_NAME;
        this.SEASON_DESC = SEASON_DESC;
    }

    public String getSEASON_NAME() {
        return SEASON_NAME;
    }

    public String getSEASON_DESC() {
        return SEASON_DESC;
    }
}
