class LinkedList{
        class Node{
                int id;
                Node next;

                Node(int d){
                        id = d; next = null;
                }
        }
        Node head;
        void insert_beg(int number){
                Node n1 = new Node(number);
                n1.next = head;
                head = n1;
        }
        void display(){
                Node t = head;
                while(t!=null){
                        System.out.println(t.id);
                        t = t.next;
                }
        }
        void insert_after(int number){
                Node t = head;
                while(t.next != null){
                        t = t.next;
                }
                Node m = new Node(number);
                t.next = m;
                m.next = null;
        }
        public static void main(String args[]){
                LinkedList l1 = new LinkedList();
                l1.insert_beg(10);
                l1.insert_beg(20);
                l1.insert_beg(30);
                l1.insert_beg(60);
                l1.insert_beg(32);
                l1.insert_after(56);
                l1.insert_after(45);
                // l1.delete_beg()
                // l1.display();
        }
}