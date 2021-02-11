public class Stack {
    //implementing stack using array
    int array[] = new int[5];
    int top=0;

    boolean push(int x){
        top++;
        x=array[top];
        System.out.printf("Element pushed into stack: " + x);
        return true;
    }

    int peek(){
        System.out.printf("Element to peek: " + array[top]);
        return array[top];
    }

    int pop(){
        int x= array[top--];
        System.out.printf("Element poped out of stack : " + x);
        return x;
    }

    public  void main(String[] args){

            push(10);
            peek();
            pop();
    }

    }
