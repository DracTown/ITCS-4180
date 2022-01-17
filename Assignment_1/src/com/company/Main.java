// Assignment Name:InclassAssignment1
//Group#20_InClass01.zip


package com.company;

import java.sql.SQLOutput;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Data data = new Data();

        //Question 1 Test case
        /*
        fizzBuzz();
         */

        //Question 2 Test case
        /*
        isEven(0);
        isEven(1);
        isEven(4);
        isEven(5);
         */

        //Question 3 Test case
        /*
        Integer[] numbers={5,25,32,4,5,6,7,8,6,99,30,22};
        System.out.println(getMinimum(numbers));
    */

        //Question 4 Test case
        /*
         getParsedUsers(data.users);
         */

        //Question 5 Test case
        /*
        printUsers_OMN(getParsedUsers(data.users));
         */

        //Question 6 Test case
        /*
         printUsersSortedByAge(getParsedUsers(data.users));
        */

        //Question 7 Test case
        /*
        printUsersOldest10(getParsedUsers(data.users));
         */

        //Question 8 Test case
        /*
        printUserStateStats(getParsedUsers(data.users));
         */

        //Question 9 Test Case

         System.out.println( printUserStateStats(data.words_1,data.words_2));


        //Question 10 Test Case
        /*
         for(int i=0;i<printUserStateStats(getParsedUsers(data.users), getParsedUsers(data.otherUsers)).size();i++) {
          System.out.println(printUserStateStats(getParsedUsers(data.users), getParsedUsers(data.otherUsers)).get(i));
                }
         */

    }

    //Question 1
    public static void fizzBuzz() {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0 && i % 3 != 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(i);
            }
        }
    }

    //Question 2
    public static boolean isEven(Integer num) {
        return num % 2 == 0;
    }

    //Question 3
    public static Integer getMinimum(Integer[] numbers) {
        if (numbers != null) {
            int index = numbers[0];
            for (int i = 0; i < numbers.length - 1; i++) {
                if (index > numbers[i]) {
                    index = numbers[i];

                }
            }
            return index;
        }


        return null;
    }

    //Question 4
    public static ArrayList<User> getParsedUsers(String[] strings) {
        ArrayList<User> users = new ArrayList<>();
        String fname, lname, age, email, gender, city, state;
        for (int i = 0; i < strings.length - 1; i++) {
            String[] result = strings[i].split(",");

            int j = 0;

            User user = new User(result[j], result[j + 1], result[j + 2],
                    result[j + 3], result[j + 4], result[j + 5], result[j + 6]);

            users.add(user);

        }
        return users;

    }


    //Question 5
    public static void printUsers_OMN(ArrayList<User> users) {
        for (int i = 0; i < users.size(); i++) {
            if (
                    users.get(i).getFirstname().charAt(0) == 'O'
                            || users.get(i).getFirstname().charAt(0) == 'M'
                            || users.get(i).getFirstname().charAt(0) == 'N') {
                System.out.println(users.get(i).getFirstname());
            }
        }


    }


    //Question 6
    public static void printUsersSortedByAge(ArrayList<User> users) {

        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
              //  if (Integer.parseInt(o1.getAge()) == Integer.parseInt(o2.getAge())) return 0;


                return Integer.parseInt(o1.getAge()) - Integer.parseInt(o2.getAge());
            }
        });

        for (User user: users){
            System.out.println(user);
        }


    }

    //Question 7
    public static void printUsersOldest10(ArrayList<User> users) {
        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                if (Integer.parseInt(o1.getAge()) == Integer.parseInt(o2.getAge())) return 0;


                return Integer.parseInt(o1.getAge()) < Integer.parseInt(o2.getAge()) ? -1 : 1;
            }
        });
        int i = users.size() - 1;
        for (int k = 0; k < 10; k++) {

            System.out.println(users.get(i));
            --i;

        }
    }

    //Question 8
    public static void printUserStateStats(ArrayList<User> users) {
        Map<String, Integer> myMap = new HashMap<String, Integer>() {

        };
        for (int k = 0; k < users.size(); k++) {
            if (myMap.containsKey(users.get(k).getState())) {
                int count = myMap.get(users.get(k).getState());
                myMap.put(users.get(k).getState(), count + 1);

            } else {
                myMap.put(users.get(k).getState(), 1);
            }

        }
        myMap.forEach((k, v) -> System.out.println(k + ", " + v));

    }

    //Question 9
    public static Set<String> printUserStateStats(String[] listA, String[] listB) {
        Set<String> set = new HashSet<String>();

        for (int i = 0; i < listA.length - 1; i++) {
            for (int j = 0; j < listB.length - 1; j++) {
                if (listB[j].compareTo(listA[i]) == 0) {
                    set.add(listA[i]);
                }


            }

        }


        return set;
    }

    //Question 10
    public static ArrayList<User> printUserStateStats(ArrayList<User> usersA, ArrayList<User> usersB) {
        ArrayList<User> usersCompare = new ArrayList<>();
        for (int i = 0; i < usersA.size() - 1; i++) {
            for (int j = 0; j < usersB.size() - 1; j++) {
                if (usersB.get(j).getFirstname().equals(usersA.get(i).getFirstname()) &&
                        usersB.get(j).getLastname().equals(usersA.get(i).getLastname()) &&
                        usersB.get(j).getAge().equals(usersA.get(i).getAge()) &&
                        usersB.get(j).getEmail().equals(usersA.get(i).getEmail()) &&
                        usersB.get(j).getGender().equals(usersA.get(i).getGender()) &&
                        usersB.get(j).getCity().equals(usersA.get(i).getCity()) &&
                        usersB.get(j).getState().equals(usersA.get(i).getState())
                ) {

                    usersCompare.add(usersA.get(i));
                }


            }
        }
        return usersCompare;

    }


}
