public class Student_tree {
        class Student{
                int id;
                String Stu_name;
                int marks_sub1;
                int marks_sub2;
                int marks_sub3;
                Student left,right;
                Student(int d,String name,int m1,int m2,int m3){
                        id = d;
                        Stu_name = name;
                        marks_sub1 = m1;
                        marks_sub2 = m2;
                        marks_sub3 = m3;
                        left = right = null;
                }
        }
        Student head;
        static boolean flag = true;
        public void insert_details(int id,String name,int m1,int m2,int m3){
                Student n_1 = new Student(id,name,m1,m2,m3);
                float avg = (n_1.marks_sub1+n_1.marks_sub2+n_1.marks_sub3)/3;
                if(head==null){
                        head = n_1;
                }
                else{
                        Student t_1 = head;
                        while(t_1!=null){
                                //System.out.println(t_1.id);
                                if((t_1.marks_sub1+t_1.marks_sub2+t_1.marks_sub3)/3<avg){
                                        if(t_1.left==null){
                                              t_1.left = n_1;
                                              break;  
                                        }
                                        t_1 = t_1.left;
                                }
                                else{
                                        if(t_1.right==null){
                                                t_1.right = n_1;
                                                break;
                                        }
                                        t_1 = t_1.right;
                                }
                        }
                }
        }
        public void display_records(String Name){
                Student G_1 = head;
                flag = true;
                inorder_display(Name,G_1);
                if(flag){
                        System.out.println("Record not found");
                }
        }
        public void inorder_display(String Name, Student root){
                if(root == null){
                        return;
                }
                inorder_display(Name, root.left);
                if(root.Stu_name == Name){
                        //System.out.println("Found "+Name);
                        System.out.println("Name "+root.Stu_name);
                        System.out.println("Marks in 1st Subject "+root.marks_sub1);
                        System.out.println("Marks in 2nd Subject "+root.marks_sub2);
                        System.out.println("Marks in 3rd Subject "+root.marks_sub3);
                        System.out.println("Percentage "+((root.marks_sub1+root.marks_sub2+root.marks_sub3)/3)+" %"); 
                        flag = false;
                        return;
                }
                inorder_display(Name, root.right);
        }
        public static void main(String args[]){
                Student_tree s_t = new Student_tree();
                s_t.insert_details(10,"Saurav",78,87,84);
                s_t.insert_details(20,"Pinaki",60,72,75);
                s_t.insert_details(5,"Ankit",83,87,82);
                s_t.insert_details(24,"Akshay",75,71,82);
                s_t.display_records("Saurav");
                s_t.display_records("Ankit");
                s_t.display_records("Sumit");
        }
}
