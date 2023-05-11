class Resume{
    private String name; // 姓名
    private String gender; // 性别
    private int age; // 年龄
    private String homeAddress; // 家庭住址
    private String educationBackground; // 学历

    public Resume(String name , String gender , int age , String homeAddress , String educationBackground) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.homeAddress = homeAddress;
        this.educationBackground = educationBackground;
    }

    // getName方法获取姓名
    public String getName() {
        return name;
    }

    // setName方法设置姓名
    public void setName(String name) {
        this.name = name;
    }

    // getGender方法获取性别
    public String getGender() {
        return gender;
    }

    // setGender方法设置性别
    public void setGender(String gender) {
        this.gender = gender;
    }

    // getAge方法获取年龄
    public int getAge() {
        return age;
    }

    // setAge方法设置年龄
    public void setAge(int age) {
        this.age = age;
    }

    // getHomeAddress方法获取家庭住址
    public String getHomeAddress() {
        return homeAddress;
    }

    // setHomeAddress方法设置家庭住址
    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    // getEducationBackground方法获取学历
    public String getEducationBackground() {
        return educationBackground;
    }

    // setEducationBackground方法设置学历
    public void setEducationBackground(String educationBackground) {
        this.educationBackground = educationBackground;
    }
}
