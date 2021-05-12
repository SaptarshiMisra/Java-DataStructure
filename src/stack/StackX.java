package stack;

import java.util.Arrays;

public class StackX {
    private int top;
    private int[] elements;

    //constructor
    public StackX(int size){
        this.elements = new int[size];
        this.top = -1;
    }

    //push
    public boolean push(int item){
        if(top > elements.length){
            // overflow
            return false;
        }else{
            elements[++top] = item;
            return true;
        }
    }

    //pop
    public int pop(){
        return elements[top--]; // read and decrement the top
    }
    //peek
    public int peek(){
        return elements[top]; // read and DONOT decrement the top
    }

    //print the stack for demo
    public String readAndPrintStack(){
        StringBuffer stringBuffer = new StringBuffer("");
        int start = 0;
        if(top >=0){         // at least one item is inserted
            do{
                stringBuffer.append(elements[start++]+" ");
            }while(start <= top);   // reading till the top
        }else{              // initial stack with all zero
            Arrays.stream(elements).forEach(each ->{
                stringBuffer.append(each +" ");
            });
        }
        return stringBuffer.toString();
    }

    //driver code for test
    public static void main(String[] args) {
        StackX app = new StackX(3);
        System.out.println("=== Initial stack ===");
        System.out.println("=== Now stack ==="+app.readAndPrintStack());

        System.out.println("=== Pushed 1 ===");
        app.push(1);
        System.out.println("=== Now stack ==="+app.readAndPrintStack());


        System.out.println("=== Pushed 2 ===");
        app.push(2);
        System.out.println("=== Now stack ==="+app.readAndPrintStack());

        System.out.println("=== Pushed 3 ===");
        app.push(3);
        System.out.println("=== Now stack ==="+app.readAndPrintStack());

        System.out.println("=== Popped 1 time ===");
        app.pop();
        System.out.println("=== Now stack ==="+app.readAndPrintStack());

        System.out.println("=== Popped 2 times ===");
        app.pop();
        System.out.println("=== Now stack ==="+app.readAndPrintStack());

    }

}
