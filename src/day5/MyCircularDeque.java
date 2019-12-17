package day5;
//设计实现双端队列。
//你的实现需要支持以下操作： 
//
// 
// MyCircularDeque(k)：构造函数,双端队列的大小为k。 
// insertFront()：将一个元素添加到双端队列头部。 如果操作成功返回 true。 
// insertLast()：将一个元素添加到双端队列尾部。如果操作成功返回 true。 
// deleteFront()：从双端队列头部删除一个元素。 如果操作成功返回 true。 
// deleteLast()：从双端队列尾部删除一个元素。如果操作成功返回 true。 
// getFront()：从双端队列头部获得一个元素。如果双端队列为空，返回 -1。 
// getRear()：获得双端队列的最后一个元素。 如果双端队列为空，返回 -1。 
// isEmpty()：检查双端队列是否为空。 
// isFull()：检查双端队列是否满了。 
// 
//
// 示例： 
//
// MyCircularDeque circularDeque = new MycircularDeque(3); // 设置容量大小为3
//circularDeque.insertLast(1);			        // 返回 true
//circularDeque.insertLast(2);			        // 返回 true
//circularDeque.insertFront(3);			        // 返回 true
//circularDeque.insertFront(4);			        // 已经满了，返回 false
//circularDeque.getRear();  				// 返回 2
//circularDeque.isFull();				        // 返回 true
//circularDeque.deleteLast();			        // 返回 true
//circularDeque.insertFront(4);			        // 返回 true
//circularDeque.getFront();				// 返回 4
//  
//
// 
//
// 提示： 
//
// 
// 所有值的范围为 [1, 1000] 
// 操作次数的范围为 [1, 1000] 
// 请不要使用内置的双端队列库。 
// 
// Related Topics 设计 队列


//leetcode submit region begin(Prohibit modification and deletion)
class MyCircularDeque {

    int[] dQueue;  // 双端队列
    int head;      // 队头指针
    int tail;      // 队尾指针
    int length;    // 当前队列长度
    int maxLength; // 队列最大长度

    /**
     * Initialize your data structure here. Set the size of the deque to be k.
     */
    public MyCircularDeque(int k) {
        this.dQueue = new int[k];
        this.head = 0;
        this.tail = 0;
        this.length = 0;
        this.maxLength = k;
    }

    /**
     * Adds an item at the front of Deque. Return true if the operation is successful.
     */
    public boolean insertFront(int value) {

        if (head == tail && length == maxLength) {
            return false;
        } else {
            head = (head + maxLength - 1) % maxLength;
            dQueue[head] = value;
            length++;
            return true;
        }
    }

    /**
     * Adds an item at the rear of Deque. Return true if the operation is successful.
     */
    public boolean insertLast(int value) {

        if (head == tail && length == maxLength) {
            return false;
        } else {
            dQueue[tail] = value;
            tail = (tail + 1 + maxLength) % maxLength;
            length++;
            return true;
        }
    }

    /**
     * Deletes an item from the front of Deque. Return true if the operation is successful.
     */
    public boolean deleteFront() {

        if (head == tail && length == 0) {
            return false;
        } else {
            head = (head + 1 + maxLength) % maxLength;
            length--;
            return true;
        }
    }

    /**
     * Deletes an item from the rear of Deque. Return true if the operation is successful.
     */
    public boolean deleteLast() {

        if (head == tail && length == 0) {
            return false;
        } else {
            tail = (tail - 1 + maxLength) % maxLength;
            length--;
            return true;
        }
    }

    /**
     * Get the front item from the deque.
     */
    public int getFront() {

        if (head == tail && length == 0) {
            return -1;
        } else {
            return dQueue[head];
        }
    }

    /**
     * Get the last item from the deque.
     */
    public int getRear() {

        if (head == tail && length == 0) {
            return -1;
        } else {
            return dQueue[(tail - 1 + maxLength) % maxLength];
        }
    }

    /**
     * Checks whether the circular deque is empty or not.
     */
    public boolean isEmpty() {

        return head == tail && length == 0;
    }

    /**
     * Checks whether the circular deque is full or not.
     */
    public boolean isFull() {

        return head == tail && length == maxLength;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */
//leetcode submit region end(Prohibit modification and deletion)
