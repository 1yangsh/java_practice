package lec07.collectionslist02.second;

import java.util.ArrayList;
import java.util.List;

public class ListMain {

    public static void main(String[] args) {

        List<String> aList = new ArrayList<String>();

        aList.add("삼성전자");
        aList.add("현대자동차");
        aList.add("LG전자");
        aList.add("SK하이닉스");

        for (int i = 0; i < aList.size(); i++) {
            System.out.println(aList.get(i));
        }

        // 삭제
        System.out.println(aList.toString());
        aList.remove(1);
        System.out.println(aList.toString());
        aList.remove("LG전자");
        System.out.println(aList.toString());

    }
}
