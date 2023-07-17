class Node {
    CovidVaccine data; //节点存储的数据，是一个CovidVaccine对象
    Node next; //节点指向的下一个节点
  
    //构造方法，根据参数初始化属性
    public Node(CovidVaccine data) {
      this.data = data;
      this.next = null;
    }
  }