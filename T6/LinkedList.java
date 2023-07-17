class LinkedList {
    Node head; //链表的头节点
    int size; //链表的长度
  
    //构造方法，初始化为空链表
    public LinkedList() {
      head = null;
      size = 0;
    }
  
    //插入方法，在链表尾部添加一个新节点，并更新size值
    public void insert(CovidVaccine data) {
      Node newNode = new Node(data); //创建一个新节点，并用data初始化
      if (head == null) { //如果链表为空，则新节点就是头节点
        head = newNode;
      } else { //否则遍历到链表尾部，并将新节点连接到最后一个节点后面
        Node current = head; 
        while (current.next != null) { 
          current = current.next; 
        }
        current.next = newNode; 
      }
      size++; //更新size值
     }
  
     //删除方法，在链表中删除指定SID的节点，并更新size值。如果没有找到匹配的SID，则打印提示信息。
     public void delete(int SID) {
       if (head == null) { //如果链表为空，则无法删除任何元素，并打印提示信息。
         System.out.println("The list is empty.");
         return;
       }
       if (head.data.SID == SID) { //如果头节点就是要删除的元素，则将头节点指向下一个节点，并释放原头节点。
         System.out.println("Deleted: " + head.data); 
         head = head.next;
         size--; 
         return;
       }
       Node current = head; 
       while (current.next != null && current.next.data.SID != SID) { 
         current = current.next; 
       }
       if (current.next == null) { 
         System.out.println("No such element with SID: " + SID); 
       } else { 
         current.next = current.next.next;  
         size--;  
       }}
       public void deleteAll() {
        if (head == null) { //如果链表为空，则无需删除任何元素，并打印提示信息。
          System.out.println("The list is already empty.");
          return;
        }
        Node current = head; 
        while (current != null) { //遍历链表，释放每个节点的内存，并打印删除的信息。
          current = current.next; 
        }
        head = null; //将头节点置为空
        size = 0; //将size值置为零
      }
      
      //获取大小方法，返回链表的长度
      public int getSize() {
        return size;
      }
      
      //判断是否为空方法，返回链表是否为空的布尔值
      public boolean isEmpty() {
        return head == null;
      }
      
      //遍历方法，在控制台打印链表中每个节点的数据
      public void traversal() {
        if (head == null) { //如果链表为空，则无法遍历任何元素，并打印提示信息。
          System.out.println("The list is empty.");
          return;
        }
        Node current = head; 
        while (current != null) { //遍历链表，打印每个节点的数据。
          System.out.println(current.data); 
          current = current.next; 
        }
     }
}