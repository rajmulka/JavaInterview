package BasicProgrammingConcepts;

public class InterviewQuestion {

        int id;
        String name;

        void display(){
            System.out.println(id+" "+name);
        }

        public static void main(String args[]){
            InterviewQuestion s1=new InterviewQuestion();
            InterviewQuestion s2=new InterviewQuestion();
            s1.display();
            s2.display();
        }
    }


