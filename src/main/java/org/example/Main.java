package org.example;

import org.apache.commons.lang3.StringUtils;

public class Main {

    private static Employee[] employees = new Employee[6];



    public static void main(String[] args) {

        employees[0] = new Employee("Иванов Иван Иванович", 50000, 1);
        employees[1] = new Employee("Петров Сергей Александрович", 85000, 3);
        employees[2] = new Employee("Стрельченко Анна Олеговна", 100000, 3);
        employees[3] = new Employee("Медведев 45 Кирилл Ивановнич", 17000, 5);
        employees[4] = new Employee("Кирова Елизавета Олеговна", 65000, 4);
        employees[5] = new Employee("Самойлова Дарья Аретмовна", 82000, 2);

        for (int i=0;i<employees.length;i++){
            if(StringUtils.isAlphaSpace(String.valueOf(employees[i].getName()))) {
                System.out.println(StringUtils.upperCase((String.valueOf(employees[i].getName()))));
            }else {
                throw new RuntimeException("400 Bad Request");
            }

        }
    }
}
