package ueb01;

import java.util.NoSuchElementException;

class CharStackImpl implements CharStack {
    private Element top;
    private int counterPush = 0;
    private int counterPop = 0;

    @Override
    public void push(char c) {

        if (top == null){
        top = new Element(c, null);
        counterPush++;
        return;

        } else{
            Element copyTop = top;
            top = new Element(c,copyTop );
            counterPush++;
        }



    }

    @Override
    public char pop() {
        Element copyTop;
        if (top == null){
            throw new NoSuchElementException();
        }else {
            copyTop = top;
            top = top.next;
            counterPop++;

        }

        return copyTop.value;

    }

    @Override
    public int size() {
        return (counterPush - counterPop);
    }
}
