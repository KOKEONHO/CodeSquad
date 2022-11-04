package precourse.week_01.mission02.question02;

public class Human {

    private String name;
    private int age;
    private Character gender;   // F or M
    private boolean marriage;   // true or false
    private int childrenCnt;

    // toString을 사용하기 위해 필요한 변수
    private String genderStr;
    private String marriageStr;

    Human(String name, int age, Character gender, boolean marriage, int childrenCnt) {  // 생성자
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.marriage = marriage;
        this.childrenCnt = childrenCnt;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        if (gender == 'M') {
            return "남성";
        }
        return "여성";
    }

    public String getMarriage() {
        if (marriage) {
            return "기혼자";
        }
        return "미혼자";
    }

    public int getChildrenCnt() {
        return childrenCnt;
    }

    // else문을 사용하지 않기 위해 만든 메서드
    public void setGenderStr() {
        if(gender=='F') {
            genderStr="여성";
            return;
        }
        genderStr="남성";
    }

    public void setMarriageStr() {
        if(marriage) {
            marriageStr = "기혼자";
            return;
        }
        marriageStr = "미혼자";
    }

    @Override
    public String toString() {
        
    }
}
