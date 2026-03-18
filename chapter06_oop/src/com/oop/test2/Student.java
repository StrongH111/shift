package com.oop.test2;

public class Student {
    /*    1)定义类Student，包含三个属性:学号number(int),年级state(int)，成绩score(int).
          2)创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
            问题一:打印出3年级(state值为3)的学生信息。
            问题二:使用冒泡排序按学生成绩排序，并遍历所有学生信息
            提示:
                1)生成随机数:Math.random()，返回值类型double;
                2)四舍五入取整:Math.round(doubled)，返回值类型long
                年级[1,6] : (int) (Math.random() * 6 + 1)
                分数[0,100] :(int) (Math.random() * 101)*/
    int number;
    int state;
    int score;

    public static void main(String[] args) {
        Student students[] = new Student[20];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            students[i].number = i + 1;
            students[i].state = (int) (Math.random() * 6 + 1);
            students[i].score = (int) (Math.random() * 101);
            System.out.println("学号" + students[i].number + " 年级" + students[i].state + " 成绩" + students[i].score);
        }
        Student st = new Student();
        System.out.println("=====================================");
/*        st.print(students,3);
        System.out.println("=====================================");
        st.bubbleSort(students);
        System.out.println();*/
        st.sort(students, "asc");
        System.out.println("=====================================");
        st.sort(students, "desc");
    }


    public void print(Student students[], int grade) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].state == grade) {
                System.out.println("学号" + students[i].number + " 年级" + students[i].state + " 成绩" + students[i].score);
            }
        }
    }

    public void bubbleSort(Student students[]) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1; j++) {
                if (students[j].score > students[j + 1].score) {
                    Student temp;
                    temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < students.length; i++) {
            System.out.println("学号" + students[i].number + " 年级" + students[i].state + " 成绩" + students[i].score);

        }
    }

    public void sort(Student students[], String type) {
        if ("asc".equals(type)) {
            for (int i = 0; i < students.length - 1; i++) {
                for (int j = 0; j < students.length - 1- i; j++) {
                    if (students[j].score > students[j + 1].score) {
                        Student temp;
                        temp = students[j];
                        students[j] = students[j + 1];
                        students[j + 1] = temp;
                    }
                }
            }
        } else if ("desc".equals(type)) {
            for (int i = 0; i < students.length - 1; i++) {
                for (int j = 0; j < students.length - 1-i; j++) {
                    if (students[j].score < students[j + 1].score) {
                        swap(students,j,j+1);

                    }
                }
            }

        } else {
            System.out.println("你输入的信息有误");
        }
        for (int i = 0; i < students.length; i++) {
            System.out.println("学号" + students[i].number + " 年级" + students[i].state + " 成绩" + students[i].score);

        }
    }
    public void swap(Student students[], int i, int j) {
        Student temp;
        temp = students[i];
        students[i] = students[j ];
        students[j] = temp;
    }
}
