import dependency.*;

import java.util.*;

public class Main {
    public int deleteGreatestValue(int[][] grid) {
        for (int[] i : grid) {
            Arrays.sort(i);
        }
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            int mex = 0;
            for (int j = 0; j < grid[0].length; j++) {
                mex = Math.max(mex, grid[i][j]);
            }
            res += mex;
        }
        return res;
    }

    public static int countGoodTriplets(int[] arr, int a, int b, int c) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Math.abs(arr[i] - arr[j]) <= a) {
                    for (int k = j + 1; k < arr.length; k++) {
                        if (Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c) {
                            res++;
                        }
                    }
                }
            }
        }
        return res;
    }

    public  static int[] topKFrequent(int[] nums, int k) {
        SortedMap<Integer, Integer> map = new TreeMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        int[] res = new int[k];
        System.out.println(map.toString());

        return null;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequent(new int[]{5,2,5,3,5,3,1,1,3}, 2)));

    }

    public static int[] nextGreaterElements(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = nums.length - 1; i >= 0; i--) {
            if (stack.size() == 0) {
                list.add(-1);
            } else if (stack.size() > 0 && stack.peek() > nums[i]) {
                list.add(stack.peek());
            } else if (stack.size() > 0 && stack.peek() <= nums[i]) {
                while (!stack.isEmpty() && stack.peek() <= nums[i]) {
                    stack.pop();
                }
                if (stack.size() == 0) {
                    list.add(-1);
                } else {
                    list.add(stack.peek());
                }
            }
            stack.push(nums[i]);
        }
        int[] arr = new int[list.size()];
        int index = list.size() - 1;
        for (int i = 0; i < list.size(); i++) {
            arr[index--] = list.get(i);
        }
        return arr;

    }

    private static ListNode reverseList(ListNode head) {
        if (head == null) return head;
        ListNode node = reverseList(head.next);
        ListNode tail = null;
        if (node != null) {
            node.next = head;
            head.next = null;
            tail = head;
        }
        return head;

    }

}