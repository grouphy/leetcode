package MergeK;

public class Test {
    public static void main(String[] args) {
        mergeKLists merge = new mergeKLists();
        ListNode[] lists = {new ListNode(-1)};
        final ListNode listNode = merge.mergeKLists(lists);
    }
}
