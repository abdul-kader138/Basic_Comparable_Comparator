package Basic_Comparable_Comparator;

import java.util.*;

/**
 * Created by Babu on 4/3/2016.
 * Comparable Used for user customized object sorting(User class),It has only one method compareTo()
 * Comparator Used for Type Define data type(Like String) for sorting(User class),It has method compare()
 */
public class Compareable_Compare {
    public static void main(String[] args) throws Exception {

        List<User> lstUser = new ArrayList<User>();
        User user1 = new User();
        user1.setName("A");
        user1.setId(1);
        User user2 = new User();
        user2.setName("C");
        user2.setId(3);
        User user3 = new User();
        user3.setName("B");
        user3.setId(2);
        User user4 = new User();
        user4.setName("F");
        user4.setId(5);
        User user5 = new User();
        user5.setName("E");
        user5.setId(4);
        lstUser.add(user1);
        lstUser.add(user2);
        lstUser.add(user3);
        lstUser.add(user4);
        lstUser.add(user5);
        Collections.sort(lstUser);

        System.out.print(lstUser.get(1).getName());




        //Comparator Start
        List<String> userLst = new ArrayList<String>();
        String A = "a";
        String B = "Z";
        userLst.add(A);
        userLst.add(B);

        Collections.sort(userLst, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
        System.out.println(userLst.get(0));
    }

}
