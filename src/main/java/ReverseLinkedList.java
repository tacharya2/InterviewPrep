public class ReverseLinkedList {
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode current = head; //1 -> 2 -> 3 -> 4 -> 5 -> null
        ListNode next = null;

        while(current != null){
            next = current.next;  // Save the reference to the rest of the list (2 -> 3 -> 4 -> 5 -> null)
            current.next = prev;  // Point the current node's next to the previous node (null in the first iteration)

            //The above two are responsible for updating the pointer

            prev = current;  // Move prev to the current node (1 in the first iteration)
            current = next;    // Move current to the next node (2 in the first iteration
        }
        return prev;
    }
}
class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}
/*
1 -> 2 -> 3 -> 4 -> 5 -> null

prev = null
current = 1 -> 2 -> 3 -> 4 -> 5 -> null
next = null

1. (current = 1) -> (next = 2 -> 3 -> 4 -> 5 -> null)
   (prev = null)

   1 -> null
   (prev = 1) -> (current = 2 -> 3 -> 4 -> 5 -> null)
   (next = 2 -> 3 -> 4 -> 5 -> null)

2. (current = 2) -> (next = 3 -> 4 -> 5 -> null)
   (prev = 1)

   2 -> 1 -> null
   (prev = 2) -> (current = 3 -> 4 -> 5 -> null)
   (next = 3 -> 4 -> 5 -> null)

3. (current = 3) -> (next = 4 -> 5 -> null)
   (prev = 2 -> 1)

   3 -> 2 -> 1 -> null
   (prev = 3) -> (current = 4 -> 5 -> null)
   (next = 4 -> 5 -> null)

4. (current = 4) -> (next = 5 -> null)
   (prev = 3 -> 2 -> 1)

   4 -> 3 -> 2 -> 1 -> null
   (prev = 4) -> (current = 5 -> null)
   (next = 5 -> null)

5. (current = 5) -> (next = null)
   (prev = 4 -> 3 -> 2 -> 1)

   5 -> 4 -> 3 -> 2 -> 1 -> null
   (prev = 5) -> (current = null)
   (next = null)

 */