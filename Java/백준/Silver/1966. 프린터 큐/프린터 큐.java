import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tcCount = Integer.parseInt(br.readLine());
        for (int i = 0; i < tcCount; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int count = Integer.parseInt(st.nextToken());
            int index = Integer.parseInt(st.nextToken());

            HashSet<Integer> nums = new HashSet<>();
            HashMap<Integer, Integer> numMap = new HashMap<>();

            StringTokenizer numSt = new StringTokenizer(br.readLine());
            Item head = new Item(Integer.parseInt(numSt.nextToken()));
            Item tail = head;
            head.target = 0 == index;

            nums.add(head.priority);
            numMap.put(head.priority, numMap.getOrDefault(head.priority, 0) + 1);

            for (int j = 1; j < count; j++) {
                Item item = new Item(Integer.parseInt(numSt.nextToken()));
                item.target = j == index;
                tail.next = item;
                item.pre = tail;
                tail = item;

                nums.add(item.priority);
                numMap.put(item.priority, numMap.getOrDefault(item.priority, 0) + 1);
            }

            int step = 0;
            Item currentItem = head;
            Integer[] numArr = nums.toArray(new Integer[0]);
            Arrays.sort(numArr);
            int arrIndex = numArr.length - 1;
            int maxNum = numArr[arrIndex];

            while (true) {
                if (currentItem.priority < maxNum) {
                    Item tmp = currentItem.next;
                    currentItem.next.pre = null;
                    currentItem.next = null;
                    currentItem.pre = tail;
                    tail.next = currentItem;
                    tail = currentItem;

                    currentItem = tmp;
                } else {
                    step ++;
                    if (currentItem.target) break;
                    /*if (currentItem.next == null) {
                        break;
                    }*/
                    Item tmpNext = currentItem.next;
                    currentItem.next.pre = null;
                    currentItem.next = null;
                    numMap.put(currentItem.priority, numMap.get(currentItem.priority) - 1);
                    int l = numMap.get(currentItem.priority);
                    if (l < 1) {
                        maxNum = numArr[--arrIndex];
                    }
                    currentItem = tmpNext;
                }
            }

            bw.write(Integer.toString(step));
            bw.write('\n');
        }

        bw.flush();
    }
}

class Item {
    boolean target = false;
    int priority;
    Item pre;
    Item next;

    Item(int priority) {
        this.priority = priority;
    }

    void addItem(Item item) {
        if (item.priority > priority) {
            item.next = this;
            pre = this;
        } else if (item.priority == priority) {
            if (next != null) {
                next.addItem(item);
            } else {
                item.pre = this;
                next = item;
            }
        }

    }
}
