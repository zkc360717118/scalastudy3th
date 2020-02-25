package list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
    List<String> arrList = new ArrayList<String>();
    List<String> lnkList = new LinkedList<String>();

    void add(List<String> list) {
        list.add("0");
        list.add("1");


        long startTime = System.currentTimeMillis();
        System.out.println("开始的时间：" + startTime);
        for (int i = 0; i < 100000; i++) {
            list.add(2, String.valueOf(i));
        }
        long endTime = System.currentTimeMillis();
        System.out.println("结束的时间：" + endTime);
        System.out.println("总耗时：" + (endTime - startTime));

    }

    @Test
    public void addTimeTest() {

        add(arrList);
        // 开始的时间：1487783199226
        // 结束的时间：1487783199741
        // 总耗时：515

        add(lnkList);
        // 开始的时间：1487783199741
        // 结束的时间：1487783199756
        // 总耗时：15

    }

}
