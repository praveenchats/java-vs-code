//WAP to find out name,current age, prev age and next age. 
class Programme6 {
    public static void main(String[] args) {

        String str = "Praveen kumar";
        int pre_age, next_age, current_age = 22, d, b;
        d = (current_age % 10);
        b = (current_age / 10);

        pre_age = current_age - (b - 1);
        next_age = current_age + (d - 1);

        System.out.println("Name :" + str);
        System.out.println("Current age :" + current_age);
        System.out.println("previos age :" + pre_age);
        System.out.println("next age :" + next_age);

    }
}