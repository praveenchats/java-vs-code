class Student {
    int roll = 10;
    String name = "praveen";

    Student() {
        System.out.println(roll);
        this.roll = roll;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
    }
}